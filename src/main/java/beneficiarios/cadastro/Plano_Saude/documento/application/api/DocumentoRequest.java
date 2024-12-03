package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class DocumentoRequest {
    Long idDocumento;
    String tipoDocumento;
    Beneficiario beneficiario;
    String descricao;
}
