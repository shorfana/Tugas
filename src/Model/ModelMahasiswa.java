/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JTextField;

/**
 *
 * @author shorfana
 */
public class ModelMahasiswa {

    String NIM;
    String NAMA;

    public ModelMahasiswa(String NIM, String NAMA) {
        this.NIM = NIM;
        this.NAMA = NAMA;

    }

    public String getNIM() {
        return NIM;
    }

    public String getNAMA() {
        return NAMA;
    }

}
