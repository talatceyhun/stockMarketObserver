/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Talat Ceyhun
 */
public class NesneProje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        
        MyObserver goz4 = new MyObserver("4");
        Firma B = new Firma("B",50);
        B.addObserver(goz4);
        
        Firma C = new Firma("C",70);        
        MyObserver goz3 = new MyObserver("3");
        C.addObserver(goz3);
        MyObserver goz2 = new MyObserver("2");
        C.addObserver(goz2);
        
        Firma D = new Firma("D",50);  
        D.addObserver(goz3);
        
        Firma E = new Firma("E", 60);
        E.addObserver(goz2);
        
        Firma A = new Firma("A",90);
        MyObserver goz1 = new MyObserver("1");       
        A.addObserver(goz1);
        

    }
    
    public static synchronized void dosyayaYaz(String bildiri){
        
        File file = new File("sonuçlar.txt");
        
        try{


            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(bildiri);
            bw.newLine();
            bw.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
}
