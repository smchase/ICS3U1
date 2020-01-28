package examq1;

public class ExamQ1
{
    public static void main(String[] args)
    {
        double s = 9*Math.random() + 1, b = 9*Math.random() + 1, h = 9*Math.random() + 1, l = 9*Math.random() + 1;
        Prism p = new Prism(s, b, h, l);
        p.displaySurfaceArea();
        p.displayVolume();
    }
}

