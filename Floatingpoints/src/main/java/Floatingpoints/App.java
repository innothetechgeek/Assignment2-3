package Floatingpoints;
import java.util.*;


/**
 * Hello world!
 *
 */
public class App{
        public double num1;
        public double num2;
        public App(double nm1, double nm2){
            num1 = nm1;
            num2 = nm2;
        }
        public double minus(){
            double result = num1-num2;
            return Math.round(result*100.0)/100.0;

        }

}
