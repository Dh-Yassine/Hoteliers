package Hotel;

public class CategorieChambre {

    private boolean bain;
    private boolean douche;
    private boolean tele;
    private int nombre_lits;
    private int prix;

    public CategorieChambre(boolean bain, boolean douche, boolean tele, int nombre_lits) {
        this.bain = bain;
        this.douche = douche;
        this.tele = tele;
        this.nombre_lits = nombre_lits;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) throws Anomalie {
        if (prix <= 0) {
            throw new Anomalie("Le prix ne peut pas être inférieur ou égal à 0.");
        }
        this.prix = prix;
    }

    public boolean hasBain() {
        return bain;
    }

    public void setBain(boolean bain) {
        this.bain = bain;
    }

    public boolean hasDouche() {
        return douche;
    }

    public void setDouche(boolean douche) {
        this.douche = douche;
    }

    public boolean hasTele() {
        return tele;
    }

    public void setTele(boolean tele) {
        this.tele = tele;
    }

    public int getNombre_lits() {
        return nombre_lits;
    }

    public void setNombre_lits(int nombre_lits) throws Anomalie {
        if (nombre_lits <= 0) {
            throw new Anomalie("Le nombre de lits ne peut pas être inférieur ou égal à 0.");
        }
        this.nombre_lits = nombre_lits;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CategorieChambre other = (CategorieChambre) obj;
        if (bain != other.bain)
            return false;
        if (douche != other.douche)
            return false;
        if (tele != other.tele)
            return false;
        if (nombre_lits != other.nombre_lits)
            return false;
        if (prix != other.prix)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "CategorieChambre{" +
               "bain=" + bain +
               ", douche=" + douche +
               ", tele=" + tele +
               ", nombre_lits=" + nombre_lits +
               ", prix=" + prix +
               '}';
    }
}
