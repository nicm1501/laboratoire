package codeInitial;

public class Professeur {

    private static Professeur professeur;
    private String cip;
    private String nom;

    /**
     *
     * @param cip
     * @param nom
     */
    private Professeur(String cip, String nom) {
        this.cip = cip;
        this.nom = nom;
    }

    /**
     *
     * @param cip
     * @param nom
     * @return
     */
    public static Professeur getInstance(String cip, String nom) {
        if(professeur == null)
        {
            professeur = new Professeur(cip, nom);
        }
        return professeur;
    }

    /**
     *
     * @return
     */
    public String getCip() {
        return cip;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }


    @Override
    public String toString() {
        return "Professeur{" +
                "hash code=" + this.hashCode() + " \n"+
                "cip='" + cip + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
