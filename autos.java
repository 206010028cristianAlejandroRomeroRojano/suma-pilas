/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colas;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class autos {
 Scanner sc = new Scanner(System.in);
    String auto [] = new String[3];
    int tope=0;
    public void tipo_de_autos(){
    if(tope<auto.length){
        System.out.println("ingrese un nombre de auto");
        auto[tope]=sc.nextLine();
        tope++;
    }else{System.out.println("no hay espacios");}
    }
     public void color(){
    if(tope<auto.length){
        System.out.println("ingrese el color");
       auto[tope]=sc.nextLine();
        tope++;
    }else{System.out.println("no hay espacios");}
    } public void marca(){
    if(tope<auto.length){
        System.out.println("ingrese la marca");
       auto[tope]=sc.nextLine();
        tope++;
    }else{System.out.println("no hay espacios");}
    }
    public void eliminar(){
        System.out.println("dato eliminado:   "+auto[0]);
        tope--;
        for(int i=0; i <tope;i++){
        auto[i]=auto[1+1];
        }
    }
    public void mostrar(){
        System.out.println("los datos de las colas  ");
        for(int i=0;i<tope;i++){
            System.out.println("datos: "+i+"  "+auto[i]);
        } 
    }
    public  void ejercicio_2() {
        Scanner sc = new Scanner(System.in);
        int  opt=0;
        autos c = new autos();
        do{
            System.out.println("1-agregar datos pedidos\n"
                    +"2-mostrar\n"
                    +"3-eliminar\n"
                    +"4-salir\n");
            switch(opt= sc.nextInt()){
                case 1:
                  c.tipo_de_autos();
                  c.color();
                  c.marca();
                    break;
                case 2:
                   c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                    break;
        }
        } while (opt !=4); 
        
    }
    
}