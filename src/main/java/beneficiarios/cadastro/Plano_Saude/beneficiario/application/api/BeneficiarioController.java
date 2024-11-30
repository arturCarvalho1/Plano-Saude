package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.service.BeneficiarioService;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
