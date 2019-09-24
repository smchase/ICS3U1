public class DiceRolls
{
    public static void main(String[] args)
    {
        int dice1, dice2;
        System.out.print("Dice 1   Dice 2   Total\n");
        for (int i = 0; i < 5; i++) {
            dice1 = (int)(Math.random()*6 + 1);
            dice2 = (int)(Math.random()*6 + 1);
            System.out.printf("%d        %d        %d\n", dice1, dice2, dice1+dice2);
        }
    }
}
