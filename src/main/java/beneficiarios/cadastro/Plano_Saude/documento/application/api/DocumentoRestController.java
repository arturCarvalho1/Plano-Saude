package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoRestController implements DocumentoAPI{
    private final DocumentoService documentoService;

    @Override
    public DocumentoDetalhadoResponse getBeneficiarioById(Long idBeneficiario) {
        log.info("[inicia] DocumentoResController - getBeneficiarioById");
        log.info("[idBeneficiario] {}", idBeneficiario);
        DocumentoDetalhadoResponse documentoDetalhado = documentoService.buscaDocumentoById(idBeneficiario);
        log.info("[finaliza] DocumentoResController - getBeneficiarioById");
        return documentoDetalhado;
    }
}
