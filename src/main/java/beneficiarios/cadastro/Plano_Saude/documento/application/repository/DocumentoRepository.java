package beneficiarios.cadastro.Plano_Saude.documento.application.repository;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository {
    Documento buscaDocumentoAtravesIdBeneficiario(Long idBeneficiario);
    Documento salva(Documento documento);
}
