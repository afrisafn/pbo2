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
public class Ovovivipar extends Hewan {
    
   //overload 
    public Ovovivipar (String caraBerkembangbiak){
      this.setCaraBerkembangbiak(caraBerkembangbiak);
        
    }
    
   public Ovovivipar(String caraBerkembangbiak, String jenisMakanan){
      super.setJenisMakanan(jenisMakanan);
      
   }
   
   public Ovovivipar(String caraBerkembangbiak, String jenisMakanan, String habitat){
       this.setJenisMakanan(jenisMakanan);
       this.setHabitat(habitat);
   }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
}
