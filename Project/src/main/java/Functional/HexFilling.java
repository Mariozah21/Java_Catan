package Functional;


import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;

/**
 * Pisalo mi to error Cannot invoke "javafx.scene.shape.Polygon.setFill(javafx.scene.paint.Paint)" because "Functional.HexFilling.H1" is null
 *  Metoda by mala Jednotlivym polygonom priradit povodne Obrazok ktory mam ulozeny ale neslo to tak som chcel skusit aspon farbu
 *  ale ani to mi neslo
 *  Taktiez treba do scenebuilderu este nejako zakomponovat Ake cislo ma Kazdy Hex.
 *  Mal by byt obmedzeny pocet budo ktory sa moze stavat.
 *  Cesty by sa mali dat stavat iba pri dedine.
 */
public class HexFilling{
    @FXML
    private static Polygon H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19;

    private static final String wheatURL = "file:Wheat_Hex.gif";
    private static final String woodURL = "file:Wood_Hex.gif";
    private static final String oreURL = "file:Ore_Hex.gif";
    private static final String sheepURL = "file:Sheep_Hex.gif";
    private static final String brickURL = "file:Brick_Hex.gif";
    private static final String desertURL = "file:Desert_Hex.gif";
    static Image wheat= new Image(wheatURL);
    static Image wood = new Image(woodURL);
    static Image ore = new Image(oreURL);
    static Image sheep = new Image(sheepURL);
    static Image brick = new Image(brickURL);
    static Image desert = new Image(desertURL);


    public static void FillHex(Polygon p,Tiles tiletype){
        p.setFill(new ImagePattern(ImagesToHexes(tiletype)));
    }
    private static Image ImagesToHexes(Tiles tileetype){
        Image image = null;
        switch (tileetype){
            case Wheat -> image = wheat;
            case Wood -> image = wood;
            case Ore -> image = ore;
            case Brick -> image= brick;
            case Sheep -> image = sheep;
            case Desert -> image = desert;
        }
        return image;
    }

    public static void FillingOfHexes(){
        FillHex(H1,Game.getHex(1).getTileType());
        FillHex(H2,Game.getHex(2).getTileType());
        FillHex(H3,Game.getHex(2).getTileType());


    }


}
