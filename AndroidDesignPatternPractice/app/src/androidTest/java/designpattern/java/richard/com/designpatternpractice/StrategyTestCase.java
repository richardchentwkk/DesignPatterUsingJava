package designpattern.java.richard.com.designpatternpractice;

import android.test.AndroidTestCase;

import designpattern.java.richard.com.designpatternpractice.Strategy.DrawActions.DrawCircle;
import designpattern.java.richard.com.designpatternpractice.Strategy.DrawActions.DrawLine;
import designpattern.java.richard.com.designpatternpractice.Strategy.Interface.Controller;

/**
 * Test case to verify test status.
 *
 * Created by Richard_Chen on 2016/2/18.
 */
public class StrategyTestCase extends AndroidTestCase {

    private Controller mContraller = null;
    private final static String DRAW_LINE = "Draw Line.";
    private final static String DRAW_CIRCLE = "Draw Circle.";

    /**
     * Setup Controller for testing.
     * */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mContraller = new Controller();
    }

    /**
     * API to test Strategy draw line.
     * */
    public void testDrawLine(){
        assertEquals(DRAW_LINE,mContraller.doDraw(new DrawLine()));
    }

    /**
     * API to test Strategy draw circle.
     * */
    public void testDrawCircle(){
        assertEquals(DRAW_CIRCLE,mContraller.doDraw(new DrawCircle()));
    }
}
