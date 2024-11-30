package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Value
public class DocumentoListResponse {
    private Long idDocumento;
    private String tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;

    public DocumentoListResponse(Documento documento) {
        this.dataInclusao = documento.getDataInclusao();
        this.descricao = documento.getDescricao();
        this.idDocumento = documento.getIdDocumento();
        this.tipoDocumento = documento.getTipoDocumento();

    }
    public static List<DocumentoListResponse> converte(List<Documento> listaDocumentos) {
        return listaDocumentos.stream()
                .map(DocumentoListResponse::new)
                .collect(Collectors.toList());
    }
}
