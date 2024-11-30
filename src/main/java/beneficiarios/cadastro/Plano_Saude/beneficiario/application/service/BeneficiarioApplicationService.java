package beneficiarios.cadastro.Plano_Saude.beneficiario.application.service;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService{
    private final BeneficiarioRepository beneficiarioRepository;

   @Override
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
       log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
       Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
       log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse
                .builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }

    @Override
    public List<BeneficiarioResponse> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioApplicationService - buscaTodosBeneficiarios ");
        log.info("[finaliza] BeneficiarioApplicationService - buscaTodosBeneficiarios ");
        return null;
    }
}
