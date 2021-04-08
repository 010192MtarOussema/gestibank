package tn.windata.dto ; 



import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Administrateur.
 */

public class AdministrateurDTO extends UtilisateurDTO  implements Serializable {



    private Set<ConseillierDTO> conseilliers = new HashSet<>();

    private Set<DemandesOuverturesDTO> demandesOuvertures = new HashSet<>();



    public Set<ConseillierDTO> getConseilliers() {
        return conseilliers;
    }

    public AdministrateurDTO conseilliers(Set<ConseillierDTO> conseilliers) {
        this.conseilliers = conseilliers;
        return this;
    }

    public AdministrateurDTO addConseillier(ConseillierDTO conseillier) {
        this.conseilliers.add(conseillier);
        conseillier.setAdministrateur(this);
        return this;
    }

    public AdministrateurDTO removeConseillier(ConseillierDTO conseillier) {
        this.conseilliers.remove(conseillier);
        conseillier.setAdministrateur(null);
        return this;
    }

    public void setConseilliers(Set<ConseillierDTO> conseilliers) {
        this.conseilliers = conseilliers;
    }

    public Set<DemandesOuverturesDTO> getDemandesOuvertures() {
        return demandesOuvertures;
    }

    public AdministrateurDTO demandesOuvertures(Set<DemandesOuverturesDTO> demandesOuvertures) {
        this.demandesOuvertures = demandesOuvertures;
        return this;
    }

    public AdministrateurDTO addDemandesOuvertures(DemandesOuverturesDTO demandesOuvertures) {
        this.demandesOuvertures.add(demandesOuvertures);
        demandesOuvertures.setAdministrateur(this);
        return this;
    }

    public AdministrateurDTO removeDemandesOuvertures(DemandesOuverturesDTO demandesOuvertures) {
        this.demandesOuvertures.remove(demandesOuvertures);
        demandesOuvertures.setAdministrateur(null);
        return this;
    }

    public void setDemandesOuvertures(Set<DemandesOuverturesDTO> demandesOuvertures) {
        this.demandesOuvertures = demandesOuvertures;
    }




}
