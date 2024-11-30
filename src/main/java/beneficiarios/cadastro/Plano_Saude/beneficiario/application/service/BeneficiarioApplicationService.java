package beneficiarios.cadastro.Plano_Saude.beneficiario.application.service;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BeneficiarioApplicationService implements BeneficiarioService{
    @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
       log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
        BeneficiarioRepository.salva(new Beneficiario(beneficiarioRequest))
       log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return null;
    }
}
