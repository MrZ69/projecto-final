/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto.final2;

/**
 *
 * @author longf
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author longf
 */
public class Projectofinal2 {
    
    static  String nom;
    static int hp=100,atkp=0,defp=0;
    static boolean buffr,buffb;
    static card[] card=new card[52];
    //todas las variables que necesitare en la mayoria de la clase y lo pongo en global
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tl = new Scanner(System.in);
        Random rand=new Random();
        
        //System.out.println("Hello World!");
        
        pantalla pan=new pantalla();
        //todavia no
        /*do{
        nom=JOptionPane.showInputDialog("Cual es tu nombre:♥");
        }while(nom.isEmpty());
        JOptionPane.showMessageDialog(null,"owo");
        pantalla.getFrames();*/
        
        
        
        //int a= Integer.parseInt("9");
        int alv=0, cont=0;
        char s='a';
        for(int i=0;i<4;i++){ //crear las cartas como objetos para despues poder modificarlas si paso algo
            switch(i){
                case 0 -> s='♥';
                case 1 -> s='♦';
                case 2 -> s='♣';
                case 3 -> s='♠';
            }
            if (i==0 ||i==1)
                alv=1;
            if (i==2 ||i==3)
                alv=2;
            for(int c=1;c<=10;c++){
                card[cont]=new card(c,s,alv);
                cont++;
            }
            for (int c = 0; c < 3; c++) { // J, Q, K
            card[cont] = new card(10, s, alv); 
            cont++;
    }

            
        }
        for(int i=0;i<52;i++){
            System.out.println(card[i]);
        }
        
        pan.setVisible(true);
        
        //pan.setLocationRelativeTo(null);
    }
    
    public static String tostats() {//enseñar stats
        return "Nombre: " + nom + "\n" + 
               "vida: " + hp + "\n" + 
               "atk: " + atkp + "\n" + 
               "def: " + defp + "\n";
    }   
    
    public static card[] getCards() {
    return card;
}
}
//System.out.println("");
