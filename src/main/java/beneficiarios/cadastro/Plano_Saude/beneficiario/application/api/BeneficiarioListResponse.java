package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class BeneficiarioListResponse {
    private Long idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataInclusao;

    public static List<BeneficiarioResponse> converte(List<Beneficiario> beneficiarios) {
        return null;
    }
}
