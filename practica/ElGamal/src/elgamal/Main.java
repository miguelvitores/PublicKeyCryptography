package elgamal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            ElGamal eg = ElGamal.getInstance();
            eg.generateKeys();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Escribe un texto plano para encriptar: ");
            String text1 = br.readLine();
            System.out.println("Plaintext: " + text1);
            BigInteger plaintext = new BigInteger(text1.getBytes());
            
            BigInteger ciphertext = eg.encrypt(plaintext);
            System.out.println("Ciphertext: " + ciphertext);
            plaintext = eg.decrypt(ciphertext);
            
            String text2 = new String(plaintext.toByteArray());
            System.out.println("Plaintext: " + text2);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
