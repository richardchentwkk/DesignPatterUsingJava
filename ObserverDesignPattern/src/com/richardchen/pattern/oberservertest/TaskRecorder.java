/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardchen.pattern.oberservertest;

/**
 *
 * @author Richard_Chen
 */
public class TaskRecorder implements TaskListener{

    @Override
    public void taskadded(TaskEvent event) {
        System.out.println("Added, event filename:"+event.filename+" packname:"+event.packagename);
    }

    @Override
    public void taskremoved(TaskEvent event) {
        System.out.println("Removed, event filename:"+event.filename+" packname:"+event.packagename);
    }
    
    
}
