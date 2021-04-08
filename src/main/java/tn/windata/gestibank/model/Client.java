package tn.windata.gestibank.model ; 

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A Client.
 */
@Entity
@DiscriminatorValue(value = "CLIENT")
public class Client extends Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;

 
    @Column(name = "identifiant")
    private Long identifiant;

    @Column(name = "revenus_mens")
    private String revenusMens;

    @Column(name = "pieces_justif")
    private String piecesJustif;

    @OneToMany(mappedBy = "client")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//    private Set<Compte> comptes = new HashSet<>();
    private List<Compte> comptes= new LinkedList<>();

    @OneToMany(mappedBy = "client")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<Requete> requetes = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = "clients", allowSetters = true)
    private Conseillier conseillier;

	private String role;

    public Long getIdentifiant() {
        return identifiant;
    }

    public Client identifiant(Long identifiant) {
        this.identifiant = identifiant;
        return this;
    }

    public void setIdentifiant(Long identifiant) {
        this.identifiant = identifiant;
    }

    public String getRevenusMens() {
        return revenusMens;
    }

    public Client revenusMens(String revenusMens) {
        this.revenusMens = revenusMens;
        return this;
    }

    public void setRevenusMens(String revenusMens) {
        this.revenusMens = revenusMens;
    }

    public String getPiecesJustif() {
        return piecesJustif;
    }

    public Client piecesJustif(String piecesJustif) {
        this.piecesJustif = piecesJustif;
        return this;
    }

    public void setPiecesJustif(String piecesJustif) {
        this.piecesJustif = piecesJustif;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public Client comptes(List<Compte> comptes) {
        this.comptes = comptes;
        return this;
    }

    public Client addCompte(Compte compte) {
        this.comptes.add(compte);
        compte.setClient(this);
        return this;
    }

    public Client removeCompte(Compte compte) {
        this.comptes.remove(compte);
        compte.setClient(null);
        return this;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public Set<Requete> getRequetes() {
        return requetes;
    }

    public Client requetes(Set<Requete> requetes) {
        this.requetes = requetes;
        return this;
    }

    public Client addRequete(Requete requete) {
        this.requetes.add(requete);
        requete.setClient(this);
        return this;
    }

    public Client removeRequete(Requete requete) {
        this.requetes.remove(requete);
        requete.setClient(null);
        return this;
    }

    public void setRequetes(Set<Requete> requetes) {
        this.requetes = requetes;
    }

    public Conseillier getConseillier() {
        return conseillier;
    }

    public Client conseillier(Conseillier conseillier) {
        this.conseillier = conseillier;
        return this;
    }

    public void setConseillier(Conseillier conseillier) {
        this.conseillier = conseillier;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here



  

    // prettier-ignore
    @Override
    public String toString() {
        return "Client{" +
            "id=" + getId() +
            ", identifiant=" + getIdentifiant() +
            ", revenusMens='" + getRevenusMens() + "'" +
            ", piecesJustif='" + getPiecesJustif() + "'" +
            "}";
    }

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((comptes == null) ? 0 : comptes.hashCode());
		result = prime * result + ((conseillier == null) ? 0 : conseillier.hashCode());
		result = prime * result + ((identifiant == null) ? 0 : identifiant.hashCode());
		result = prime * result + ((piecesJustif == null) ? 0 : piecesJustif.hashCode());
		result = prime * result + ((requetes == null) ? 0 : requetes.hashCode());
		result = prime * result + ((revenusMens == null) ? 0 : revenusMens.hashCode());
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
		Client other = (Client) obj;
		if (comptes == null) {
			if (other.comptes != null)
				return false;
		} else if (!comptes.equals(other.comptes))
			return false;
		if (conseillier == null) {
			if (other.conseillier != null)
				return false;
		} else if (!conseillier.equals(other.conseillier))
			return false;
		if (identifiant == null) {
			if (other.identifiant != null)
				return false;
		} else if (!identifiant.equals(other.identifiant))
			return false;
		if (piecesJustif == null) {
			if (other.piecesJustif != null)
				return false;
		} else if (!piecesJustif.equals(other.piecesJustif))
			return false;
		if (requetes == null) {
			if (other.requetes != null)
				return false;
		} else if (!requetes.equals(other.requetes))
			return false;
		if (revenusMens == null) {
			if (other.revenusMens != null)
				return false;
		} else if (!revenusMens.equals(other.revenusMens))
			return false;
		return true;
	}
}
