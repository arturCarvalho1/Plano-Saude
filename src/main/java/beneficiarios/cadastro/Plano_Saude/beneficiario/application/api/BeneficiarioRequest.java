package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.time.LocalDate;

@Value
public class BeneficiarioRequest {
    @NotBlank
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
}
