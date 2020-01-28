package examq1;

public class Prism
{
    private double s, b, h, l;

    public Prism(double s, double b, double h, double l)
    {
        this.s = s;
        this.b = b;
        this.h = h;
        this.l = l;
    }

    public void displaySurfaceArea()
    {
        System.out.println((b*h + 2*l*s + l*b));
    }

    public void displayVolume()
    {
        System.out.println(b*h*l/2);
    }
}
