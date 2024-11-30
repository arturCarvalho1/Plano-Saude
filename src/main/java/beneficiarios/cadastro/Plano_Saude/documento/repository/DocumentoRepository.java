package beneficiarios.cadastro.Plano_Saude.documento.repository;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
