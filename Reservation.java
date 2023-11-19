package Hotel;

import java.util.Date;

public class Reservation {
	private int numero;
    private Date date;
    private Chambre chambre;
    private Client client;
    
	public Reservation(int numero, Date date, Chambre chambre, Client client) {
		this.numero = numero;
		this.date = date;
		this.chambre = chambre;
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
	public Chambre getChambre() {
		return chambre;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

    // Constructeur, getters et setters

    // Autres méthodes liées à la réservation


}
