//Qn.03 Find Area of Rectangle:
import java.util.Scanner;
class Rectangle 
{
    double length; 
    double breadth;


    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextDouble();

    }
    public void displayArea()
    {
        double Area = length * breadth;
        System.out.print("The area of rectangle is " + Area);
    }
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.getData();
        R.displayArea();
    }
}