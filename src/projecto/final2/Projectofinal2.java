/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto.final2;

/**
 *
 * @author longf
 */
import java.util.ArrayList;
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
    static int hp=50,atkp=2,defp=2,ronda=0;
    static int cont,ecard;
    static card[] card=new card[53];
    static enemigos enen=new enemigos();
    
    //todas las variables que necesitare en la mayoria de la clase y lo pongo en global
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tl = new Scanner(System.in);
        Random rand=new Random();
        
        pantalla pan=new pantalla();
        enen.setNombre("muneco");//poner primer enemigo
        enen.setHp(10);
        enen.setAtkp(0);
        enen.setDefp(2);
        //todavia no
        /*
        do{
        nom=JOptionPane.showInputDialog("Cual es tu nombre:♥");
        }while(nom.isEmpty());
        //stats1.setText(Projectofinal2.tostats());
        
        JOptionPane.showMessageDialog(null,"owo");
        pantalla.getFrames();
        JOptionPane.showInputDialog("▯");
        */
        
        
        
        
        //int a= Integer.parseInt("9");
        int color=0,cont=0;
        String signo1="?";
        char signo2='?';
        
        for(int i=0;i<4;i++){ //crear las cartas como objetos para despues poder modificarlas si paso algo
            switch(i){
                case 0 -> signo2='♥';
                case 1 -> signo2='♦';
                case 2 -> signo2='♣';
                case 3 -> signo2='♠';
            }
            if (i==0 ||i==1)
                color=1;
            if (i==2 ||i==3)
                color=2;
            
            for(int numero=1;numero<=10;numero++){
                if (numero==1){
                card[cont]=new card("A",11,signo2,color,true);    
                }else
                card[cont]=new card(String.valueOf(numero),numero,signo2,color,true);
                cont++;
            }
            for (int c = 0; c < 3; c++) { // J, Q, K
                switch (c){
                    case 0 -> signo1="J";
                    case 1 -> signo1="Q";
                    case 2 -> signo1="K";
                }
            card[cont] = new card(signo1,10, signo2, color,true); 
            cont++;
            }
            
        }
        card[52]=new card("",0,' ',0,true);//carta con valor cero para tenerlo en un lugar donde no tenga nada
        for(int i=0;i<card.length;i++){
            System.out.printf ("verficacion de cartas"+card[i]);
            System.out.println();
        }
        
        pan.reiniciarcard();
        pan.reiniciarpantalla();
        pan.setVisible(true);
        
        
            //pan.setLocationRelativeTo(null);
        }
    public void mapa() {
        
        char[][] a=new char[2][6];
        for (int i = 0; i < a[0].length; i++) {
            a[0][i] = 'O';
        }
        for (int i = 0; i < a[1].length; i++) {
            a[1][i] = 'V';  
        }
        a[0][ronda]='X';
        switch (ronda){
            case 5:a[1][5]='Z';
            case 4:a[1][4]='Z';
            case 3:a[1][3]='Z';
            case 2:a[1][2]='Z';
            case 1:a[1][1]='Z';
            case 0:a[1][0]='Z';
        }
        JOptionPane.showMessageDialog(null,"🚩───"+a[0][0]+"──["+a[0][1]+" Jefe]───"+a[0][2]+"──["+a[0][3]+" Jefe]───"+a[0][4]+"──[👑"+a[0][5]+" Jefe Final]"+"\n"+
                "────"+a[1][0]+"──["+a[1][1]+" ----]───"+a[1][2]+"──["+a[1][3]+" ----]───"+a[1][4]+"──[-"+a[1][5]+" ----------]");
    }
    
    public static String toene(){
        return  enen.getNombre() + "\n" + 
               "vida: " + enen.getHp() + "\n" + 
               "atk: " + enen.getAtkp()+ "\n" + 
               "def: " + enen.getDefp()+ "\n";
    }
    
    public static void restableserenemigos() {
        switch (ronda){
            case 1:
                enen.setNombre("¿un arbol?");
                enen.setHp(13);
                enen.setAtkp(1);
                enen.setDefp(2);
                break;
            case 2:
            enen.setNombre("EL chile");
                enen.setHp(6);
                enen.setAtkp(5);
                enen.setDefp(0);
                break;
            case 3:
                enen.setNombre("Una caja");
                enen.setHp(15);
                enen.setAtkp(2);
                enen.setDefp(3);
                break;
            case 4:
                enen.setNombre("tanque");
                enen.setHp(20);
                enen.setAtkp(0);
                enen.setDefp(4);
                break;
            case 5:
                enen.setNombre("¿El jefaso?");
                enen.setHp(30);
                enen.setAtkp(5);
                enen.setDefp(5);
                break;  
        }
    }
    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Projectofinal2.nom = nom;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int hp) {
        Projectofinal2.hp = hp;
    }

    public static int getAtkp() {
        return atkp;
    }

    public static void setAtkp(int atkp) {
        Projectofinal2.atkp = atkp;
    }

    public static int getDefp() {
        return defp;
    }

    public static void setDefp(int defp) {
        Projectofinal2.defp = defp;
    }

    public static int getRonda() {
        return ronda;
    }

    public static void setRonda(int ronda) {
        Projectofinal2.ronda = ronda;
    }
    
    
    public static String tostats() {//enseñar stats
        return nom + "\n" + 
               "vida: " + hp + "\n" + 
               "atk: " + atkp + "\n" + 
               "def: " + defp + "\n";
    }
    public static int getrandom(){
        Random rand=new Random();
        int a;
        do{
        a = rand.nextInt(0,52);//0,52 ponerlo bien depuesaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        
        /*int alv =rand.nextInt(0,2);
        if (alv==0)
            a = rand.nextInt(13,20);
        if (atkp==0){
            a=0;
            atkp=1;
        }
        if (a>0&& atkp==1){
            a=13;
            atkp=2;
        }*/
        
        }while (!card[a].isHave());
        card[a].setHave(false);
        return a;
    }
    
    public static void renovar(){
        for(int i=0;i<card.length;i++){
            card[i].setHave(true);
            if (card[i].getSim()=="a"){
                card[i].setSim("A");
                card[i].setVal(11);
            }
                
        }
    }
    public static card[] getCards() {
    return card;
}
}
//System.out.println("");
