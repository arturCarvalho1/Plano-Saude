package beneficiarios.cadastro.Plano_Saude.beneficiario.application.api;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.sql.Timestamp;
import java.time.LocalDate;

@Value
public class BeneficiarioDetalhadoResponse {
    private Long idBeneficiario;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private Timestamp dataInclusao;

    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
        this.dataInclusao = beneficiario.getDataInclusao();
        this.dataNascimento = beneficiario.getDataNascimento();
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nome = beneficiario.getNome();
        this.telefone = beneficiario.getTelefone();
    }
}
