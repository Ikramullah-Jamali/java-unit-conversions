
import java.util.Scanner;

public class Convert_Celsius_into_Fahrenheit 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double celsius = s.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;  
        System.out.println(celsius + " °C = " + fahrenheit + " °F");
        s.close();
    }
}
