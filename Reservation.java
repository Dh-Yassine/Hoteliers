package Hotel;

import java.util.Date;

public class Reservation {
    private int numero;
    private Date date;
    private Chambre[] chambres = new Chambre[10];
    private CategorieChambre categorieChambre; // Reference to CategorieChambre
    private Date dateDebutEffective;
    private Date dateFinEffective;
    private Client client;

    
   

    public Reservation(int numero, Date date, Date dateDebutEffective, Date dateFinEffective, Chambre[] chambres, CategorieChambre categorieChambre, Client client) {
		this.numero = numero;
		this.date = date;
		this.chambres = new Chambre[10];
		this.categorieChambre = categorieChambre;
		this.dateDebutEffective = dateDebutEffective;
		this.dateFinEffective = dateFinEffective;
		this.client = client;
	}

	public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   

    public Chambre[] getChambres() {
        return chambres;
    }

    public void setChambres(Chambre[] chambres) {
        this.chambres = chambres;
    }

    public CategorieChambre getCategorieChambre() {
        return categorieChambre;
    }

    public void setCategorieChambre(CategorieChambre categorieChambre) {
        this.categorieChambre = categorieChambre;
    }

    public Date getDateDebutEffective() {
        return dateDebutEffective;
    }

    public void setDateDebutEffective(Date dateDebutEffective) {
        this.dateDebutEffective = dateDebutEffective;
    }

    public Date getDateFinEffective() {
        return dateFinEffective;
    }

    public void setDateFinEffective(Date dateFinEffective) {
        this.dateFinEffective = dateFinEffective;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder roomDetails = new StringBuilder("Reserved Rooms: [");
        for (Chambre chambre : chambres) {
            if (chambre != null) {
                roomDetails.append("\n la chambre de numero "+chambre.getNumero());
            }
        }
        roomDetails.append("]");

        return "Reservation{" +
                "numero=" + numero +
                ", date de reservation=" + date +
                ", client=" + client +
                ", categorieChambre=" + categorieChambre +
                ", dateDebutEffective=" + dateDebutEffective +
                ", dateFinEffective=" + dateFinEffective +
                ", \n les chambres de reservation  " + roomDetails.toString() +
                '}';
    }



    public boolean seChevaucheAvec(Reservation autreReservation) {
        Date debut1 = getDateDebutEffective();
        Date fin1 = getDateFinEffective(); // Assuming getFin() returns the end date of the reservation

        Date debut2 = autreReservation.getDateDebutEffective();
        Date fin2 = autreReservation.getDateFinEffective(); // Assuming getFin() returns the end date of the other reservation

        // Check if one reservation starts before the other ends and vice versa
        return (debut1.before(fin2) || debut1.equals(fin2)) && (debut2.before(fin1) || debut2.equals(fin1));
    }


    // Other methods related to the reservation

    public boolean estDisponible(Hotel hotel) {
        // Check availability based on the category and the planned occupancy period
        for (Chambre chambre : hotel.getChambres()) {
            if (chambre.getCategorie().equals(this.getChambres()[0].getCategorie()) && chambre.estDisponible(this)) {
                // Check if the room's category matches the requested category and it is available
                return true;
            }
        }
        return false;
    }


    public void affecterChambre(Hotel hotel) {
        // Find available rooms for the reservation
        Chambre[] assignedRooms = new Chambre[chambres.length];
        int count = 0;

        for (Chambre chambre : hotel.getChambres()) {
            if (chambre.estDisponible(this)) {
                assignedRooms[count++] = chambre;

                // Assign the reservation to the room
                chambre.ajouterReservation(this);

                // Break if all required rooms are assigned
                if (count == chambres.length) {
                    break;
                }
            }
        }

        // Check if all required rooms are assigned
        if (count == chambres.length) {
            setChambres(assignedRooms);
        } else {
            System.out.println("Aucune chambre disponible pour cette réservation.");
        }
    }

    



}
