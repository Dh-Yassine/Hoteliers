package Hotel;


public class Chambre {
	private int numero;
    private int etage;
    private CategorieChambre categorie;
    private Reservation[] reservations;
 

   
    
    
	
	public Chambre(int numero, int etage, CategorieChambre categorie) {
		super();
		this.numero = numero;
		this.etage = etage;
		this.categorie = categorie;
		this.reservations =new Reservation[100];
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
	
	public void ajouterReservation(Reservation reservation) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = reservation;
                break;
            }
        }
    }
	public boolean estDisponible(Reservation reservation) {
        for (Reservation existingReservation : reservations) {
            if (existingReservation != null && existingReservation.seChevaucheAvec(reservation)) {
                return false;
            }
        }
        return true;
    }

	@Override
	public String toString() {
	    return "Chambre{" +
	           "numero=" + numero +
	           ", etage=" + etage +
	           ", categorie=" + categorie +
	           '}';
	}
   
}



