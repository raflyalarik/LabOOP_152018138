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
public class Konsumen {
    
    private int Id_Konsumen;
    private String Nama;
    private final boolean Ya = true;
    private String Member;
    

    public int getId_Konsumen() {
        return Id_Konsumen;
    }

    public void setId_Konsumen(int Id_Konsumen) {
        this.Id_Konsumen = Id_Konsumen;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getMember() {
        return Member;
    }

    public void setMember(String Member) {
        this.Member = Member;
    }   
}
    
