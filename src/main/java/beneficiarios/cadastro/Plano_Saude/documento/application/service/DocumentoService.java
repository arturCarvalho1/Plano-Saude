package beneficiarios.cadastro.Plano_Saude.documento.application.service;

import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoListResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DocumentoService {
    List<DocumentoListResponse> buscaDocumentosPorId(Optional<String> idBeneficiario);
}
