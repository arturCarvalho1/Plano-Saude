package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class BeneficiarioController implements BeneficiarioAPI{

    @Override
    public BeneficiarioResponse cadastrarBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioController - cadastrarBeneficiario");
        log.info("[finaliza] BeneficiarioController - cadastrarBeneficiario");
        return null;
    }
}
