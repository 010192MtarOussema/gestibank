package tn.windata.gestibank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.windata.gestibank.model.DemandesOuvertures;

/**
 * Spring Data  repository for the DemandesOuvertures entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DemandesOuverturesRepository extends JpaRepository<DemandesOuvertures, Long> {
}
