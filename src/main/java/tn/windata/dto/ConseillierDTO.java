package tn.windata.dto ; 



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Conseillier.
 */

public class ConseillierDTO extends UtilisateurDTO  implements Serializable {

    private static final long serialVersionUID = 1L;




    private String matricule;


    private Set<ClientDTO> clients = new HashSet<>();

    private AdministrateurDTO administrateur;



    public String getMatricule() {
        return matricule;
    }

    public ConseillierDTO matricule(String matricule) {
        this.matricule = matricule;
        return this;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Set<ClientDTO> getClients() {
        return clients;
    }

    public ConseillierDTO clients(Set<ClientDTO> clients) {
        this.clients = clients;
        return this;
    }

//    public ConseillierDTO addClient(ClientDTO client) {
//        this.clients.add(client);
//        client.setConseillier(this);
//        return this;
//    }
//
//    public ConseillierDTO removeClient(ClientDTO client) {
//        this.clients.remove(client);
//        client.setConseillier(null);
//        return this;
//    }

    public void setClients(Set<ClientDTO> clients) {
        this.clients = clients;
    }

    public AdministrateurDTO getAdministrateur() {
        return administrateur;
    }

    public ConseillierDTO administrateur(AdministrateurDTO administrateur) {
        this.administrateur = administrateur;
        return this;
    }

    public void setAdministrateur(AdministrateurDTO administrateur) {
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
		ConseillierDTO other = (ConseillierDTO) obj;
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
