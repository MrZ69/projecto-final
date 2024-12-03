/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto.final2;

/**
 *
 * @author longf
 */
public class card {
    private int val;
    private char sim;
    private int color;

    @Override
    public String toString() {
        return "card{" + "val=" + val + ", sim=" + sim + ", color=" + color + '}';
    }
    public String tocard() {
        if (color==1)
            return val+" "+sim+"rojo";
        else
            return val+" "+sim+"negro";
    }
    
    
    
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public char getSim() {
        return sim;
    }

    public void setSim(char sim) {
        this.sim = sim;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public card() {
    }

    public card(int val, char sim, int color) {
        this.val = val;
        this.sim = sim;
        this.color = color;
    }
    


}
