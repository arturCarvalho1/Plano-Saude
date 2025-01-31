package beneficiarios.cadastro.Plano_Saude.documento.application.service;

import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoDetalhadoResponse;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocumentoService {
    DocumentoDetalhadoResponse buscaDocumentoById(Long idBeneficiario);
}
