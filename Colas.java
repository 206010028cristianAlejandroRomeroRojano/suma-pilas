package colas;

import java.util.Scanner;

public class Colas {
    Scanner sc = new Scanner(System.in);
    String Nombres [] = new String[5];
    int tope=0;
    public void agregar(){
    if(tope<Nombres.length){
        System.out.println("ingrese un nombre");
        Nombres[tope]=sc.nextLine();
        tope++;
    }else{System.out.println("no hay espacios");}
    }
    public void eliminar(){
        System.out.println("dato eliminado:   "+Nombres[0]);
        tope--;
        for(int i=0; i <tope;i++){
        Nombres[i]=Nombres[1+1];
        }
    }
    public void mostrar(){
        System.out.println("los datos de las colas  ");
        for(int i=0;i<tope;i++){
            System.out.println("datos: "+i+"  "+Nombres[i]);
        }
    }
    public void ejercutar() {
        Scanner sc = new Scanner(System.in);
        int  opt=0;
        Colas c = new Colas();
        do{
            System.out.println("1-agregar\n"
                    +"2-mostrar\n"
                    +"3-eliminar\n"
                    +"4-salir\n");
            switch(opt= sc.nextInt()){
                case 1:
                  c.agregar();
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

