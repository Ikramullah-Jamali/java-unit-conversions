import java.util.Scanner;

public class Convert_Cm_into_Inches 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length in centimeters:");
        double cm = s.nextDouble();
        double inches = cm * 0.393701;  
        System.out.println(cm + " cm = " + inches + " inches");
        s.close();
    }
}
