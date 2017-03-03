package designpattern.java.richard.com.designpatternpractice.Decorator.Factory;

import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Component;
import designpattern.java.richard.com.designpatternpractice.Decorator.DecoratorItems.Footer1;
import designpattern.java.richard.com.designpatternpractice.Decorator.DecoratorItems.Header1;
import designpattern.java.richard.com.designpatternpractice.Decorator.SalesTicket;

/**
 * Created by Richard_Chen on 2016/2/18.
 */
public class Factory {
    public Component getComponent(){
        return  new Header1(new Footer1( new SalesTicket()));
    }
}
