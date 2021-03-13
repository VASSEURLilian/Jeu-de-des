
/**
 * Cette classe nous sert un crée un dé avec  un nombre de faces que l'on peut choisir
 *
 * @author VASSEUR Lilian & PREVOT Samuel
 * @version 10/12/2020
 */
public class De
{
    // Attributs
    private int nbFaces;
    private int valeur;

    /**
     * permet de construire le dé d'un nombre de faces choisi
     */
    public De(int nbf)
    {
        // initialisation des variables d'instance
        nbFaces = nbf;
    }
    
    /**
     * Grace a cette méthode on simule un nombre compris entre 1 et le nombre de faces
     */
    public void lancerDe()
    {
        Double D = new Double ( nbFaces*Math.random()+1);
        valeur = D.intValue();
    }
    
    /**
     * Retourne la valeur du dé
     */
    public int getValeur()
    {
        return valeur;
    }
        
    /**
     * permet de savoir le nombre de faces et la valeur de la face du dessus
     */
    public String toString(){
        return "La valeur de mon dé à "+nbFaces +" faces est " + valeur;
    }
}
