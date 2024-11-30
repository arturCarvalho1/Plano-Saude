package beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.Optional;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);
    List<Beneficiario> listaTodosBeneficiarios();
}
