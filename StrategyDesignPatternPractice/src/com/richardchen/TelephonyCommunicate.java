/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardchen;

/**
 * Communicate method, using Telephone.
 * @author RichardChen
 */
public class TelephonyCommunicate implements CommunicateStrategy{
    @Override
    public void communicate(){
        System.out.println("Using telephone to communicate.");
    }
}
