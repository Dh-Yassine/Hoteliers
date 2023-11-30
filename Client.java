package Hotel;

import java.util.List;

public class Client {

    private int numero;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Consommation[] consommations; 
    private Facture facture;
    
	public Client(int numero, String nom, String prenom, Adresse adresse, Consommation[] consommations,
			Facture facture) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.consommations = consommations;
		this.facture = facture;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	 public Consommation[] getConsommations() {
	    return consommations;
	    }

	 public void setConsommations(Consommation[] consommations) {
	    this.consommations = consommations;
	    }

	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	@Override
	public String toString() {
	    return "Client{" +
	           "numero=" + numero +
	           ", nom='" + nom + '\'' +
	           ", prenom='" + prenom + '\'' +
	           ", adresse=" + adresse +
	           '}';
	}

   
}
