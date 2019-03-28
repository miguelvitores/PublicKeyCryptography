package dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            DSA dsa = DSA.getInstance();
            dsa.generateKeys();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Escribe un texto plano para encriptar: ");
            String text1 = br.readLine();
            System.out.println("Plaintext: " + text1);
            BigInteger plaintext = new BigInteger(text1.getBytes());
            
            BigInteger ciphertext = dsa.encrypt(plaintext);
            System.out.println("Ciphertext: " + ciphertext);
            plaintext = dsa.decrypt(ciphertext);
            
            String text2 = new String(plaintext.toByteArray());
            System.out.println("Plaintext: " + text2);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
