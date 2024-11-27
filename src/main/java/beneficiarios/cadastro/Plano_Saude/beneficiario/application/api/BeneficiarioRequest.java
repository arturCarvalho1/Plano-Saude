package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BeneficiarioRequest {
    @NotBlank
    private String nome;
    private String telefone;
    @NotBlank
    private LocalDate dataNascimento;
}
