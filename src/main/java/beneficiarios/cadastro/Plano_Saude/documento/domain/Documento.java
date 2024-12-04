package beneficiarios.cadastro.Plano_Saude.documento.domain;

import beneficiarios.cadastro.Plano_Saude.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import beneficiarios.cadastro.Plano_Saude.beneficiario.domain.Beneficiario;
import beneficiarios.cadastro.Plano_Saude.documento.application.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDocumento", unique = true, nullable = false)
    private Long idDocumento;
    private String tipoDocumento;
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;

    @Setter
    @ManyToOne
    @JoinColumn(name = "idBeneficiario", nullable = false)
    private Beneficiario beneficiario;

    public Documento() {
    }
    public Documento(DocumentoRequest documentoRequest) {
        this.beneficiario = documentoRequest.getBeneficiario();
        this.descricao = documentoRequest.getDescricao();
        this.tipoDocumento = documentoRequest.getTipoDocumento();
    }
    @PrePersist
    public void prePersist() {
        this.dataInclusao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }
    @PreUpdate
    public void preUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }

    public void altera(BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        this.descricao = beneficiarioAlteracaoRequest.getDescricao();
        this.tipoDocumento = beneficiarioAlteracaoRequest.getTipoDocumento();
        this.dataAtualizacao = LocalDateTime.now();
    }
}