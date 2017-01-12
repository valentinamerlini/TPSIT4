/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;

import java.util.Scanner;

/**
 *
 * @author studente
 */
public class AreaPerimetroTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float l1, l2, l3, max;
        float h;
        float perimetro;
        float area;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserire l1:");
            l1 = input.nextInt();

            System.out.println("Inserire l2:");
            l2 = input.nextInt();

            System.out.println("Inserire l3:");
            l3 = input.nextInt();

            System.out.println("Inserire l'altezza:");
            h = input.nextInt();

            System.out.println("---ERROR: NON E'UN TRIANGOLO---");

        } while ((h < 0) || (l1 < 0) || (l2 < 0) || (l3 < 0) || (l1 > l2 + l3) || (l2 > l1 + l3) || (l3 > l2 + l1));

        perimetro = l1 + l2 + l3;
        area = (l1 * h) / 2;

        System.out.println("PERIMETRO:" + perimetro);
        System.out.println("AREA:" + area);
    }

}
