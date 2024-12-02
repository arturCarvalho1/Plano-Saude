package beneficiarios.cadastro.Plano_Saude.documento.application.api;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/documento")
public interface DocumentoAPI {

        @GetMapping(value = "/{idBeneficiario}")
        @ResponseStatus(HttpStatus.OK)
        DocumentoDetalhadoResponse getBeneficiarioById(@PathVariable Long idBeneficiario);

}

