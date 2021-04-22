/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author bianchi.emmanuele
 */import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teruzzi.luca
 */
public class Seriazlizzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Studente []a = { new Studente("Pino", "Varenna", 16), new Studente("Mettew", "Polli", 17), new Studente("Cristiano", "Sium", 18)};
        
        try { 
            FileOutputStream o=new FileOutputStream("test.ser");
            ObjectOutputStream os=new ObjectOutputStream(o);
            os.writeObject(a);
//            os.writeObject(9);
//            os.writeObject("Ciao");
//            os.writeObject((float)1.345);
//            os.writeObject(true);
//            os.writeObject('a');
//            os.flush();
//            os.close();
            FileInputStream i=new FileInputStream("test.ser");
            ObjectInputStream is =new ObjectInputStream(i);
            Studente []s = new Studente[a.length];
             s = (Studente[]) is.readObject();
             for(Studente t: s){
                 System.out.println(t.toString());
             }
            
//            Integer v1=(Integer) is.readObject();
//            System.out.println("v1:"+v1);
//            String v2=(String) is.readObject();
//            System.out.println("v2:"+v2);
//            Float v3=(Float) is.readObject();
//            System.out.println("v3:"+v3);
            StudentiCasuali sc = new StudentiCasuali();
            Thread b = new Thread(sc);
            b.start();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.err.println("Hai rotto java");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Seriazlizzazione.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

}
