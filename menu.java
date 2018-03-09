/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagen;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author UTBIS
 */
public class menu {
    
     public static void main(String[] args) {
        
        ArrayList<String> autos = new ArrayList();
        
         autos Autos = new autos ("Rojo",false,"Audi","14J-23",5); //Atributos de la variable Autos
          autos Autos1 = new autos ("Amarilo",true,"Tsuru","dian-22",4);//Atributos de la variable Autos1
          autos Autos2 = new autos ("Gris",true,"Volskwagen","nan-14",5);//Atributos de la variable Autos2
          autos Autos3 = new autos ("Negro",false,"Chevrolet","aby-25",8);//Atributos de la variable Autos3
          autos Autos4 = new autos ("Blanco",false,"Ford","hh8-88",10);//Atributos de la variable Autos4
          
 
          
           System.out.println("*BIENVENIDO AL MENU*\n");
       
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
           
         
       
            
           System.out.println("1. Info Autos");//Opciones del menu
           System.out.println("2. Modificar Auto");
           System.out.println("3. Salir");
            
           System.out.println("Escribe una de las opciones");//Escoger opcion del menu
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                    System.out.println("Primer auto\n");
                   Autos.getcolor();
                   Autos.getnombre();
                   Autos.getprender();
                   Autos.getnumpersons();
                   Autos.getid();
               System.out.println("\n");
                   
                   System.out.println("Segundo auto\n");
                   Autos1.getcolor();
                   Autos1.getnombre();
                   Autos1.getprender();
                   Autos1.getnumpersons();
                   Autos1.getid();
                   System.out.println("\n");
                   
                   System.out.println("Tercer auto\n");
                    Autos2.getcolor();
                   Autos2.getnombre();
                   Autos2.getprender();
                   Autos2.getnumpersons();
                   Autos2.getid();
                   System.out.println("\n");
                   
                   System.out.println("Cuarto auto\n");
                    Autos3.getcolor();
                   Autos3.getnombre();
                   Autos3.getprender();
                   Autos3.getnumpersons();
                   Autos3.getid();
                   System.out.println("\n");
                   
                   System.out.println("Quinto auto\n");
                    Autos4.getcolor();
                   Autos4.getnombre();
                   Autos4.getprender();
                   Autos4.getnumpersons();
                   Autos4.getid();
                   System.out.println("\n");
                    
                   
                   
                  break;
               
               case 2:
                   
                   Autos.setcolor("gris");
                   Autos.setnombre("Ford");
                   Autos.setprender(false);
                   Autos.setnumpersons(4);
                   Autos.setid("5052");
                   
                   
                    Autos1.setcolor("verde");
                   Autos1.setnombre("Nissan");
                   Autos1.setprender(true);
                   Autos1.setnumpersons(8);
                   Autos1.setid("874-s");
                   
                    Autos2.setcolor("Rosa");
                   Autos2.setnombre("785");
                   Autos2.setprender(false);
                   Autos2.setnumpersons(78);
                   Autos2.setid("475-pl");
                   
                   
                    Autos3.setcolor("Azul");
                   Autos3.setnombre("Ferrari");
                   Autos3.setprender(true);
                   Autos3.setnumpersons(1);
                   Autos3.setid("1601-ng");
                   
                   
                    Autos4.setcolor("Cafe");
                   Autos4.setnombre("Lamborgini");
                   Autos4.setprender(true);
                   Autos4.setnumpersons(44);
                   Autos4.setid("7475-oi");
                   
                   
                   
               
               
                   break;
                case 3:
                   salir=true;
                   break;
               
           }//cierre del switch
            for(String recorrido:autos)
{
    System.out.println(recorrido);
}
            
       }
        
    }//cierre del metodo main
     
} 

