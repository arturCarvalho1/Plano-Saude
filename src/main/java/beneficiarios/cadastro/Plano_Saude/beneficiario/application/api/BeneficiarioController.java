package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.service.BeneficiarioService;
import jakarta.validation.Valid;
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

    @Override
    public BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(Long idBeneficiario) {
            log.info("[inicia] BeneficiarioController - getBeneficiarioAtravesId");
            log.debug("[idBeneficiario] {}", idBeneficiario);
        BeneficiarioDetalhadoResponse beneficiarioDetalhado = beneficiarioService.buscaBeneficiariosAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioController - getBeneficiarioAtravesId");
        return beneficiarioDetalhado;
        }

    @Override
    public void deletaBeneficiarioById(Long idBeneficiario) {
        log.info("[inicia] BeneficiarioController - deletaBeneficiarioById");
        log.info("[idBeneficiario] {}", idBeneficiario);
        beneficiarioService.deletaBeneficiarioById(idBeneficiario);
        log.info("[finaliza] BeneficiarioController - deletaBeneficiarioById");

    }

    @Override
    public void patchAlteraDadosBeneficiario(Long idBeneficiario, Long idDocumento, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioController - patchAtualizaBeneficiario");
        log.info("[idBeneficiario] {}", idBeneficiario);
        beneficiarioService.patchAlteraDadosBeneficiario(idBeneficiario, idDocumento, beneficiarioAlteracaoRequest);
        log.info("[finaliza] BeneficiarioController - patchAtualizaBeneficiario");
    }
}
