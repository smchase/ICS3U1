public class Investment
{
    public static void main(String[] args)
    {
        int y = 0;
        for (int i = 2500; i < 5000; i *= 1.075) {
            y++;
        }
        System.out.printf("It will take %d years.\n", y);
    }
}
