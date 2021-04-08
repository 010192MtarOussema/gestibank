package tn.windata.gestibank.model ; 



import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Administrateur.
 */
@Entity

@DiscriminatorValue(value = "ADMIN")
public class Administrateur extends Utilisateur  implements Serializable {

    private static final long serialVersionUID = 1L;


    @OneToMany(mappedBy = "administrateur")
    private Set<Conseillier> conseilliers = new HashSet<>();

    @OneToMany(mappedBy = "administrateur")
    private Set<DemandesOuvertures> demandesOuvertures = new HashSet<>();



    public Set<Conseillier> getConseilliers() {
        return conseilliers;
    }

    public Administrateur conseilliers(Set<Conseillier> conseilliers) {
        this.conseilliers = conseilliers;
        return this;
    }

    public Administrateur addConseillier(Conseillier conseillier) {
        this.conseilliers.add(conseillier);
        conseillier.setAdministrateur(this);
        return this;
    }

    public Administrateur removeConseillier(Conseillier conseillier) {
        this.conseilliers.remove(conseillier);
        conseillier.setAdministrateur(null);
        return this;
    }

    public void setConseilliers(Set<Conseillier> conseilliers) {
        this.conseilliers = conseilliers;
    }

    public Set<DemandesOuvertures> getDemandesOuvertures() {
        return demandesOuvertures;
    }

    public Administrateur demandesOuvertures(Set<DemandesOuvertures> demandesOuvertures) {
        this.demandesOuvertures = demandesOuvertures;
        return this;
    }

    public Administrateur addDemandesOuvertures(DemandesOuvertures demandesOuvertures) {
        this.demandesOuvertures.add(demandesOuvertures);
        demandesOuvertures.setAdministrateur(this);
        return this;
    }

    public Administrateur removeDemandesOuvertures(DemandesOuvertures demandesOuvertures) {
        this.demandesOuvertures.remove(demandesOuvertures);
        demandesOuvertures.setAdministrateur(null);
        return this;
    }

    public void setDemandesOuvertures(Set<DemandesOuvertures> demandesOuvertures) {
        this.demandesOuvertures = demandesOuvertures;
    }



    // prettier-ignore
    @Override
    public String toString() {
        return "Administrateur{" +
            "id=" + getId() +
            "}";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((conseilliers == null) ? 0 : conseilliers.hashCode());
		result = prime * result + ((demandesOuvertures == null) ? 0 : demandesOuvertures.hashCode());
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
		Administrateur other = (Administrateur) obj;
		if (conseilliers == null) {
			if (other.conseilliers != null)
				return false;
		} else if (!conseilliers.equals(other.conseilliers))
			return false;
		if (demandesOuvertures == null) {
			if (other.demandesOuvertures != null)
				return false;
		} else if (!demandesOuvertures.equals(other.demandesOuvertures))
			return false;
		return true;
	}
}
