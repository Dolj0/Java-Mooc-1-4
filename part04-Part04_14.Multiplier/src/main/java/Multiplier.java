/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Multiplier {
    
    private int number;
    
    public Multiplier(int firNumber){
        this.number = firNumber;
    }
    
    public int multiply(int secNumber){
        int i = number*secNumber;
        return i;
    }
    
}
