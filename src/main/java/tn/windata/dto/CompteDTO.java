package tn.windata.dto;



public class CompteDTO {

	private Long id;

	private String numeroDeCompte;

	private String rib;

	private Double solde;

	private Double decouvert;

	private Double montantAgios;

	private Double seuilRenumeration;

	private Double montantRenumeration;

	private ClientDTO clientDto;

	public CompteDTO() {
		super();
		}


	public CompteDTO(Long id, String numeroDeCompte, String rib, Double solde, Double decouvert, Double montantAgios,
			Double seuilRenumeration, Double montantRenumeration) {
		super();
		this.id = id;
		this.numeroDeCompte = numeroDeCompte;
		this.rib = rib;
		this.solde = solde;
		this.decouvert = decouvert;
		this.montantAgios = montantAgios;
		this.seuilRenumeration = seuilRenumeration;
		this.montantRenumeration = montantRenumeration;
	}


	public CompteDTO(Long id, String numeroDeCompte, String rib, Double solde, Double decouvert, Double montantAgios,
			Double montantRenumeration) {
		super();
		this.id = id;
		this.numeroDeCompte = numeroDeCompte;
		this.rib = rib;
		this.solde = solde;
		this.decouvert = decouvert;
		this.montantAgios = montantAgios;
		this.montantRenumeration = montantRenumeration;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}

	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

	public Double getMontantAgios() {
		return montantAgios;
	}

	public void setMontantAgios(Double montantAgios) {
		this.montantAgios = montantAgios;
	}

	public Double getSeuilRenumeration() {
		return seuilRenumeration;
	}

	public void setSeuilRenumeration(Double seuilRenumeration) {
		this.seuilRenumeration = seuilRenumeration;
	}

	public Double getMontantRenumeration() {
		return montantRenumeration;
	}

	public void setMontantRenumeration(Double montantRenumeration) {
		this.montantRenumeration = montantRenumeration;
	}


	public ClientDTO getClientDto() {
		return clientDto;
	}

	public void setClientDto(ClientDTO clientDto) {
		this.clientDto = clientDto;
	}


	
	

}
