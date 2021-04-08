package tn.windata.dto ; 


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A DemandesOuvertures.
 */
@Entity
@Table(name = "demandes_ouvertures")
public class DemandesOuverturesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valide")
    private Boolean valide;

    @ManyToOne
    @JsonIgnoreProperties(value = "demandesOuvertures", allowSetters = true)
    private AdministrateurDTO administrateur;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isValide() {
        return valide;
    }

    public DemandesOuverturesDTO valide(Boolean valide) {
        this.valide = valide;
        return this;
    }

    public void setValide(Boolean valide) {
        this.valide = valide;
    }

    public AdministrateurDTO getAdministrateur() {
        return administrateur;
    }

    public DemandesOuverturesDTO administrateur(AdministrateurDTO administrateur) {
        this.administrateur = administrateur;
        return this;
    }

    public void setAdministrateur(AdministrateurDTO administrateur) {
        this.administrateur = administrateur;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DemandesOuverturesDTO)) {
            return false;
        }
        return id != null && id.equals(((DemandesOuverturesDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DemandesOuvertures{" +
            "id=" + getId() +
            ", valide='" + isValide() + "'" +
            "}";
    }
}
