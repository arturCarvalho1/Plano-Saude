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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
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
        this.nome = nome;
        this.telefone = telefone;
    }

}
