package beneficiarios.cadastro.Plano_Saude.documento.domain;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idDocumento;
    private String tipoDocumento;
    @NotBlank
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "idBeneficiario")
    private Beneficiario beneficiario;

    public Documento(Beneficiario beneficiario, LocalDateTime dataAtualizacao, LocalDateTime dataInclusao, String descricao, UUID idDocumento, String tipoDocumento) {
        this.beneficiario = beneficiario;
        this.dataAtualizacao = dataAtualizacao;
        this.dataInclusao = dataInclusao;
        this.descricao = descricao;
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
    }
}
