// Qn.4
class cyclinder
{
    private double radius;
    private double height;
    
    public void setData(double r, double h)
    {
        radius = r;
        height = h;
    }
    public double getVolume()
    {
        return Math.PI*radius*radius*height;
    }
    public void display()
    {
        System.out.println("Cyclinder Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + getVolume());
        System.out.println();
    }
}

class CyclinderTest {
    public static void main(String[] args) {
        System.out.println("First Cyclinder:");
        cyclinder c1 = new cyclinder();
        c1.setData(5, 10);
        c1.display();

        System.out.println("Second Cyclinder:");
        cyclinder c2 = new cyclinder();
        c2.setData(7.5, 12);
        c2.display();
    }
}