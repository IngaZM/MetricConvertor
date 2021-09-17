
package capaciti.metricconverter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        // Calculate meters
        System.out.println("Enter the number of Feet: ");
        Scanner sc = new Scanner(System.in);
        Double feet = sc.nextDouble();
       
        Double meters = (.305 * feet);
        
        // Output
        System.out.println(feet + " ft is " + meters + " m");
        
        // Calculate Pounds
        System.out.println("Enter the number of Pounds: ");
        Scanner sc1 = new Scanner(System.in);
        Double Pounds = sc.nextDouble();
        
        Double Kgs = (.454 * Pounds);
        
        // Output
        System.out.println(Pounds + " lb is " + Kgs + " Kgs");
        
        System.out.println("Enter the number of Fahrenheit: ");
        Scanner sc2 = new Scanner(System.in);
        Double Fahrenhet = sc.nextDouble();
        
        Double Celsius = ((Fahrenhet-32)/1.8);
        
        // Output
        System.out.println(Fahrenhet + " F is " + Celsius + " C");
    }
    
}
