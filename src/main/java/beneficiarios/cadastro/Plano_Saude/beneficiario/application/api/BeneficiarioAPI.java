package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

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
    List<BeneficiarioListResponse> getTodosbeneficiarios();

    @GetMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(@PathVariable Long idBeneficiario);

    @DeleteMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaBeneficiarioById(@PathVariable Long idBeneficiario);

    @PatchMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraDadosBeneficiario(@PathVariable Long idBeneficiario,
            @RequestBody @Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);

}
