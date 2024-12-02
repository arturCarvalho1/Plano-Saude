package beneficiarios.cadastro.Plano_Saude.beneficiario.infra;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioSprigDataJPARepository extends JpaRepository<Beneficiario,Long > {
}
