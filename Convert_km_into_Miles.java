
import java.util.Scanner;
public class Convert_km_into_Miles 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter km for convert into miles:");
        float km=s.nextFloat();
        double miles=(0.62*km);
        System.out.println(km+" km = "+miles+" miles");
        s.close();
    }
}
