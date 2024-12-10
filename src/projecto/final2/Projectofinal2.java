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
import javax.swing.ImageIcon;

/**
 *
 * @author longf
 */
public class Projectofinal2 {
    
    static  String nom;
    static int hp=50,atkp=2,defp=2,ronda=0;
    static int cont,ecard;
    static card[] card=new card[53];
    static ArrayList<enemigos> ene=new ArrayList();
    
    //todas las variables que necesitare en la mayoria de la clase y lo pongo en global
    public static void main(String[] args) {

        inicio ini=new inicio ();
        
        
        ene.add(new enemigos("muñeco", 10, 0, 1,true));
        ene.add(new enemigos("🌳¿un arbol?🌳", 23, 1, 1,true));
        ene.add(new enemigos("🌶EL chile🌶️", 20, 3, 0, true));
        ene.add(new enemigos("📦Una caja📦", 25, 2, 2,true));
        ene.add(new enemigos("🛡tanque🛡️", 30, 0, 3,true));
        ene.add(new enemigos("👑¿El jefaso?👑", 40, 4, 4,true));
        //todavia no
        
        
        
        int a= Integer.parseInt("9");
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
        //ImageIcon icono = new ImageIcon(Projectofinal2.class.getResource("/recursos/istockphoto-1441015286-612x612.jpg"));
        


        ini.setVisible(true);
        pantalla.getFrames();
        
        
        
        
        
            //pan.setLocationRelativeTo(null);
        }
    public static void mapa() {
        
        String[][] a=new String[2][6];
        for (int i = 0; i < a[0].length; i++) {
            a[0][i] = "O";
            
        }
        a[1][0]="🎭";
        a[1][1]="🌳";
        a[1][2]="🌶️";
        a[1][3]="📦";
        a[1][4]="🛡️";
        a[1][5]="👑️";
        if (ronda<6)
        a[0][ronda]="X";
        switch (ronda){
            case 6:a[1][5]="💀";
            case 5:a[1][4]="💀";
            case 4:a[1][3]="💀";
            case 3:a[1][2]="💀";
            case 2:a[1][1]="💀";
            case 1:a[1][0]="💀";
                    break;
        }
        JOptionPane.showMessageDialog(null,"🚩───"+a[0][0]+"──["+a[0][1]+" Jefe]───"+a[0][2]+"──["+a[0][3]+" Jefe]───"+a[0][4]+"──[👑"+a[0][5]+" Jefe Final]"+"\n"+
                "                      " + a[1][0] + a[1][1]+ a[1][2] + a[1][3]+ a[1][4] + a[1][5] + "lista de enemigos");
    }
    public static void up(){
      hp=hp+10;
      atkp=atkp+1;
      defp=defp+1;
    }
    public static String toene(){
        return  ene.get(ronda).getNombre() + "\n" + 
               "vida: " + ene.get(ronda).getHp() + "\n" + 
               "atk: " + ene.get(ronda).getAtkp()+ "\n" + 
               "def: " + ene.get(ronda).getDefp()+ "\n";
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
        a = rand.nextInt(0,52);//0,52 ponerlo bien 
        
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
