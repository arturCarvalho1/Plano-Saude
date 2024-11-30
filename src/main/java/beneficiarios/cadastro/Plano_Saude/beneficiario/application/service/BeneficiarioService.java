package beneficiarios.cadastro.Plano_Saude.beneficiario.application.service;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioListResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiarios();
}
