/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest;

/**
 *
 * @author SE2018453
 */
public class SimpleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleTest test2 = new SimpleTest();
        execute();
    }

    private static void execute() {
        DummyServer test = new DummyServer("Server 01");
        System.out.println(test.testConnection("50"));
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
