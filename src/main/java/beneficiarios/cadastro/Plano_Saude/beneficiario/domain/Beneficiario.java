package beneficiarios.cadastro.Plano_Saude.beneficiario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idBeneficiario;
    @NotBlank
    private String nome;
    private String telefone;
    @NotBlank
    private LocalDate dataNascimento;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    public Beneficiario(LocalDateTime dataAtualizacao, LocalDateTime dataInclusao, LocalDate dataNascimento, UUID idBeneficiario, String nome, String telefone) {
        this.dataAtualizacao = LocalDateTime.now();
        this.dataNascimento = dataNascimento;
        this.idBeneficiario = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
    }
}
