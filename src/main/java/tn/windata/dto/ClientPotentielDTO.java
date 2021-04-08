package tn.windata.dto ; 

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A ClientPotentiel.
 */
@Entity
@Table(name = "client_potentiel")
public class ClientPotentielDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "revenus_mens")
    private String revenusMens;

    @Column(name = "pieces_justif")
    private String piecesJustif;

    @OneToOne
    @JoinColumn(unique = true)
    private DemandesOuverturesDTO clientPotentiel;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public ClientPotentielDTO nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ClientPotentielDTO prenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public ClientPotentielDTO email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public ClientPotentielDTO telephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRevenusMens() {
        return revenusMens;
    }

    public ClientPotentielDTO revenusMens(String revenusMens) {
        this.revenusMens = revenusMens;
        return this;
    }

    public void setRevenusMens(String revenusMens) {
        this.revenusMens = revenusMens;
    }

    public String getPiecesJustif() {
        return piecesJustif;
    }

    public ClientPotentielDTO piecesJustif(String piecesJustif) {
        this.piecesJustif = piecesJustif;
        return this;
    }

    public void setPiecesJustif(String piecesJustif) {
        this.piecesJustif = piecesJustif;
    }

    public DemandesOuverturesDTO getClientPotentiel() {
        return clientPotentiel;
    }

    public ClientPotentielDTO clientPotentiel(DemandesOuverturesDTO demandesOuvertures) {
        this.clientPotentiel = demandesOuvertures;
        return this;
    }

    public void setClientPotentiel(DemandesOuverturesDTO demandesOuvertures) {
        this.clientPotentiel = demandesOuvertures;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClientPotentielDTO)) {
            return false;
        }
        return id != null && id.equals(((ClientPotentielDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ClientPotentiel{" +
            "id=" + getId() +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", email='" + getEmail() + "'" +
            ", telephone='" + getTelephone() + "'" +
            ", revenusMens='" + getRevenusMens() + "'" +
            ", piecesJustif='" + getPiecesJustif() + "'" +
            "}";
    }
}
