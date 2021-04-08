package tn.windata.dto;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * A Client.
 */

public class ClientDTO extends UtilisateurDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long identifiant;

	private String revenusMens;

	private String piecesJustif;

	private List<CompteDTO> comptes = new LinkedList<>();

	private String role;

	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public String getRevenusMens() {
		return revenusMens;
	}

	public void setRevenusMens(String revenusMens) {
		this.revenusMens = revenusMens;
	}

	public String getPiecesJustif() {
		return piecesJustif;
	}

	public void setPiecesJustif(String piecesJustif) {
		this.piecesJustif = piecesJustif;
	}

	public List<CompteDTO> getComptes() {
		return comptes;
	}

	public void setComptes(List<CompteDTO> comptes) {
		this.comptes = comptes;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
