/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardchen;

import com.richardchen.*;

/**
 *
 * @author RichardChen
 */
public class StrategyDesignpattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baseclass test = new Baseclass();
        test.communicate(new TelephonyCommunicate());
        test.communicate(new EmailCommunicate());
    }
    
}
