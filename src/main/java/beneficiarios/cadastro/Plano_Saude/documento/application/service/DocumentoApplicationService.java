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
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoDetalhadoResponse buscaDocumentoById(Long idBeneficiario) {
        log.info("[inicia] DocumentoApplicationService - buscaDocumentoById");
        Documento documento = documentoRepository.buscaDocumentoAtravesIdBeneficiario(idBeneficiario);
        log.info("[finaliza] DocumentoApplicationService - buscaDocumentoById");
        return new DocumentoDetalhadoResponse(documento);
    }
}
