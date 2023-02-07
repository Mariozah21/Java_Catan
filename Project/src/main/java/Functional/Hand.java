package Functional;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private Color color;
    private int playerId;
    private List<Cards> hand = new ArrayList<Cards>();

    public Hand(Color color) {
        this.color = color;
    }

    /**
     * Prida hracovi kartu na koniec listu
     * @param card druh karty
     */
    public void AddCard(Cards card){
        hand.add(card);
    }

    /**
     * Odstrani prvu instanciu karty z ruky hraca
     * @param card druh karty
     */
    public void RemoveCard(Cards card){
        hand.remove(card);
    }

    /**
     * Kontroluje ci sa karta nachadza na ruke hraca
     * @param card druh karty
     * @return true/false ci karta je alebo neni na ruke
     */
    public boolean IsCardOnHand(Cards card){
        return hand.contains(card);
    }

    /**
     * Zisti pocet kariet na ruke
     * @return pocet kariet na ruke
     */
    public int GetAmountOfCards(){
        return hand.size();
    }

    public void ShowCards(){
        System.out.println(hand);
    }


}
