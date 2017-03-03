package designpattern.java.richard.com.designpatternpractice.ObjectAdapter.Actions;

import designpattern.java.richard.com.designpatternpractice.ObjectAdapter.ActionBase.ActionBase;
import designpattern.java.richard.com.designpatternpractice.ObjectAdapter.Others.FlyByOther;

/**
 * Fly class to adapter FlyByOther methods.
 * @author Richard Chen
 * @since 2016/02/05
 */
public class Fly implements ActionBase {
    FlyByOther mFlyOther = null;

    public Fly() {
        mFlyOther = new FlyByOther();
    }

    /**
     * Adapter FlyByOther.displayforme()
     * @author Richard Chen
     * @since 2016/02/05
     * */
    @Override
    public void display() {
        mFlyOther.displayforme();
    }

    @Override
    public String showClassName() {
        return this.getClass().toString();
    }

    /**
     * Adapter method.
     * */
    @Override
    public String doAction() {
        return mFlyOther.doFlyAction();
    }
}
