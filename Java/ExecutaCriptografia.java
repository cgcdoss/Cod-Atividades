package ideias;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ExecutaCriptografia {

    public static void main(String[] args) {
        Criptografia crip = new Criptografia();
        crip.criptografa();
        crip.descriptografa(crip.getCripto());
    }

}
