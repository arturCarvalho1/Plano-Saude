package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse cadastrarBeneficiario(@RequestBody @Valid BeneficiarioRequest beneficiarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioResponse> getTodosbeneficiarios();
}
