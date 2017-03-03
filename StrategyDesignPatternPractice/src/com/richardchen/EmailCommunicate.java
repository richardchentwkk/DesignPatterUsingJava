/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardchen;

/**
 *
 * @author RichardChen
 */
public class EmailCommunicate implements CommunicateStrategy{

    @Override
    public void communicate() {
        System.out.println("Using Email to communicate.");
    }
}
