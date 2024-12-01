package beneficiarios.cadastro.Plano_Saude.beneficiario.domain;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
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

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "long", name = "idBeneficiario", unique = true, nullable = false, length = 36)
    private Long idBeneficiario;
    @NotBlank
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "beneficiario_id")
    private List<Documento> documentos = new ArrayList<>();

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
            this.dataAtualizacao = LocalDateTime.now();
            this.dataNascimento = beneficiarioRequest.getDataNascimento();
            this.nome = beneficiarioRequest.getNome();
            this.telefone = beneficiarioRequest.getTelefone();
        }
}