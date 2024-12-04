package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DocumentoResponse {
    private Long idBeneficiario;
}
