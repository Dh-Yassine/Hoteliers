package Hotel;

import java.time.LocalDateTime;
import java.util.Date;

public class Facture {
    private int numero;
    private LocalDateTime date;
    private String modePaiement;
    private double montantTotal;
    private Chambre[] chambresOccupes;
    private Consommation[] consommations;
    private double remise;

    public Facture(int numero, LocalDateTime date, String modePaiement, double montantTotal, Chambre[] chambresOccupes, Consommation[] consommations, double remise) {
        this.numero = numero;
        this.date = date;
        this.modePaiement = modePaiement;
        this.montantTotal = montantTotal;
        this.chambresOccupes = chambresOccupes;
        this.consommations = consommations;
        this.remise = remise;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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

    public Chambre[] getChambresOccupes() {
        return chambresOccupes;
    }

    public void setChambresOccupes(Chambre[] chambresOccupes) {
        this.chambresOccupes = chambresOccupes;
    }

    public Consommation[] getConsommations() {
        return consommations;
    }

    public void setConsommations(Consommation[] consommations) {
        this.consommations = consommations;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public double getMontant() {
        return montantTotal - remise;
    }
    @Override
    public String toString() {
        return "Facture{" +
               "numero=" + numero +
               ", date=" + date +
               ", modePaiement='" + modePaiement + '\'' +
               ", montantTotal=" + montantTotal +
               ", remise=" + remise +
               ", montant finale est =" + getMontant() +
               '}';
    }
}
