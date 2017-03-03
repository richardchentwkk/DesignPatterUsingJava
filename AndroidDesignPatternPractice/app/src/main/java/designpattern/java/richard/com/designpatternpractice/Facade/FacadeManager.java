package designpattern.java.richard.com.designpatternpractice.Facade;

import android.util.Log;

import designpattern.java.richard.com.designpatternpractice.Facade.Cars.Bicycle;
import designpattern.java.richard.com.designpatternpractice.Facade.Cars.MotorCycle;
import designpattern.java.richard.com.designpatternpractice.Facade.Cars.Trunk;

/**
 * Created by Richard_Chen on 2016/2/5.
 */
public class FacadeManager {
    /**
     * Global variable
     * */
    Trunk mTrunk = null;
    Bicycle mBicycle = null;
    MotorCycle mMotocycle = null;

    private static final String TAG = "FacadeManager";
    /**
     * Constructor
     * */
    public FacadeManager() {
        this.mBicycle = new Bicycle();
        this.mMotocycle = new MotorCycle();
        this.mTrunk = new Trunk();
    }

    public String getBicycle(){
        return mBicycle.doAction();
    }

    public String getMotocycle(){
        return mMotocycle.doAction();
    }

    public String getTrunk(){
        return mTrunk.doAction();
    }
}
