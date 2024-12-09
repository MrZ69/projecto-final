/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto.final2;

/**
 *
 * @author longf
 */
public class enemigos {
    private String nombre;
    private int hp;
    private int atkp;
    private int defp;
    private boolean esta;

    @Override
    public String toString() {
        return "enemigos{" + "nombre=" + nombre + ", hp=" + hp + ", atkp=" + atkp + ", defp=" + defp + ", esta=" + esta + '}';
    }
    
    public enemigos() {
    }

    public enemigos(String nombre, int hp, int atkp, int defp, boolean esta) {
        this.nombre = nombre;
        this.hp = hp;
        this.atkp = atkp;
        this.defp = defp;
        this.esta = esta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtkp() {
        return atkp;
    }

    public void setAtkp(int atkp) {
        this.atkp = atkp;
    }

    public int getDefp() {
        return defp;
    }

    public void setDefp(int defp) {
        this.defp = defp;
    }

    public boolean isEsta() {
        return esta;
    }

    public void setEsta(boolean esta) {
        this.esta = esta;
    }


}
