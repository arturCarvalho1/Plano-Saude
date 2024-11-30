package beneficiarios.cadastro.Plano_Saude.documento.application.service;

import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoDetalhadoResponse;
import beneficiarios.cadastro.Plano_Saude.documento.application.repository.DocumentoRepository;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService{
    @Override
    public DocumentoDetalhadoResponse buscaDocumentoAtravesId(Long idBeneficiario) {
        log.info("[inica] DocumentoApplicationService - buscaDocumentoAtravesId");
        log.info("[finaliza] DocumentoApplicationService - buscaDocumentoAtravesId");
        return null;
    }
}
