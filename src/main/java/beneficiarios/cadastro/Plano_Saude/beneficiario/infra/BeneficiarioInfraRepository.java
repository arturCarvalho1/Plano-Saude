package beneficiarios.cadastro.Plano_Saude.beneficiario.infra;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import beneficiarios.cadastro.Plano_Saude.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.http.HttpStatus;
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

    @Override
    public Beneficiario buscaBeneficiarioAtravesId(Long idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrado!"));
        log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
        return beneficiario;
    }

    @Override
    public void deletaBeneficiario(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - deletaBeneficiario");
        beneficiarioSpringDataJPARepository.delete(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - deletaBeneficiario");

    }
}
