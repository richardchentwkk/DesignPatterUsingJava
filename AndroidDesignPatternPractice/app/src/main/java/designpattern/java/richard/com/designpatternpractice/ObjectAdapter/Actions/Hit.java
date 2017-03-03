package designpattern.java.richard.com.designpatternpractice.ObjectAdapter.Actions;

import designpattern.java.richard.com.designpatternpractice.ObjectAdapter.ActionBase.ActionBase;

/**
 * Created by Richard_Chen on 2016/2/5.
 */
public class Hit implements ActionBase{

    @Override
    public void display() {
        System.out.println("This is the Hit class display.");
    }

    @Override
    public String showClassName() {
        return this.getClass().toString();
    }

    @Override
    public String doAction() {
        return "Hit";
    }
}
