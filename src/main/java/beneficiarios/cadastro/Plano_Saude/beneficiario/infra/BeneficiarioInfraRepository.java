package beneficiarios.cadastro.Plano_Saude.beneficiario.infra;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository{
     private final BeneficiarioSprigDataJPARepository beneficiarioSprigDataJPARepository;


    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        beneficiarioSprigDataJPARepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> listaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository - listaTodosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSprigDataJPARepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - listaTodosBeneficiarios");
        return todosBeneficiarios;
    }
}
