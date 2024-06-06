package codeInitial;

public class Groupe {
    private int numero;
    private String nom;
    private Professeur professeur;

    /**
     *
     * @param numero
     * @param nom
     */
    public Groupe(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    /**
     *
     * @param professeur
     */
    public void setProfesseur(Professeur professeur) {
        this.professeur = Professeur.getInstance(professeur.getCip(), professeur.getNom());
    }
    

    @Override
    public String toString() {
        return "Groupe{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", professeur=" + professeur +
                '}';
    }
}
