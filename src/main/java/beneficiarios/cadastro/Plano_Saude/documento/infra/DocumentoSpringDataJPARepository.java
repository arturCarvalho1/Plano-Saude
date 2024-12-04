package beneficiarios.cadastro.Plano_Saude.documento.infra;

import beneficiarios.cadastro.Plano_Saude.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentoSpringDataJPARepository extends JpaRepository<Documento,Long> {
}
