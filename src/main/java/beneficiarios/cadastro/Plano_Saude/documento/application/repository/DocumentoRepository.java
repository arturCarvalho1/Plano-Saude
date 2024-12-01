package beneficiarios.cadastro.Plano_Saude.documento.application.repository;

import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoListResponse;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository {
    Documento buscaAtravesId(Long idBeneficiario);
}
