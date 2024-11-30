package beneficiarios.cadastro.Plano_Saude.documento.domain;

import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Documento {
    @Id
    @Column(name = "idDocumento", unique = true, nullable = false, length = 36)
    private Long idDocumento;
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
        this.idDocumento = UUID.randomUUID().node();
        this.tipoDocumento = tipoDocumento;
    }
}
