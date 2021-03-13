
/**
 * La classe Joueur permet de créer des joueur pour notre jeu. Elle permet de leur donner un nom et un score.
 * Les méthodes permettent  d'ajouter des points au score du joueur, de connaitre son nom et son score.
 * On peut aussi remettre le nom du joueur à zéro.
 * 
 *
 * @author VASSEUR Lilian & PREVOT Samuel
 * @version 10/12/2020
 */
public class Joueur
{
    // Attributs
    private String nom; //nom du joueur
    private int score;  //score du joueur

    /**
     * Constructeur d'objets de classe joueur
     * 
     * @param n ---> le nom du nouveau joueur
     */
    public Joueur(String n)
    {
        // initialisation des variables d'instance
        nom = n;
        score = 0;
    }
    
    /**
     * la méthode ajoutPoints doit permettre d'ajouter les points que le joueur vient de
     * faire afin d'avoir le score final
     * 
     * @param point ---> le score du lancé de dé
     */
    public void ajoutPoints(int point)
    {
        if (point>0)
        {
            score += point;
        }
    }
    
    /**
     * "getNom" sert a connaitre le nom du joueur
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * "getScore" sert a connaitre le score du joueur
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * "reset" sert a remettre le score du joueur à 0
     */
    public void reset()
    {
        score = 0;
    }
    
    
    /**
     *On peut connaitre le nom et le score d'un joueur grace a cette méthode
     */
    public String toString()
    {
        return nom + " : " + score; 
    }
}
