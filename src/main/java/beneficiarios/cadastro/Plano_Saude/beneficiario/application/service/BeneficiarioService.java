package beneficiarios.cadastro.Plano_Saude.beneficiario.application.service;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.*;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BeneficiarioService {
    void patchAlteraDadosBeneficiario(Long idBeneficiario,Long idDocumento,BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest );
    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
    List<BeneficiarioListResponse> buscaTodosBeneficiarios();
    BeneficiarioDetalhadoResponse buscaBeneficiariosAtravesId(Long idBeneficiario);
    void deletaBeneficiarioById(Long idBeneficiario);
}
