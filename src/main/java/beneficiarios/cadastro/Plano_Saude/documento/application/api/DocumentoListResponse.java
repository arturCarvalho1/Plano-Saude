package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class DocumentoListResponse {
    private Long idDocumento;
    private String tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;

    public DocumentoListResponse(LocalDateTime dataInclusao, String descricao, Long idDocumento, String tipoDocumento) {
        this.dataInclusao = dataInclusao;
        this.descricao = descricao;
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
    }
}
