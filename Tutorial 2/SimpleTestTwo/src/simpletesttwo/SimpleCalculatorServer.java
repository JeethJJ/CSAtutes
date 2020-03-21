/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;

/**
 *
 * @author SE2018453
 */
public class SimpleCalculatorServer {
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connecton is being tested...");
        return true;
    }
    
    public int addIntNumbers(int a , int b){
        System.out.println("[SERVER] - Adding "+a+" and "+ b);
        return a+b;
    }
    
    public int suctractIntNumbers(int a , int b){
        System.out.println("[SERVER] - Adding "+a+" and "+ b);
        return a-b;
    }
    
    public int multiplyIntNumbers(int a , int b){
        System.out.println("[SERVER] - Adding "+a+" and "+ b);
        return a*b;
    }
    
    public int divideIntNumbers(int a , int b) throws Exception{
        if (b==0){
            throw new Exception();
        }
        if (a==0 && b==0){
            throw new Exception();
        }
        System.out.println("[SERVER] - Dividing "+a+" and "+ b);
        return a/b;
    }
    
    // array operations
    
    public int[] addIntNumbersARR(int [] a , int [] b){
        int [] c = null;
        System.out.println("[SERVER] - Adding "+Arrays.toString(a)+" and "+ Arrays.toString(b));
        for(int i=0; i<a.length;i++){
            c[i]=a[i]+b[i];
        }
        return c;
    }
    
    public int[] suctractIntNumbersARR(int [] a , int [] b){
        int [] c = null;
        System.out.println("[SERVER] - Subtracting "+b+" from "+ a);
        for(int i=0; i<a.length;i++){
            c[i]=a[i]-b[i];
        }
        return c;
    }
    
   
    public int[] multiplyIntNumbersARR(int [] a , int [] b){
        int [] c = null;
        System.out.println("[SERVER] - multiplying "+a+" and "+ b);
        for(int i=0; i<a.length;i++){
            c[i]=a[i]*b[i];
        }
        return c;
    }
    
    public int[] divideIntNumbersARR(int [] a , int [] b) throws Exception{
        int [] c = null;
        System.out.println("[SERVER] - Adding "+a+" and "+ b);
        for(int i=0; i<a.length;i++){
            if (b[i]==0){
            throw new Exception();
            }
            if (a[i]==0 && b[i]==0){
            throw new Exception();
            }
            c[i]=a[i]/b[i];
        }
        return c;
    }
    
}
