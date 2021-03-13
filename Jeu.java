 /**
 * Cette classe sert à lancer notre jeu grâce à la méthode partie. On pourra définir le nombre de coups
 * que les joueurs vont faire.
 *
 * @author VASSEUR Lilian & PREVOT Samuel
 * @version 10/12/2020
 */
public class Jeu
{
    // Attributs
    private int nbCoups;    //le nombre de coups que les joueurs font
    private Joueur joueur1; 
    private Joueur joueur2;
    private De de;

    /**
     * Le constructeur sert a construire le jeu à partir des 2 joueurs qu'on definit.
     * On lui indique aussi le nombre de coups.
     * 
     * @param1 --> le premier joueur
     * @param2 --> le deuxieme joueur
     * @param3 --> le nombre de coups
     */
    
    public Jeu(Joueur J1, Joueur J2, int nbc, De de1)
    {
        // initialisation des variables d'instance
        joueur1 = J1;
        joueur2 = J2;
        nbCoups = nbc; 
        de = de1;
    }

    /**
     * cette méthode permet de generer une valeur de dé pour le nombre de coups qui est définit
     */
    public void partie() 
    {
        int i;
        int res; 
        System.out.println("*partie*");
        joueur1.reset();
        joueur2.reset();
        for ( i = 0 ; i < nbCoups; i++) {
        de.lancerDe();
        res = de.getValeur();
        joueur1.ajoutPoints(res);
        System.out.println(joueur1.getNom()+ " a fait un " + res + " score = " + joueur1.getScore());
        de.lancerDe();
        res = de.getValeur();
        joueur2.ajoutPoints(res);
        System.out.println(joueur2.getNom()+ " a fait un " + res + " score = " + joueur2.getScore());   
        }
        System.out.println(getgagnant());
    }
    
    /**
     * la méthode sert a savoir le nom du gagnant
     */
    public String getgagnant() 
    {
        String gagne = "egalite  ! ";
        if (joueur1.getScore()  >= joueur2.getScore())
        {
        gagne = joueur1.getNom() + " a gagne  ! ";
        }
        else
        {
        gagne = joueur2.getNom() + " a gagne  ! ";
        }
        return gagne;
    }
     
    /**
    * On renvoie ici le nom des joueurs avec leurs score
    */
    public String tostring() {
        return joueur1 + " -- "+ joueur2 ;
    }    
}
