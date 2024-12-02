package beneficiarios.cadastro.Plano_Saude.documento.infra;

import beneficiarios.cadastro.Plano_Saude.documento.application.repository.DocumentoRepository;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import beneficiarios.cadastro.Plano_Saude.handler.DocumentoNaoEncontradoException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoIfraRepository implements DocumentoRepository{
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento buscaDocumentoAtravesIdBeneficiario(Long idBeneficiario) {
        log.info("[inicia] DocumentoIfraRepository - buscaAtravesId");
        Optional<Documento> documento = documentoSpringDataJPARepository.findById(idBeneficiario);
        return documentoSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> new DocumentoNaoEncontradoException("Documento não encontrado para o ID: " + idBeneficiario));
    }

    @Override
    public Documento salva(Documento documento) {
        log.info("[inicia] DocumentoIfraRepository - salva");
        Documento documentoSalvo = documentoSpringDataJPARepository.save(documento);
        log.info("[finaliza] DocumentoIfraRepository - salva");
        return documentoSalvo;
    }
}
