package designpattern.java.richard.com.designpatternpractice.Strategy.Interface;

/**
 * Created by RichardChen on 2016/2/8.
 */
public class Controller {
    public String doDraw(DrawInterface actions){
        System.out.println(actions.doDrawService());
        return actions.doDrawService();
    }
}
