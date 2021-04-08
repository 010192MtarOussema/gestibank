package tn.windata.dto ; 


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;

import java.io.Serializable;

/**
 * A Requete.
 */

public class RequeteDTO implements Serializable {



    private Long id;


    private ClientDTO client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientDTO getClient() {
        return client;
    }

    public RequeteDTO client(ClientDTO client) {
        this.client = client;
        return this;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

  
}
