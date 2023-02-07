package Functional;

public class TestingWithoutClogingMain {
    /**
     * trieda urcena iba na testovanie
     */

    public static void RunTestHand(){
        Hand ruka1 = new Hand(Functional.Color.Red);
        ruka1.AddCard(Cards.Wood);
        ruka1.AddCard(Cards.Wood);
        ruka1.AddCard(Cards.Wheat);
        ruka1.AddCard(Cards.Ore);
        ruka1.AddCard(Cards.Sheep);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
        ruka1.RemoveCard(Cards.Wheat);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
        ruka1.AddCard(Cards.Wheat);
        ruka1.AddCard(Cards.Wheat);
        ruka1.AddCard(Cards.Ore);
        ruka1.AddCard(Cards.Ore);
        ruka1.AddCard(Cards.Brick);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
        ruka1.RemoveCard(Cards.Wood);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
        ruka1.RemoveCard(Cards.Wood);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
        ruka1.RemoveCard(Cards.Wood);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
        ruka1.RemoveCard(Cards.Wood);
        ruka1.ShowCards();
        System.out.println(ruka1.GetAmountOfCards());
    }
}
