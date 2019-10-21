public class Question
{
    private int num1, num2;

    public Question(int low, int high)
    {
        num1 = (int)((high-low+1)*Math.random()+low);
        num2 = (int)((high-low+1)*Math.random()+low);
    }

    public int answer()
    {
        return num1+num2;
    }

    public void showQuestion()
    {
        System.out.printf("%d + %d = ", num1, num2);
    }

    public void showAnswer()
    {
        System.out.printf("%*s\n", 10, "test");
    }

    public void showPrompt(int tries)
    {
        System.out.printf("%-*s= ", (int)Math.log10(num1)+(int)Math.log10(num2)+6, tries==1?"X__":"XX_");
    }
}
