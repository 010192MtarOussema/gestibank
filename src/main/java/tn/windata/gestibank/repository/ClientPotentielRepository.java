package tn.windata.gestibank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.windata.gestibank.model.ClientPotentiel;

/**
 * Spring Data  repository for the ClientPotentiel entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientPotentielRepository extends JpaRepository<ClientPotentiel, Long> {
}
