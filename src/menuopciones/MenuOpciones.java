/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopciones;

/**
 *
 * @author luis endara
 */
import java.util.Scanner;
public class MenuOpciones {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in) ;
        
        do {     
            System.out.println("1. Enseñar por pantalla Este es mi Menu");
             System.out.println("2. Enseñaremos por pantalla los numeros entre 5 y 10.");
              System.out.println("3. Enseñar por pantalla Hola soy Mauricio ");
               System.out.println("Introduce una opcion: ");
               a = s.nextInt();//recoger la opcion en a 
               
            
        } while (a > 3  || a < 1);//numero menor0 que 3 pára salir
        
        switch(a){
            case 1:
                System.out.println("Este es mi Menu.");
                break;
            case 2:
                for(int i = 5; i<10; i++){
                    System.out.println(i+" ");
                }
                break;
            case 3:
                System.out.println("Hola soy Mauricio.");
                break;
            default:// a vale 0 ejecutara el desault 
                System.out.println("Elige una opcion correcta.");
        }
        
    }
    
}
