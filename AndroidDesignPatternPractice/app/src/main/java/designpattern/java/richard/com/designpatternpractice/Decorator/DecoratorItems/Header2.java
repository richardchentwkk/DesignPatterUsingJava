package designpattern.java.richard.com.designpatternpractice.Decorator.DecoratorItems;

import android.util.Log;

import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Component;
import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Decorator;

/**
 * Created by Richard_Chen on 2016/2/18.
 */
public class Header2 extends Decorator {
    public Header2 (Component myComponent){
        super(myComponent);
    }
    public void printTicket(){
        //Header2 print function.
        super.callTrailer();
        System.out.println("This is header2.");
    }
}
