package Model;

import Interfaces.interfaces;

public class Perhitungan implements interfaces {
    public int a;
    public int b;
    private int hasil;


    public Perhitungan(int a, int b, int hasil) {
        this.a = a;
        this.b = b;
        this.hasil = hasil;
        printJudulClass("Jadi judul dalam class perhitungan");
    }

    private void printJudulClass(String jdl) {
        System.out.println(jdl);
    }


    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalam Interfaces");
    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;
    }

    public int hsltmbh(int a1, int b2) {
        this.a = a1;
        this.b = b2;
        HitungTambah();
        return this.hasil;
    }

    public int hslkli (int _a, int _b){
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.hasil;
    }
}
