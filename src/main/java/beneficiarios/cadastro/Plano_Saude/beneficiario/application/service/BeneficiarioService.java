package beneficiarios.cadastro.Plano_Saude.beneficiario.application.service;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface BeneficiarioService {
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
