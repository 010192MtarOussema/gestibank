package tn.windata.gestibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.windata.gestibank.model.Conseillier;

/**
 * Spring Data  repository for the Conseillier entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConseillierRepository extends JpaRepository<Conseillier, Long> {
}
