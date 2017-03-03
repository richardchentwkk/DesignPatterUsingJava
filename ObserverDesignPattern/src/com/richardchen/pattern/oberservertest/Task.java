/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richardchen.pattern.oberservertest;

/**
 * Task class define here.
 * @author Richard_Chen
 * @since 2015/10/01
 */
class Task {
    private String filename;
    private String packagename;
    public Task(String filename, String packagename){
        this.filename = filename;
        this.packagename = packagename;
    }
    
    /**
     * Set file name method
     * @return true if set success.
     */
    public boolean setfilename(String filename){
        this.filename = filename;
        return true;
    }
    
    /**
     * Set project name class.
     */
    public boolean setprojectname(String packagename){
        this.packagename = packagename;
        return true;
    }
    
    /**
     * Get methods define here.
     */
    public String getfilename(){return filename;}
    public String getpackagename(){return packagename;}
    
    
}
