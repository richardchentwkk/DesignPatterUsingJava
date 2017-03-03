package designpattern.java.richard.com.designpatternpractice;

import android.test.AndroidTestCase;

import junit.framework.Assert;

import designpattern.java.richard.com.designpatternpractice.Facade.FacadeManager;

/**
 * Test case to verify implement functions in FacadeManager.
 *
 * @author Richard Chen
 * @since 2016/02/05
 */
public class FacadeTestCase extends AndroidTestCase {

    FacadeManager mFacadeManager = null;

    @Override
    protected void setUp() throws Exception {
        mFacadeManager = new FacadeManager();
    }

    public void testGetBicycle(){
        if(mFacadeManager.getBicycle().equals("Bicycle")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
    }

    public void testGetMotoCycle(){
        if(mFacadeManager.getMotocycle().equals("MotoCycle")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
    }

    public void testGetTruck(){
        if(mFacadeManager.getTrunk().equals("Trunk")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
    }
}
