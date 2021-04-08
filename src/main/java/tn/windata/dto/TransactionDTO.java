package tn.windata.dto ; 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A Transaction.
 */

public class TransactionDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private String date;

    private String message;


    private CompteDTO compte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public TransactionDTO date(String date) {
        this.date = date;
        return this;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public TransactionDTO message(String message) {
        this.message = message;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CompteDTO getCompte() {
        return compte;
    }

    public TransactionDTO compte(CompteDTO compte) {
        this.compte = compte;
        return this;
    }

    public void setCompte(CompteDTO compte) {
        this.compte = compte;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransactionDTO)) {
            return false;
        }
        return id != null && id.equals(((TransactionDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Transaction{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }
}
