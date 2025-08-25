import java.util.Scanner;

public class Convert_Fahrenheit_into_Celsius 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = s.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;  
        System.out.println(fahrenheit + " °F = " + celsius + " °C");
        s.close();
    }
}
