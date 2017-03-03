package designpattern.java.richard.com.designpatternpractice.Facade.Cars;

import designpattern.java.richard.com.designpatternpractice.Facade.FadcadeInterface.FacadeInterfce;

/**
 * Created by Richard_Chen on 2016/2/5.
 */
public class Bicycle implements FacadeInterfce {
    public Bicycle() {
        super();
    }
    @Override
    public String doAction() {
        return "Bicycle";
    }
}
