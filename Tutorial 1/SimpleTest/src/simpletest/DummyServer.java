/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletest;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author SE2018453
 */
public class DummyServer {
    
    String name;
    LocalDateTime date;
    
    public DummyServer(String name){
        this.name=name;
        this.date=LocalDateTime.now();
    }
    
    String testConnection(String client){
        System.out.println("Dummyserver. Connection being tested...");
        System.out.println("Server name : "+ name);
        System.out.println("Server started at : " + date);
        return "Connection from client "+ client +" succeded...";
    }
}
