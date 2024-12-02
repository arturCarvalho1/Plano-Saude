package beneficiarios.cadastro.Plano_Saude.beneficiario.domain;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioRequest;
import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBeneficiario;
    @NotBlank
    private String nome;
    private String telefone;
    @NotNull(message = "Data de nascimento não pode ser nula")
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "beneficiario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documento> documentos = new ArrayList<>();

    private Timestamp dataAlteracao;
    private Timestamp dataInclusao;
    private Timestamp dataAtualizacao;

    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
        this.dataAlteracao = Timestamp.valueOf(LocalDateTime.now());
        this.dataInclusao = Timestamp.valueOf(LocalDateTime.now());
        this.dataNascimento = beneficiarioRequest.getDataNascimento();
        this.nome = beneficiarioRequest.getNome();
        this.telefone = beneficiarioRequest.getTelefone();
    }

    public void adicionarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public void altera(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequestRequest) {
        this.dataAtualizacao = Timestamp.valueOf(LocalDateTime.now());
        this.dataInclusao = Timestamp.valueOf(LocalDateTime.now());
        this.dataNascimento = beneficiarioAlteracaoRequestRequest.getDataNascimento();
        this.nome = beneficiarioAlteracaoRequestRequest.getNome();
        this.telefone = beneficiarioAlteracaoRequestRequest.getTelefone();

    }
}