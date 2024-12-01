package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
