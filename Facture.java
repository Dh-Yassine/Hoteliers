package Hotel;

import java.util.Date;
import java.util.List;

public class Facture {
	private int numero;
    private Date date;
    private String modePaiement;
    private double montantTotal;
    private List<Chambre> chambresOccupes;
    private List<Consommation> consommations;
	
    
    
    
    public Facture(int numero, Date date, String modePaiement, double montantTotal, List<Chambre> chambresOccupes,
			List<Consommation> consommations) {
		
		this.numero = numero;
		this.date = date;
		this.modePaiement = modePaiement;
		this.montantTotal = montantTotal;
		this.chambresOccupes = chambresOccupes;
		this.consommations = consommations;
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
	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	public double getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}
	public List<Chambre> getChambresOccupes() {
		return chambresOccupes;
	}
	public void setChambresOccupes(List<Chambre> chambresOccupes) {
		this.chambresOccupes = chambresOccupes;
	}
	public List<Consommation> getConsommations() {
		return consommations;
	}
	public void setConsommations(List<Consommation> consommations) {
		this.consommations = consommations;
	}

   
}
