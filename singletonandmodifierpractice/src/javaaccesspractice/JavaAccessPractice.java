/**
 * TO announce license here.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaccesspractice;

/**
 * Import static package here.
 * Usually utils or used API
 */
import static javaaccesspractice.utils.*;
/**
 * Import package, basically class used here.
 * Sometime not utils.
 */
import java.util.*;

/**
 * Class to practice public, protected, priavte modifier
 * @author RichardChen
 * @since 2015/09/26
 */
public class JavaAccessPractice {
    
    /**
     * Practice modifier static, final, 
     * List Varable defined Sequence below.
     * 1. Publice constants (Static final format)
     * 2. Private constants (Only can access by this class)
     * 3. Public variable
     * 4. Protected variable
     * 5. Private variable
     * 6. Constructor
     * 7. Public static methods (Util method)
     * 8. Public methods
     * 9. Protected methods
     * 10. Private methods
     */
    
    /**
     * Public Constant Varible define here.
     */
    //Constant can access, but can not extends
    public static final double PI = 3.1415;
    public static final int BASE_NUM = 0;
    
    /**
     * Private Constant Varible define here.
     */
    private static final double PRIVATE_PI = 3.14;
    private static final int PRIVATE_BASE = 2;
    
    /**
     * Public Varable define here,
     * if this varible need to access by outside class
     */
    public String ClassName = "AccessPractice";
    
    /**
     * Protected Varable, for child be able to access parent.
     * Can use on IPC case, not usually used.
     */
    
    /**
     * Private variable, can access in this class, do not share with any one.
     */
    private boolean DBG = true;
    private String TAG = "JavaAccessPractice";
    //Singleton Design pattern Object define here.
    private static JavaAccessPractice mObject = null;
    
    /**
     * Practice enum method here.
     * Enum behaviour like class,
     * define MACRO before, and can implement method inside.
     */
    public enum Number{
        ZERO, ONE, TWO, THREE;
        
        public static int returnint(Number n){
            switch(n){
                case ZERO:
                    return 0;
                case ONE:
                    return 1;
                case TWO:
                    return 2;
                case THREE:
                    return 3;
            }
            return 99;
        }
    }

    /**
     * Constructor start here.
     * Dummy Constructor, due to not variable need to init.
     */
    
    private JavaAccessPractice(){
    };
    
    /**
     * Singleton Design pattern implementation here.
     * @return Return Singleton Object.
     */
    
    public static JavaAccessPractice getInstance(){
        //Protected to avoid Object already exist.
        if (mObject == null){
            //Lock the class, avoid multi-thread case.
            synchronized(JavaAccessPractice.class){
                if (mObject == null){
                    mObject = new JavaAccessPractice();
                }
            }
        }
        return mObject;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        print();
        showauthor();
        JavaAccessPractice test = JavaAccessPractice.getInstance();
        System.out.print(test);
        System.out.print("Number is:"+Number.returnint(Number.ZERO)+"\n");
        System.out.print("Number is:"+Number.returnint(Number.ONE)+"\n");
    }
    
    /**
     * Usually, return the class name.
     * @return Test toString() string
     */
    @Override
    public String toString(){
        return "JavaAccessPractice_test_String\n";
    }
    
}
