package elgamal;

import java.math.BigInteger;
import java.security.SecureRandom;


public class ElGamal {
    private static int bitlen = 1024;
    private static ElGamal instance = null;
    private BigInteger p;

    private ElGamal() {
    }
    
    public static ElGamal getInstance(){
        if(instance==null)
            instance = new ElGamal();
        return instance;
    }
    
    public void generateKeys(){
        SecureRandom srnd = new SecureRandom();
        p = new BigInteger(bitlen, 100, srnd);
        
    }
    
    public BigInteger encrypt(BigInteger plainText){
        return plainText;
    }
    
    public BigInteger decrypt(BigInteger plainText){
        return plainText;
    }
    
    
}
