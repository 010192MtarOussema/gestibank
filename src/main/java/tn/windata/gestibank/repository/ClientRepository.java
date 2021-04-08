package tn.windata.gestibank.repository;

import tn.windata.gestibank.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	Iterable<Client> findByRoleContaining(String role);

}
