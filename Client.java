package Hotel;

import java.util.List;

public class Client {

    private int numero;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private List<Consommation> consommations;
    private Facture facture;
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
	public List<Consommation> getConsommations() {
		return consommations;
	}
	public void setConsommations(List<Consommation> consommations) {
		this.consommations = consommations;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}

    // Constructeur, getters et setters

    // Autres méthodes liées au client

}
