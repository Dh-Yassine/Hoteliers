package Hotel;


public class Chambre {
	private int numero;
    private int etage;
    private CategorieChambre categorie;
    private Reservation[] reservations;
    private Client[] occupants;
 

   
    
    
	
	public Chambre(int numero, int etage, CategorieChambre categorie) {
		super();
		this.numero = numero;
		this.etage = etage;
		this.categorie = categorie;
		this.reservations =new Reservation[100];
		this.occupants = new Client[100];
	}



	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public CategorieChambre getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieChambre categorie) {
		this.categorie = categorie;
	}
	
	
	
	public Reservation[] getReservations() {
		return reservations;
	}
	public void setReservations(Reservation[] reservations) {
		this.reservations = reservations;
	}
	public Client[] getOccupants() {
		return occupants;
	}
	public void setOccupants(Client[] occupants) {
		this.occupants = occupants;
	}
	public void ajouterReservation(Reservation reservation) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = reservation;
                break;
            }
        }
    }

    public void ajouterOccupant(Client occupant) {
        for (int i = 0; i < occupants.length; i++) {
            if (occupants[i] == null) {
                occupants[i] = occupant;
                break;
            }
        }
    }



	
	


   
}



