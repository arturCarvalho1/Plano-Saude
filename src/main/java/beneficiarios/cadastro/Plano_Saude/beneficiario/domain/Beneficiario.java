package beneficiarios.cadastro.Plano_Saude.beneficiario.domain;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Beneficiario {
    @Id
    @Column(name = "idBeneficiario", unique = true, nullable = false, length = 36)
    private String idBeneficiario;
    @NotBlank
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "beneficiario_id")
    private List<Documento> documentos = new ArrayList<>();

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Beneficiario(LocalDateTime dataAtualizacao, LocalDateTime dataInclusao, LocalDate dataNascimento, String idBeneficiario, String nome, String telefone) {
        this.dataAtualizacao = LocalDateTime.now();
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.idBeneficiario = UUID.randomUUID().toString();
        this.telefone = telefone;
    }

}