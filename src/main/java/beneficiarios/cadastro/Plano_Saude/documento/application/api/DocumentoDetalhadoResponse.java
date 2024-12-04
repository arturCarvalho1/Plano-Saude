package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.Value;

import java.time.LocalDateTime;

@Value
public class DocumentoDetalhadoResponse {
    private Long idBeneficiario;
    private LocalDateTime dataInclusao;
    private String tipoDocumento;
    private String descricao;
    private LocalDateTime dataAtualizacao;



    public DocumentoDetalhadoResponse(Documento documento) {
        this.dataInclusao = documento.getDataInclusao();
        this.idBeneficiario = documento.getIdDocumento();
        this.dataAtualizacao = documento.getDataAtualizacao();
        this.descricao = documento.getDescricao();
        this.tipoDocumento = documento.getTipoDocumento();
    }
}
