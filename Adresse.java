package Hotel;

public class Adresse {

    private String nomRue;
    private int numeroImmeuble;
    private String commune;
    private String codePostal;
    private String departement;
    private String pays;
    private String numeroTelephone;
    private String adresseCourriel;
    private String adresseWeb;

    // Constructeur, getters et setters

    
	public Adresse(String nomRue, int numeroImmeuble, String commune, String codePostal, String departement,
			String pays, String numeroTelephone, String adresseCourriel, String adresseWeb) {
		super();
		this.nomRue = nomRue;
		this.numeroImmeuble = numeroImmeuble;
		this.commune = commune;
		this.codePostal = codePostal;
		this.departement = departement;
		this.pays = pays;
		this.numeroTelephone = numeroTelephone;
		this.adresseCourriel = adresseCourriel;
		this.adresseWeb = adresseWeb;
	}
	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getNumeroImmeuble() {
		return numeroImmeuble;
	}

	public void setNumeroImmeuble(int numeroImmeuble) {
		this.numeroImmeuble = numeroImmeuble;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getAdresseCourriel() {
		return adresseCourriel;
	}

	public void setAdresseCourriel(String adresseCourriel) {
		this.adresseCourriel = adresseCourriel;
	}

	public String getAdresseWeb() {
		return adresseWeb;
	}

	public void setAdresseWeb(String adresseWeb) {
		this.adresseWeb = adresseWeb;
	}
	public void imprimer() {
        System.out.println(nomRue);
        System.out.println(numeroImmeuble + " " + commune);
        if (departement != null && !departement.isEmpty()) {
            System.out.println(departement);
        }
        if (pays != null && !pays.isEmpty()) {
            System.out.println(pays);
        }
    }

    // Method to format the address for printing
    public String getAdresseImprimee() {
        String adresseImprimee = nomRue + "\n" + numeroImmeuble + " " + commune + "\n";
        if (departement != null && !departement.isEmpty()) {
            adresseImprimee += departement + "\n";
        }
        adresseImprimee += pays;
        return adresseImprimee;
    }
}
	


