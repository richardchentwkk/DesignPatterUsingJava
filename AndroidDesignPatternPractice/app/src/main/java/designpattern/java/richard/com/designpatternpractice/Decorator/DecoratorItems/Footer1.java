package designpattern.java.richard.com.designpatternpractice.Decorator.DecoratorItems;

import android.util.Log;

import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Component;
import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Decorator;

/**
 * Created by Richard_Chen on 2016/2/18.
 */
public class Footer1 extends Decorator {
    public Footer1 (Component myComponent){
        super(myComponent);
    }
    public void printTicket(){
        //Footer1 print function.
        super.callTrailer();
        System.out.println("This is footer1.");
    }
}
