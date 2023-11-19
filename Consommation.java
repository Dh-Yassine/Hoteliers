package Hotel;

import java.util.Date;

public class Consommation {
	private String type;
    private Date date;
    private double montant;
    private boolean forfaitaire;

    public Consommation(String type, Date date, double montant, boolean forfaitaire) {
		super();
		this.type = type;
		this.date = date;
		this.montant = montant;
		this.forfaitaire = forfaitaire;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public boolean isForfaitaire() {
		return forfaitaire;
	}
	public void setForfaitaire(boolean forfaitaire) {
		this.forfaitaire = forfaitaire;
	}

    

}
