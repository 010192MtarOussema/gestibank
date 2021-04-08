package tn.windata.gestibank.model ; 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Conseillier.
 */
@Entity

@DiscriminatorValue(value = "CONSEILLIER")
public class Conseillier extends Utilisateur  implements Serializable {

    private static final long serialVersionUID = 1L;



    @Column(name = "matricule")
    private String matricule;

    @OneToMany(mappedBy = "conseillier")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<Client> clients = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = "conseilliers", allowSetters = true)
    private Administrateur administrateur;



    public String getMatricule() {
        return matricule;
    }

    public Conseillier matricule(String matricule) {
        this.matricule = matricule;
        return this;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public Conseillier clients(Set<Client> clients) {
        this.clients = clients;
        return this;
    }

    public Conseillier addClient(Client client) {
        this.clients.add(client);
        client.setConseillier(this);
        return this;
    }

    public Conseillier removeClient(Client client) {
        this.clients.remove(client);
        client.setConseillier(null);
        return this;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public Conseillier administrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
        return this;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }


  
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((administrateur == null) ? 0 : administrateur.hashCode());
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conseillier other = (Conseillier) obj;
		if (administrateur == null) {
			if (other.administrateur != null)
				return false;
		} else if (!administrateur.equals(other.administrateur))
			return false;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		if (matricule == null) {
			if (other.matricule != null)
				return false;
		} else if (!matricule.equals(other.matricule))
			return false;
		return true;
	}

	// prettier-ignore
    @Override
    public String toString() {
        return "Conseillier{" +
            "id=" + getId() +
            ", matricule='" + getMatricule() + "'" +
            "}";
    }
}
