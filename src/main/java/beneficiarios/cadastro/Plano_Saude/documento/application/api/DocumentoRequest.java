package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import lombok.Value;

@Value
public class DocumentoRequest {
    private Long idDocumento;
    private String tipoDocumento;
}
