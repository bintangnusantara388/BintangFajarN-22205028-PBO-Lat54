/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kordinat54;

/**
 *
 * @author User
 */
public class Kordinat54 {

    protected int x;
    protected int y;

    public Kordinat54(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class WarnaKoordinat extends Kordinat54 {
    private String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}

    class Main {
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(0, 0, "");
        wk.setNamaWarna("Jingga");
        wk.setX(10);
        wk.setY(4);
        System.out.println("Warna Koordinat: " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x: " + wk.getX() + ", y: " + wk.getY());
    }
}