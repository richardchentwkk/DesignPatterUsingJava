package designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase;

/**
 * Created by Richard_Chen on 2016/2/18.
 */
abstract public class Decorator extends Component {
    private Component myTrailer;

    public Decorator (Component myComponent){
        myTrailer = myComponent;
    }

    public void callTrailer(){
        if(myTrailer!=null){
            myTrailer.printTicket();
        }
    }
}
