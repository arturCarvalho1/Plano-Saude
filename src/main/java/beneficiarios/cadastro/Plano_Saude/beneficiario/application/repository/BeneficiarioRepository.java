package beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.service.BeneficiarioService;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario,String> {
}
