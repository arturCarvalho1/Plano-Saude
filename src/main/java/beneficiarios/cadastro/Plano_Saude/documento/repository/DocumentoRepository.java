package beneficiarios.cadastro.Plano_Saude.documento.repository;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
