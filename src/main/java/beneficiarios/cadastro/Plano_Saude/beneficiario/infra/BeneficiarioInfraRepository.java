package beneficiarios.cadastro.Plano_Saude.beneficiario.infra;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository{
    private final BeneficiarioSprigDataJPARepository beneficiarioSpringDataJPARepository;


    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        Beneficiario beneficiarioSalvo = beneficiarioSpringDataJPARepository.save(beneficiario); // Salvar corretamente
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiarioSalvo;
    }
    @Override
    public List<Beneficiario> listaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository - listaTodosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - listaTodosBeneficiarios");
        return todosBeneficiarios;
    }
}
