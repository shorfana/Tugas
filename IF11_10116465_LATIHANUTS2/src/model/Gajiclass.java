/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shorfana
 */
public class Gajiclass {
    private String Nama;
    private String Alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int GajiPokok;
    private int totalGaji;

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return GajiPokok;
    }

    public void setGajiPokok(int GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }


    public int Totalgaji(){
        totalGaji = getUangTunjangan() + getUangTransport() + getGajiPokok();
        return totalGaji;
    } 
    
}
