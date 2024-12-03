package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.sql.Timestamp;
import java.time.LocalDate;

@Value
public class BeneficiarioAlteracaoRequest {
    @NotBlank
    private String nome;
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
    private DocumentoRequest documentoRequest;
    private Timestamp dataAlteracao;
    private Long idDocumento;
    private String tipoDocumento;
    private Beneficiario beneficiario;
    private String descricao;
}

