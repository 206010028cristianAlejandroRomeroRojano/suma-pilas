package colas;

import java.util.Scanner;

public class pilas_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt=0;
        System.out.println("elije un programa de colas:");
        System.out.println("1-datos de nombres\n"
                + "2-datos de autos\n"
                + "3-salir\n"); 
     switch(opt= sc.nextInt()){
                case 1:
                    Colas ven = new Colas();
                    ven.ejercutar();
                  break;
                case 2:
                     autos llamar = new autos();
                    llamar. ejercicio_2();
                    break;
        } while (opt !=4); 
    }
    }
    

