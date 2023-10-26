/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan2;

/**
 *
 * @author fauziah
 */
public class Ovipar extends Hewan {

    private int mengeramiTelur;
    private String letakTelur;

    public Ovipar() {
        this.letakTelur = "di dalam"; 
    }

    public Ovipar(int mengeramiTelur) {
        this.mengeramiTelur = 21;

    }
    
    public Ovipar(String jenisMakanan) {
        this.setJenisMakanan(jenisMakanan);
    }

    public int getMengeramiTelur() {
        return mengeramiTelur;
    }

   
    public String getLetakTelur() {
        return letakTelur;
    }

    /**
     * @param mengeramiTelur the mengeramiTelur to set
     */
    public void setMengeramiTelur(int mengeramiTelur) {
        this.mengeramiTelur = mengeramiTelur;
    }

    /**
     * @param letakTelur the letakTelur to set
     */
    public void setLetakTelur(String letakTelur) {
        this.letakTelur = letakTelur;
    }

}
