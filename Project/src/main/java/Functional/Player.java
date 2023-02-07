package Functional;

/**
 * V tejto triede by sa mali este zaznamenavat aj vitazne body.
 */
public class Player {
    Color color;
    Pieces roadpieces;
    Pieces townpieces;
    Pieces citypieces;
    Hand hand;


    public Player(Color color) {
        this.color = color;
        this.roadpieces = new Pieces(color,PieceType.Road);
        this.townpieces = new Pieces(color,PieceType.Village);
        this.citypieces = new Pieces(color,PieceType.City);
        this.hand = new Hand(color);
    }

    public Color getColor() {
        return color;
    }

    public Pieces getRoadpieces() {
        return roadpieces;
    }

    public Pieces getTownpieces() {
        return townpieces;
    }

    public Pieces getCitypieces() {
        return citypieces;
    }

    public Hand getHand() {
        return hand;
    }
}
