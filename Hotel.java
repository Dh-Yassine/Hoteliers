package Hotel;

import java.util.Date;



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
        this.categorie = categorie;
        this.adresse = adresse;
        this.dateOuverture = dateOuverture;
        this.dateFermeture = dateFermeture;
        this.chambres = new Chambre[100]; // Assuming a maximum of 100 rooms initially
        this.nb_c = 0; 
	}


	public int getNb_c() {
		return nb_c;
	}
	
    public void incrementNb_c() {
        nb_c++;
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
	
	public void ajouterChambre(CategorieChambre categorie) {
        if (nb_c < chambres.length) {
            chambres[nb_c] = new Chambre(nb_c + 1, 1, categorie);
            incrementNb_c();
        } else {
            System.out.println("Maximum number of rooms reached for this hotel.");
        }
    }
	public void supprimerChambre(int numeroChambre) {
 
        if (numeroChambre > 0 && numeroChambre <= nb_c) {
            for (int i = numeroChambre - 1; i < nb_c - 1; i++) {
                chambres[i] = chambres[i + 1];
            }
            chambres[nb_c - 1] = null; 
            decrementNb_c();
            System.out.println("Chambre supprimée avec succès.");
        } else {
            System.out.println("Numéro de chambre invalide.");
        }
    }

    public boolean estOuvert(Date date) {
        
        return dateOuverture.before(date) && dateFermeture.after(date);
    }

    private void decrementNb_c() {
        nb_c--;
    }
    
    }
	

    
