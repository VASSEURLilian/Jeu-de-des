
/**
 *La calsse Test permet de simuler plus rapidement une partie de 10 coups avec un dé de 6 faces.
 *
 * @author VASSEUR Lilian & PREVOT Samuel
 * @version 10/12/2020
 */
public class Test
{

    /**
     * Cette méthode simule toute la partie
     */
    public static void main(String [] args)
    {
        Joueur jA = new Joueur("michel");
        Joueur jB = new Joueur("sarran");
        De de1 = new De(6);
        Jeu jeu2 = new Jeu(jA, jB, 10, de1);
        jeu2.partie();
    }
}
