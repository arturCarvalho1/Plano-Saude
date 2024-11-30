package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.application.service.DocumentoService;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoResController implements DocumentoAPI{
    private final DocumentoService documentoService;

    @Override
    public DocumentoDetalhadoResponse getBeneficiarioAtravesId(Long idBeneficiario) {
        log.info("[inicia] DocumentoResController - getBeneficiarioAtravesId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        log.info("[finaliza] DocumentoResController - getBeneficiarioAtravesId");
        return null;
    }
}
