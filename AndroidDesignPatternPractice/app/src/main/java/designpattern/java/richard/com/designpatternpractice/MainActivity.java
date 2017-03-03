package designpattern.java.richard.com.designpatternpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import designpattern.java.richard.com.designpatternpractice.Decorator.AbstractBase.Component;
import designpattern.java.richard.com.designpatternpractice.Decorator.Factory.Factory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Test for Decorator design pattern.
         * */
        Factory myFactory = new Factory();
        Component myComponent = myFactory.getComponent();
        myComponent.printTicket();
    }
}
