package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoResController implements DocumentoAPI{

    private final DocumentoService documentoService;

    @Override
    public List<DocumentoListResponse> listaTarefasPorIdUsuario(Optional<String> idBeneficiario) {
        log.info("[inicia] DocumentoResController - listaTarefasPorIdUsuario");
        List<DocumentoListResponse> listaDocumentos = documentoService.buscaDocumentosPorId(idBeneficiario);
        log.info("[finaliza] DocumentoResController - listaTarefasPorIdUsuario");
        return listaDocumentos;
    }
}
