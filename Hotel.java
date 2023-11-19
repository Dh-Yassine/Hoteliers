package Hotel;

import java.util.Date;

import Hotel.Chambre.CategorieChambre;

class Hotel {
    private String nom;
    private String categorie;
    private String adresse;
    private Date dateOuverture;
    private Date dateFermeture;
    private Chambre[] chambres;
    private int nb_c;
    
    public Hotel(String nom, String categorie, String adresse, Date dateOuverture, Date dateFermeture,int nb_c) {
		
		this.nom = nom;
		this.nb_c=nb_c;
		this.categorie = categorie;
		this.adresse = adresse;
		this.dateOuverture = dateOuverture;
		this.dateFermeture = dateFermeture;
		this.chambres = new Chambre[nb_c];
	}


	public int getNb_c() {
		return nb_c;
	}


	public void setNb_c(int nb_c) {
		this.nb_c = nb_c;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Date getDateOuverture() {
		return dateOuverture;
	}


	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}


	public Date getDateFermeture() {
		return dateFermeture;
	}


	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}


	

	public Chambre[] getChambres() {
		return chambres;
	}


	public void setChambres(Chambre[] chambres) {
		this.chambres = chambres;
	}

	
	public boolean estChambreDisponible(CategorieChambre categorie, Date dateDebut, Date dateFin) {
        
        return true;
    }

    
}