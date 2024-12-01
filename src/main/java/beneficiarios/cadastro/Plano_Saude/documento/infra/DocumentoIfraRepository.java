package beneficiarios.cadastro.Plano_Saude.documento.infra;

import beneficiarios.cadastro.Plano_Saude.documento.application.repository.DocumentoRepository;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoIfraRepository implements DocumentoRepository{
    private DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento buscaAtravesId(Long idBeneficiario) {
        log.info("[inicia] DocumentoIfraRepository - buscaAtravesId");
        Documento documento = documentoSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> new RuntimeException("Beneficiario não encontrado!"));
        log.info("[finaliza] DocumentoIfraRepository - buscaAtravesId");
        return documento;
    }
}
