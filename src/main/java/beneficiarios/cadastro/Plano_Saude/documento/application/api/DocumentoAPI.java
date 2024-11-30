package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/documento")
public interface DocumentoAPI {

 @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<DocumentoListResponse> listaTarefasPorIdUsuario(@RequestParam("idBeneficiario") Optional<String> idBeneficiario);
}

