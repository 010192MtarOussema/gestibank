package tn.windata.gestibank.model ; 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Compte.
 */
@Entity
@Table(name = "compte")
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_de_compte")
    private String numeroDeCompte;

    @Column(name = "rib")
    private String rib;

    @Column(name = "solde")
    private Double solde;

    @Column(name = "decouvert")
    private Double decouvert;

    @Column(name = "montant_agios")
    private Double montantAgios;

    @Column(name = "seuil_renumeration")
    private Double seuilRenumeration;

    @Column(name = "montant_renumeration")
    private Double montantRenumeration;

    @OneToMany(mappedBy = "compte")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<Notification> notifications = new HashSet<>();

    @OneToMany(mappedBy = "compte")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<Transaction> transactions = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = "comptes", allowSetters = true)
    private Client client;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public Compte numeroDeCompte(String numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
        return this;
    }

    public void setNumeroDeCompte(String numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public String getRib() {
        return rib;
    }

    public Compte rib(String rib) {
        this.rib = rib;
        return this;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Double getSolde() {
        return solde;
    }

    public Compte solde(Double solde) {
        this.solde = solde;
        return this;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Double getDecouvert() {
        return decouvert;
    }

    public Compte decouvert(Double decouvert) {
        this.decouvert = decouvert;
        return this;
    }

    public void setDecouvert(Double decouvert) {
        this.decouvert = decouvert;
    }

    public Double getMontantAgios() {
        return montantAgios;
    }

    public Compte montantAgios(Double montantAgios) {
        this.montantAgios = montantAgios;
        return this;
    }

    public void setMontantAgios(Double montantAgios) {
        this.montantAgios = montantAgios;
    }

    public Double getSeuilRenumeration() {
        return seuilRenumeration;
    }

    public Compte seuilRenumeration(Double seuilRenumeration) {
        this.seuilRenumeration = seuilRenumeration;
        return this;
    }

    public void setSeuilRenumeration(Double seuilRenumeration) {
        this.seuilRenumeration = seuilRenumeration;
    }

    public Double getMontantRenumeration() {
        return montantRenumeration;
    }

    public Compte montantRenumeration(Double montantRenumeration) {
        this.montantRenumeration = montantRenumeration;
        return this;
    }

    public void setMontantRenumeration(Double montantRenumeration) {
        this.montantRenumeration = montantRenumeration;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }

    public Compte notifications(Set<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    public Compte addNotification(Notification notification) {
        this.notifications.add(notification);
        notification.setCompte(this);
        return this;
    }

    public Compte removeNotification(Notification notification) {
        this.notifications.remove(notification);
        notification.setCompte(null);
        return this;
    }

    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public Compte transactions(Set<Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    public Compte addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        transaction.setCompte(this);
        return this;
    }

    public Compte removeTransaction(Transaction transaction) {
        this.transactions.remove(transaction);
        transaction.setCompte(null);
        return this;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Client getClient() {
        return client;
    }

    public Compte client(Client client) {
        this.client = client;
        return this;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Compte)) {
            return false;
        }
        return id != null && id.equals(((Compte) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Compte{" +
            "id=" + getId() +
            ", numeroDeCompte='" + getNumeroDeCompte() + "'" +
            ", rib='" + getRib() + "'" +
            ", solde=" + getSolde() +
            ", decouvert=" + getDecouvert() +
            ", montantAgios=" + getMontantAgios() +
            ", seuilRenumeration=" + getSeuilRenumeration() +
            ", montantRenumeration=" + getMontantRenumeration() +
            "}";
    }
}
