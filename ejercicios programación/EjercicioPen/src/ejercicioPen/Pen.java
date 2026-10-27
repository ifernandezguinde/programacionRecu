/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioPen;

import java.util.Scanner;

/**
 *
 * @author daw2al07
 */
public class Pen {

    public Pen() {
    }

    public static int getINK() {
        return INK;
    }

    public static void setINK(int INK) {
        Pen.INK = INK;
    }

       
    
    
    public static int INK = 30;
    
    
    private void write(){
        int palabras;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("introduce o número palabras a escribir:");
            palabras = scan.nextInt();

            if (INK >= palabras){
                INK -= palabras;
                System.out.println("escribíronse " + palabras + " palabras... quedan " + INK);
            } else {
                System.out.println("non hay tinta suficiente");
            }
        } while (INK > 0);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.write();
        
    }
    
}
