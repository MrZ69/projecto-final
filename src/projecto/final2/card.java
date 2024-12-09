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
    private String sim;
    private int val;
    private char sim2;
    private int color;
    private boolean have;

     public String tocard() {
        if (color==1)
            return " "+sim+" "+sim2;
        else
            return " "+sim+" "+sim2;
    }

    @Override
    public String toString() {
        return "card{" + "sim=" + sim + ", val=" + val + ", sim2=" + sim2 + ", color=" + color + ", have=" + have + '}';
    }
    public card() {
    }

    public card(String sim, int val, char sim2, int color, boolean have) {
        this.sim = sim;
        this.val = val;
        this.sim2 = sim2;
        this.color = color;
        this.have = have;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public char getSim2() {
        return sim2;
    }

    public void setSim2(char sim2) {
        this.sim2 = sim2;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isHave() {
        return have;
    }

    public void setHave(boolean have) {
        this.have = have;
    }

    
}
