package designpattern.java.richard.com.designpatternpractice.Strategy.DrawActions;

import designpattern.java.richard.com.designpatternpractice.Strategy.Interface.DrawInterface;

/**
 * Created by RichardChen on 2016/2/8.
 */
public class DrawCircle implements DrawInterface {
    @Override
    public String doDrawService() {
        return "Draw Circle.";
    }
}
