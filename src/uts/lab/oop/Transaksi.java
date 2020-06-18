/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.lab.oop;

/**
 *
 * @author Dell
 */
public class Transaksi {
    
    private int Id_Transaksi;
    private String Nama_Makanan;
    private int Jumlah;
    

    public int getId_Transaksi() {
        return Id_Transaksi;
    }

    public void setId_Transaksi(int Id_Transaksi) {
        this.Id_Transaksi = Id_Transaksi;
    }

    public String getNama_Makanan() {
        return Nama_Makanan;
    }

    public void setNama_Makanan(String Nama_Makanan) {
        this.Nama_Makanan = Nama_Makanan;
    }

    public int getJumlah(int Jumlah) {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }   
}


