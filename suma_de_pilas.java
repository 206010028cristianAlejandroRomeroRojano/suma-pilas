/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplias;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class suma_de_pilas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam, opt, tope = 0;
        int[] p1 = new int[100];
        int[] p2 = new int[100];
        int[] psuma = new int[100];
        do {
            System.out.println("\n 1-llenar pila A,B\n " + "2-mostrarA,B\n" + "3-vaciar pilas A,B\n" + "4-unir pila A,B\n" + "5-Mostrar pilas A,B\n" + "6-salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    for (int i = 0; i <= 100; i++) {
                        if (tope < 100) {
                            p1[tope] = (int) (Math.random() * 100 + 1);
                            p2[tope] = (int) (Math.random() * 100 + 1);
                            tope++;
                        } else {
                            System.out.println("pilas llena... ");
                        }
                    }
                    break;
                case 2:
                    if (tope > 0) {
                        for (int i = tope - 1; i >= 0; i--) {

                            System.out.println("p1= "+p1[i]);

                            System.out.println("p2="+ p2[i]);
                        }
                    } else {
                        System.out.println("pilas vacia... ");
                    }
                    break;
                case 3:
                    if (tope > 0) {
                        System.out.println("datos eliminado...");
                        for (int i = 0; i <= 100; i--) {
                            tope--;
                        }
                    } else {
                        System.out.println("no hay datos para eliminar...");
                    }
                    break;
                case 4:
                    if (tope < 100) {
                        for (int s = 0; s <= 100; s++) {
                            psuma[tope] = p1[s] + p2[s];
                            tope++;
                        }
                    } else {
                        System.out.println("pilas sumadas");
                    }
                    break;
                case 5:
                    if (100 >=tope) {
                        for (int s = 0; s < 100; s++) {
                            psuma[s] = p1[s] + p2[s];
                            System.out.print(" " + psuma[s]);
                            s++;
                        }
                    } else {
                        System.out.println("pilas vacia... ");
                    }
                    break;
            }
        } while (opt != 6);
    }
}
