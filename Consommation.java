package Hotel;

import java.time.LocalDateTime;
import java.util.Date;

public class Consommation {
	private String type;
    private LocalDateTime date;
    private double montant;
    private boolean forfaitaire;
    private int quantite;

    public Consommation(String type, LocalDateTime date, double montant, boolean forfaitaire, int quantite) {
		super();
		this.type = type;
		this.date = date;
		this.montant = montant;
		this.forfaitaire = forfaitaire;
		this.quantite = quantite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
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
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

    public double getMontant() {
        if (forfaitaire) {
            return montant;
        } else {
            return montant * quantite;
        }
    }
    @Override
    public String toString() {
        return "Consommation{" +
               "type='" + type + '\'' +
               ", date=" + date +
               ", montant=" + montant +
               ", forfaitaire=" + forfaitaire +
               ", quantite=" + quantite +
               '}';
    }
}
