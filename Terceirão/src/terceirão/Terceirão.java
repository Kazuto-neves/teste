
package terceirão;
 import javax.swing.JOptionPane;
public class Terceirão {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "virus!!!!!!!", "alerta", 3);
        Object obj = new Object();
        Object obj1 = new Object();
        
        boolean status = obj.equals (obj);
        
        System.out.println(";) ===> " +status);
        
        String palavra = new String ("faetec");
        String palavra1 = "faetEc";
        
        System.out.println(palavra.toUpperCase());
        
        boolean status1 = palavra.equals(palavra1);
        System.out.println(";) ===> " +status1);
        
    }
    
}
