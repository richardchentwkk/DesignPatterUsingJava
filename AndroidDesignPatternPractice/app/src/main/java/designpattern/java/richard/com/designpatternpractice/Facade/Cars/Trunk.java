package designpattern.java.richard.com.designpatternpractice.Facade.Cars;

import designpattern.java.richard.com.designpatternpractice.Facade.FadcadeInterface.FacadeInterfce;

/**
 * Created by Richard_Chen on 2016/2/5.
 */
public class Trunk implements FacadeInterfce {
    public Trunk() {
        super();
    }
    @Override
    public String doAction() {
        return "Trunk";
    }
}
