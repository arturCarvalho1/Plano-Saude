package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI{
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse cadastrarBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioController - cadastrarBeneficiario");
        // Lógica para salvar o beneficiário e seus documentos
        BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[finaliza] BeneficiarioController - cadastrarBeneficiario");
        return beneficiarioCriado;
    }

    @Override
    public List<BeneficiarioListResponse> getTodosbeneficiarios() {
        log.info("[inicia] BeneficiarioController - getTodosbeneficiarios");
        List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscaTodosBeneficiarios();
        log.info("[finaliza] BeneficiarioController - getTodosbeneficiarios");
        return beneficiarios;
    }
}
