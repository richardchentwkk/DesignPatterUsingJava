package designpattern.java.richard.com.designpatternpractice;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import designpattern.java.richard.com.designpatternpractice.ObjectAdapter.Actions.Fly;

/**
 * Test Case to verify Adapter Design pattern.
 * @since 2016/02/05
 * @Author Richard Chen
 */
public class AdapterTestCase extends AndroidTestCase {

    Fly mFly = null;
    @Override
    protected void setUp() throws Exception {
        this.mFly = new Fly();
    }

    public void testAdapterforDisplay(){
        System.out.println("Start test testAdapterforDisplay");
        mFly.display();
        Assert.assertTrue(true);
    }

    public void testDoAction(){
        System.out.println("Start test testDoAction");
        if(mFly.doAction().equals("FlyFly")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
    }

}
