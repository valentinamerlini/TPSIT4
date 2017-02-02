/*Chiedere in input il numero di finestre da visulizzare e success
 */
package finestre1;

import java.util.Scanner;

public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Finestra f;
        int n;
        int x;
        int posx = 0, posy = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Numero di finestre da visualizzare: ");
            n = input.nextInt();
        } while ((n < 1) || (n > 20));

        for (x = 0; x < n; x++) {
            f = new Finestra();
            f.setVisible(true);
            posx = posx + 150;
            posy = posy + 50;
            f.setLocation(posx, posy);
            f.Testo.setText("Sono la finestra " + (x + 1));
            f.setTitle("Finestra numero " + (x + 1));
        }
    }

}
