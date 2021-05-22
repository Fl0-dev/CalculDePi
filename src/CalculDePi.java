/**
 * Calcul de pi selon la méthode de Leibniz
 * @author Florian
 * @date 22/05/21
 * @version 1.0
 */
public class CalculDePi {
    public static void main(String[] args) {
        //création et initialisation à 0
        double pi = 0;
        //création du dénominateur
        double dem =1;
        //boucle jusqu'à 1000000000
        for (int i = 0; i < 1000000000; i++) {
            //si i pair addition
            if (i % 2 == 0) {
                pi = pi + 4*(1f/ dem);
            }
            //sinon soustraction
            else {
                pi= pi - 4*(1f/dem);
            }
            //changement du dénominateur
            dem= dem+2;
        }
        //affichage de pi
        System.out.println(pi);
    }
}

