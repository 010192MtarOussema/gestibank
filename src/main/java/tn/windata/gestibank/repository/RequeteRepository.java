package tn.windata.gestibank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.windata.gestibank.model.Requete;

/**
 * Spring Data  repository for the Requete entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RequeteRepository extends JpaRepository<Requete, Long> {
}
