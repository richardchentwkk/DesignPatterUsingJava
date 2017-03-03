package designpattern.java.richard.com.designpatternpractice.Decorator;

import android.provider.Settings;
import android.util.Log;

import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Component;

/**
 * Created by Richard_Chen on 2016/2/18.
 */
public class SalesTicket extends Component {

    public void printTicket(){
        System.out.println("This is SalesTicket.");
        Log.d("Test","This is SalesTicket.");
    }

}
