package beneficiarios.cadastro.Plano_Saude.documento.application.service;

import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoDetalhadoResponse;
import beneficiarios.cadastro.Plano_Saude.documento.application.repository.DocumentoRepository;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService{
    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public DocumentoDetalhadoResponse buscaDocumentoAtravesId(Long idBeneficiario) {
        log.info("[inica] DocumentoApplicationService - buscaDocumentoAtravesId");
        Documento documento = documentoRepository.buscaAtravesId(idBeneficiario);
        log.info("[finaliza] DocumentoApplicationService - buscaDocumentoAtravesId");
        DocumentoDetalhadoResponse documentoDetalhadoResponse = new DocumentoDetalhadoResponse(documento);
        return documentoDetalhadoResponse;
    }
}
