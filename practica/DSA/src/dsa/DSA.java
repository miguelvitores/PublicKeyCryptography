/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author mvitores7977
 */
public class DSA {
    
    private static int bitlen = 1024;
    
    private static DSA instance = null;

    private DSA() {
    }
    
    public static DSA getInstance(){
        if(instance==null)
            instance = new DSA();
        return instance;
    }
    
    public void generateKeys(){
        
    }
    
    
}
