package Hotel;

import java.util.List;

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

	// Méthode pour obtenir une représentation en lignes pour les enveloppes
    public List<String> getLignesEnveloppe() {
        // Implémentation à compléter
        return null;
    }

}
