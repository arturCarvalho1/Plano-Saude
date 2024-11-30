package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Value
public class BeneficiarioListResponse {
    private Long idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataInclusao;

    public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
        return beneficiarios.stream()
                .map(BeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

    public BeneficiarioListResponse(Beneficiario beneficiario) {
        this.dataInclusao = beneficiario.getDataInclusao();
        this.dataNascimento = beneficiario.getDataNascimento();
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nome = beneficiario.getNome();
        this.telefone = beneficiario.getTelefone();
    }
}
