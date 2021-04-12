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
        System.out.println("singrese el numero de pila");
        
        int numero;
        numero =0;
        int[] p1 = new int[       tam=sc.nextInt()];
        int[] p2 = new int[       tam=sc.nextInt()];
        int[] psuma = new int[       tam=sc.nextInt()];
        do {
            System.out.println("\n 1-llenar pila A,B\n " + "2-mostrarA,B\n" + "3-vaciar pilas A,B\n" + "4-unir pila A,B\n" + "5-Mostrar pilas A,B\n" + "6-salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    for (int i = 0; i <= tam; i++) {
                        if (tope < tam) {
                            p1[tope] = (int) (Math.random() * 100 + 1);
                            p2[tope] = (int) (Math.random() * 200 + 100);
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
                            numero--;
                        }
                    } else {
                        System.out.println("no hay datos para eliminar...");
                    }
                    break;
                case 4:
                    if (tope < tam) {
                        for (int s = 0; s <= tam; s++) {
                            psuma[s] = p1[s] + p2[s];
                            s++;
                        }
                    } else {
                        System.out.println("pilas sumadas");
                    }
                    break;
                case 5:
                    if (tope>0) {
                        for (int s = tope -1; s >=0; s--) {
                            psuma[s] = p1[s] + p2[s];
                            System.out.println(" " + psuma[s]);
                            
                        }
                    } else {
                        System.out.println("pilas vacia... ");
                    }
                    break;
            }
        } while (opt != 6);
    }
}
