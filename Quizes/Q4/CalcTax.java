public class CalcTax
{
    public double Taxrate(double a)
    {
        if (a <= 1000) return 2;
        else if (a < 5000) return 3;
        else return 6;
    }
}
