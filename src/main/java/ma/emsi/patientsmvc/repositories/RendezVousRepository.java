package ma.emsi.patientsmvc.repositories;
import ma.emsi.patientsmvc.entities.RendezVous;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
    Page<RendezVous> findByTitreContains(String kw, Pageable pageable );

}
