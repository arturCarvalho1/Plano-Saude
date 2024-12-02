package beneficiarios.cadastro.Plano_Saude.beneficiario.application.service;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioDetalhadoResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioListResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioResponse;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.repository.BeneficiarioRepository;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import beneficiarios.cadastro.Plano_Saude.documento.application.repository.DocumentoRepository;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;
    private final DocumentoRepository documentoRepository;


    @Override
    @Transactional
    public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
        // Criando e salvando o beneficiário
        Beneficiario beneficiario = new Beneficiario(beneficiarioRequest);
        beneficiario.setDataInclusao(Timestamp.valueOf(LocalDateTime.now()));
        beneficiario.setDataAtualizacao(Timestamp.valueOf(LocalDateTime.now()));
        Beneficiario beneficiarioSalvo = beneficiarioRepository.salva(beneficiario);
        // Verificando se existe um documento e associando ao beneficiário
        if (beneficiarioRequest.getDocumentoRequest() != null) {
            Documento documento = new Documento(beneficiarioRequest.getDocumentoRequest());
            documento.setBeneficiario(beneficiarioSalvo);  // Associação do beneficiário com documento
            documentoRepository.salva(documento);
        }
        log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioResponse.builder()
                .idBeneficiario(beneficiarioSalvo.getIdBeneficiario())
                .build();
    }
    @Override
    public List<BeneficiarioListResponse> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioApplicationService - buscaTodosBeneficiarios ");
        List<Beneficiario>  beneficiarios = beneficiarioRepository.listaTodosBeneficiarios();
        log.info("[finaliza] BeneficiarioApplicationService - buscaTodosBeneficiarios ");
        return BeneficiarioListResponse.converte(beneficiarios);
    }
    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiariosAtravesId(Long idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - buscaBeneficiariosAtravesId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - buscaBeneficiariosAtravesId");
        return new BeneficiarioDetalhadoResponse(beneficiario);
    }
    @Override
    public void deletaBeneficiarioById(Long idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - deletaBeneficiarioById");
        log.info("[idBeneficiario] {}", idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - deletaBeneficiarioById");

    }
}
