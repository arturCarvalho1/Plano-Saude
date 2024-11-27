package beneficiarios.cadastro.Plano_Saude.beneficiario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
    @Id
    @Column(name = "idBeneficiario", unique = true, nullable = false, length = 36)
    private String idBeneficiario;
    @NotBlank
    private String nome;
    private String telefone;
    @NotBlank
    private LocalDate dataNascimento;

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
