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
public class Vivipar extends Hewan {
    
    private String alatPendengaran; 
    private String pelindungTubuh;

    public Vivipar (String alatPendengaran) {
        System.out.println("daun telinga" +alatPendengaran);
    }
    
    public Vivipar() {
           super(" ");
        System.out.println("hidup di darat");
    }
    public Vivipar(String alatPendengaran, String jenisMakanan) {
     
        System.out.println(alatPendengaran+" "+ jenisMakanan);
        
    }
    
    
   
    public String getAlatPendengaran() {
        return alatPendengaran;
    }

    /**
     * @return the pelindungTubuh
     */
    public String getPelindungTubuh() {
        return pelindungTubuh;
    }

    public void setAlatPendengaran(String alatPendengaran) {
        this.alatPendengaran = alatPendengaran;
    }

    /**
     * @param pelindungTubuh the pelindungTubuh to set
     */
    public void setPelindungTubuh(String pelindungTubuh) {
        this.pelindungTubuh = pelindungTubuh;
    }
    
   
}
