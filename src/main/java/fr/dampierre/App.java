package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int salaire = 400;
        int prime = 250;
        int quota = 10;

        Scanner clavier = new Scanner (System.in);

        System.out.println("Saisissez le nombre de ventes sur la semaine");

        int vente = clavier.nextInt();

        if (vente >= quota) {
            salaire = salaire + prime;
            System.out.println("Félicitations vous avez obtenu une prime de " + prime);
        } else {
        int ecart = quota - vente;

        System.out.println("Il vous manque " + ecart + " vente pour obtenir la prime");
        }
        System.out.println("Le salaire est de " + salaire + " euros");
    }
}