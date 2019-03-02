/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;


/**
 *
 * @author Talat Ceyhun
 */
public class MyObserver implements IObserver{
    private String isim;

    public MyObserver(String isim) {
        this.isim = isim;
    }
    
    @Override
    public void notify(String Message) {

        NesneProje2.dosyayaYaz(Message+ " olarak güncellendi!");
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    
    
    
}
