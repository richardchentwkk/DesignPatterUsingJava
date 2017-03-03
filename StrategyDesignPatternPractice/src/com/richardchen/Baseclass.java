/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardchen;

/**
 *  Base class to practice inheritence
 * @author RichardChen
 */
public class Baseclass {
    private static int BASE_INT = 100;
    protected final String Classname = "BASECLASS"; 
    
    private void Baseclass(){
        System.out.println("Begin of the constructor.");
    }
    
    /**
     * Test pulic class can call and implement to child class
     */
    public void print(){
        System.out.print("This is test from superclass.");
    }
    
    /**
     * Test protected modifier can worked both parent and child class
     */
    protected void showparent(){
        System.out.print("Superclass is:"+Classname);
    }
    
    /**
     * Private class, this can not call by child or other class.
     */
    private void onlyforparent(){
        System.out.println("This method is only for parent class:"+Classname);
    }
    
    /**
     * Communicate methods, using Strategy design pattern to implement.
     * @param communicate Communicate strategies.
     */
    
    public void communicate(CommunicateStrategy communicate){
        System.out.print("This is the test start of Strategy design pattern.");
        communicate.communicate();
    }
}
