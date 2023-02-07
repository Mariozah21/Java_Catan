package mz.catanfx.demo;

import Functional.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Trieda ma vela chyba, Zvolil som si projekt ktory bol na mna prilis narocny a nedokazal som nikeotre veci spravit.
 * Z dovodu jednoduchosti som predvolil iba 2 hracov (idealne by bolo mozne si vybrat pocet hracov).
 *
 *Dalej treba este do scene Builderu pridat aj graficke znazorneni kariet a Postavenych budov.
 * Na zaciatku hry by si mal kazdy hrac hodit cislom aby sa urcilo kto ide prvy. Hraci by si mali postavit 2 dediny a cestu ku kazdej dedine
 * Nestihol som to vsetko spravit.
 */


public class BoardController implements Initializable {

    @FXML
    private static Polygon H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19;
    @FXML
    private Circle C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,C21,C22,C23,C24,C25,C26,C27,C28,C29,C30,C31,C32,C33,C34,C35,C36,C37,C38,C39,C40,C41,C42,C43,C44,C45,C46,C47,C48,C49,C50,C51,C52,C53,C54;
    @FXML
    private Ellipse E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12,E13,E14,E15,E16,E17,E18,E19,E20,E21,E22,E23,E24,E25,E26,E27,E28,E29,E30,E31,E32,E33,E34,E35,E36,E37,E38,E39,E40,E41,E42,E43,E44,E45,E46,E47,E48,E49,E50,E51,E52,E53,E54,E55,E56,E57,E58,E59,E60,E61,E62,E63,E64,E65,E66,E67,E68,E69,E70,E71,E72;

    int DiceThrowNumber;
    boolean dicesthrown = false;
    Pieces pieceToBeBuilt;
    Player playerRed = new Player(Color.Red);
    Player playerBlue = new Player(Color.Blue);
    Player playerOnTurn = playerRed;



    public void SwitchPlayer(){
        if(dicesthrown){
            dicesthrown = false;
            if (playerOnTurn == playerRed){
                playerOnTurn = playerBlue;
            } else {
                playerOnTurn = playerRed;
            }
            System.out.println("It is now other players turn");
        }else System.out.println("First throw a number");
    }

    public boolean requirementsToBuild() {

        if(dicesthrown){
            if(pieceToBeBuilt==null){
                System.out.println(("Please select a building to build"));
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    /**
     * Omluvam sa za strasne vela tychto metod ale nevedel som ako inak to spravit aby kazde policko predavalo ine id.
     */
    public void PlaceC1(){
        if(requirementsToBuild()){
                PlaceBuilding(Integer.parseInt(C1.getId()),pieceToBeBuilt);}
    }
    public void PlaceC2(){
        if(requirementsToBuild()){
            PlaceBuilding(Integer.parseInt(C2.getId()),pieceToBeBuilt);}
    }
    public void PlaceC3(){
        if(requirementsToBuild()) {
            PlaceBuilding(Integer.parseInt(C3.getId()), pieceToBeBuilt);}
    }
    public void PlaceC4(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C4.getId()),pieceToBeBuilt);}
    }
    public void PlaceC5(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C5.getId()),pieceToBeBuilt);}
    }
    public void PlaceC6(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C6.getId()),pieceToBeBuilt);}
    }
    public void PlaceC7(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C7.getId()),pieceToBeBuilt);}
    }
    public void PlaceC8(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C8.getId()),pieceToBeBuilt);}
    }
    public void PlaceC9(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C9.getId()),pieceToBeBuilt);}
    }
    public void PlaceC10(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C10.getId()),pieceToBeBuilt);}
    }
    public void PlaceC11(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C11.getId()),pieceToBeBuilt);}
    }
    public void PlaceC12(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C12.getId()),pieceToBeBuilt);}
    }
    public void PlaceC13(){
            if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C13.getId()),pieceToBeBuilt);}
    }
    public void PlaceC14(){
            if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C14.getId()),pieceToBeBuilt);}
    }
    public void PlaceC15(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C15.getId()),pieceToBeBuilt);}
    }
    public void PlaceC16(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C16.getId()),pieceToBeBuilt);}
    }
    public void PlaceC17(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C17.getId()),pieceToBeBuilt);}
    }
    public void PlaceC18(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C18.getId()),pieceToBeBuilt);}
    }
    public void PlaceC19(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C19.getId()),pieceToBeBuilt);}
    }
    public void PlaceC20(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C20.getId()),pieceToBeBuilt);}
    }
    public void PlaceC21(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C21.getId()),pieceToBeBuilt);}
    }
    public void PlaceC22(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C22.getId()),pieceToBeBuilt);}
    }
    public void PlaceC23(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C23.getId()),pieceToBeBuilt);}
    }
    public void PlaceC24(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C24.getId()),pieceToBeBuilt);}
    }
    public void PlaceC25(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C25.getId()),pieceToBeBuilt);}
    }
    public void PlaceC26(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C26.getId()),pieceToBeBuilt);}
    }
    public void PlaceC27(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C27.getId()),pieceToBeBuilt);}
    }
    public void PlaceC28(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C28.getId()),pieceToBeBuilt);}
    }
    public void PlaceC29(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C29.getId()),pieceToBeBuilt);}
    }
    public void PlaceC30(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C30.getId()),pieceToBeBuilt);}
    }
    public void PlaceC31(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C31.getId()),pieceToBeBuilt);}
    }
    public void PlaceC32(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C32.getId()),pieceToBeBuilt);}
    }
    public void PlaceC33(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C33.getId()),pieceToBeBuilt);}
    }
    public void PlaceC34(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C34.getId()),pieceToBeBuilt);}
    }
    public void PlaceC35(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C35.getId()),pieceToBeBuilt);}
    }
    public void PlaceC36(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C36.getId()),pieceToBeBuilt);}
    }
    public void PlaceC37(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C37.getId()),pieceToBeBuilt);}
    }
    public void PlaceC38(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C38.getId()),pieceToBeBuilt);}
    }
    public void PlaceC39(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C39.getId()),pieceToBeBuilt);}
    }
    public void PlaceC40(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C40.getId()),pieceToBeBuilt);}
    }
    public void PlaceC41(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C41.getId()),pieceToBeBuilt);}
    }
    public void PlaceC42(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C42.getId()),pieceToBeBuilt);}
    }
    public void PlaceC43(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C43.getId()),pieceToBeBuilt);}
    }
    public void PlaceC44(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C44.getId()),pieceToBeBuilt);}
    }
    public void PlaceC45(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C45.getId()),pieceToBeBuilt);}
    }
    public void PlaceC46(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C46.getId()),pieceToBeBuilt);}
    }
    public void PlaceC47(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C47.getId()),pieceToBeBuilt);}
    }
    public void PlaceC48(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C48.getId()),pieceToBeBuilt);}
    }
    public void PlaceC49(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C49.getId()),pieceToBeBuilt);}
    }
    public void PlaceC50(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C50.getId()),pieceToBeBuilt);}
    }
    public void PlaceC51(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C51.getId()),pieceToBeBuilt);}
    }
    public void PlaceC52(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C52.getId()),pieceToBeBuilt);}
    }
    public void PlaceC53(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C53.getId()),pieceToBeBuilt);}
    }
    public void PlaceC54(){
        if(requirementsToBuild()){
        PlaceBuilding(Integer.parseInt(C54.getId()),pieceToBeBuilt);}
    }

    public void PlaceE1(){
        if(requirementsToBuild()){
        placeRoad(Integer.parseInt(E1.getId()),pieceToBeBuilt);}
    }
    public void PlaceE2(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E2.getId()),pieceToBeBuilt);}
    }
    public void PlaceE3(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E3.getId()),pieceToBeBuilt);}
    }
    public void PlaceE4(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E4.getId()),pieceToBeBuilt);}
    }
    public void PlaceE5(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E5.getId()),pieceToBeBuilt);}
    }
    public void PlaceE6(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E6.getId()),pieceToBeBuilt);}
    }
    public void PlaceE7(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E7.getId()),pieceToBeBuilt);}
    }
    public void PlaceE8(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E8.getId()),pieceToBeBuilt);}
    }
    public void PlaceE9(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E9.getId()),pieceToBeBuilt);}
    }
    public void PlaceE10(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E10.getId()),pieceToBeBuilt);}
    }
    public void PlaceE11(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E11.getId()),pieceToBeBuilt);}
    }
    public void PlaceE12(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E12.getId()),pieceToBeBuilt);}
    }
    public void PlaceE13(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E13.getId()),pieceToBeBuilt);}
    }
    public void PlaceE14(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E14.getId()),pieceToBeBuilt);}
    }
    public void PlaceE15(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E15.getId()),pieceToBeBuilt);}
    }
    public void PlaceE16(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E16.getId()),pieceToBeBuilt);}
    }
    public void PlaceE17(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E17.getId()),pieceToBeBuilt);}
    }
    public void PlaceE18(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E18.getId()),pieceToBeBuilt);}
    }
    public void PlaceE19(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E19.getId()),pieceToBeBuilt);}
    }
    public void PlaceE20(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E20.getId()),pieceToBeBuilt);}
    }
    public void PlaceE21(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E21.getId()),pieceToBeBuilt);}
    }
    public void PlaceE22(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E22.getId()),pieceToBeBuilt);}
    }
    public void PlaceE23(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E23.getId()),pieceToBeBuilt);}
    }
    public void PlaceE24(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E24.getId()),pieceToBeBuilt);}
    }
    public void PlaceE25(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E25.getId()),pieceToBeBuilt);}
    }
    public void PlaceE26(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E26.getId()),pieceToBeBuilt);}
    }
    public void PlaceE27(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E27.getId()),pieceToBeBuilt);}
    }
    public void PlaceE28(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E28.getId()),pieceToBeBuilt);}
    }
    public void PlaceE29(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E29.getId()),pieceToBeBuilt);}
    }
    public void PlaceE30(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E30.getId()),pieceToBeBuilt);}
    }
    public void PlaceE31(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E31.getId()),pieceToBeBuilt);}
    }
    public void PlaceE32(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E32.getId()),pieceToBeBuilt);}
    }
    public void PlaceE33(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E33.getId()),pieceToBeBuilt);}
    }
    public void PlaceE34(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E34.getId()),pieceToBeBuilt);}
    }
    public void PlaceE35(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E35.getId()),pieceToBeBuilt);}
    }
    public void PlaceE36(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E36.getId()),pieceToBeBuilt);}
    }
    public void PlaceE37(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E37.getId()),pieceToBeBuilt);}
    }
    public void PlaceE38(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E38.getId()),pieceToBeBuilt);}
    }
    public void PlaceE39(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E39.getId()),pieceToBeBuilt);}
    }
    public void PlaceE40(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E40.getId()),pieceToBeBuilt);}
    }
    public void PlaceE41(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E41.getId()),pieceToBeBuilt);}
    }
    public void PlaceE42(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E42.getId()),pieceToBeBuilt);}
    }
    public void PlaceE43(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E43.getId()),pieceToBeBuilt);}
    }
    public void PlaceE44(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E44.getId()),pieceToBeBuilt);}
    }
    public void PlaceE45(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E45.getId()),pieceToBeBuilt);}
    }
    public void PlaceE46(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E46.getId()),pieceToBeBuilt);}
    }
    public void PlaceE47(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E47.getId()),pieceToBeBuilt);}
    }
    public void PlaceE48(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E48.getId()),pieceToBeBuilt);}
    }
    public void PlaceE49(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E49.getId()),pieceToBeBuilt);}
    }
    public void PlaceE50(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E50.getId()),pieceToBeBuilt);}
    }
    public void PlaceE51(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E51.getId()),pieceToBeBuilt);}
    }
    public void PlaceE52(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E52.getId()),pieceToBeBuilt);}
    }
    public void PlaceE53(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E53.getId()),pieceToBeBuilt);}
    }
    public void PlaceE54(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E54.getId()),pieceToBeBuilt);}
    }
    public void PlaceE55(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E55.getId()),pieceToBeBuilt);}
    }
    public void PlaceE56(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E56.getId()),pieceToBeBuilt);}
    }
    public void PlaceE57(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E57.getId()),pieceToBeBuilt);}
    }
    public void PlaceE58(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E58.getId()),pieceToBeBuilt);}
    }
    public void PlaceE59(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E59.getId()),pieceToBeBuilt);}
    }
    public void PlaceE60(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E60.getId()),pieceToBeBuilt);}
    }
    public void PlaceE61(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E61.getId()),pieceToBeBuilt);}
    }
    public void PlaceE62(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E62.getId()),pieceToBeBuilt);}
    }
    public void PlaceE63(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E63.getId()),pieceToBeBuilt);}
    }
    public void PlaceE64(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E64.getId()),pieceToBeBuilt);}
    }
    public void PlaceE65(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E65.getId()),pieceToBeBuilt);}
    }
    public void PlaceE66(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E66.getId()),pieceToBeBuilt);}
    }
    public void PlaceE67(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E67.getId()),pieceToBeBuilt);}
    }
    public void PlaceE68(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E68.getId()),pieceToBeBuilt);}
    }
    public void PlaceE69(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E69.getId()),pieceToBeBuilt);}
    }
    public void PlaceE70(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E70.getId()),pieceToBeBuilt);}
    }
    public void PlaceE71(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E71.getId()),pieceToBeBuilt);}
    }
    public void PlaceE72(){
        if(requirementsToBuild()){
            placeRoad(Integer.parseInt(E72.getId()),pieceToBeBuilt);}
    }

    public void buildVillage(){
        if(dicesthrown){
            pieceToBeBuilt = playerOnTurn.getTownpieces();
            System.out.println("piece to be built set to village");
        }else System.out.println("First throw a number");

    }
    public void buildCity(){
        if(dicesthrown){
            pieceToBeBuilt = playerOnTurn.getCitypieces();
            System.out.println("piece to be built set to city");
        }else System.out.println("First throw a number");

    }
    public void buildRoad(){
        if(dicesthrown){
            pieceToBeBuilt = playerOnTurn.getRoadpieces();
            System.out.println("piece to be built set to road");
        }else System.out.println("First throw a number");

    }


    public void PlaceBuilding(int i,Pieces piece){
        Game.getCorners(i).CheckIfCityOrTown(piece);
        if(piece.getPieceType()==PieceType.Village){
            if(Game.getCorners(i).getisBuilt()){
                System.out.println("You cannot build here, there is a building already placed here");
            }else {
                if (Game.getCorners(i).checkifroadisconnected(playerOnTurn.getColor(),Game.getCorners(i).getEdges())) {
                    //TODO check cards on hand
                    Game.getCorners(i).setPiece(piece);
                    playerOnTurn.getTownpieces().Build1piece();

                    System.out.println("Village was built here");
                } else {
                    System.out.println("You dont have a road leading to this location");
                }
            }
        } else if (piece.getPieceType()==PieceType.City) {
            if(!Game.getCorners(i).getisBuilt()){
                System.out.println("There is no building here");
            }else{
                if(Game.getCorners(i).CheckiIfVillageExists(playerOnTurn.getColor())){
                    //TODO check cards on hand
                    Game.getCorners(i).setPiece(piece);
                    playerOnTurn.getCitypieces().Build1piece();
                    playerOnTurn.getTownpieces().Return1Piece();
                    System.out.println("Village upgraded to city");
                }
                System.out.println("This is already a city");
            }
        }
    }

    /**
     *
     * @param i
     * @param piece
     */
    public void placeRoad(int i,Pieces piece){
        if(playerOnTurn.getHand().IsCardOnHand(Cards.Wood)&&playerOnTurn.getHand().IsCardOnHand(Cards.Brick)) {
            if (Game.getEdges(i).CheckIfRoad(piece)) {
                if (!Game.getEdges(i).getisBuilt()) {
                    Game.getEdges(i).setPiece(piece);
                    System.out.println("Road Built");
                    playerOnTurn.getHand().RemoveCard(Cards.Wood);
                    playerOnTurn.getHand().RemoveCard(Cards.Brick);
                } else {
                    System.out.println("There is already a road built here");
                }

            }
        }else{
            System.out.println("You dont have the correct resources on hand.");
        }

    }

    /**
     * Hod kockou, vytvori dve kocky ktore nasledne hodia cislo
     * sucet cisel ulozi do premenej DiceThrownNumber na dalsie pouzitie
     */
    public void RollDiceEvent(){
        if(!dicesthrown){
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            dice1.roll();
            dice2.roll();
            int NumberThrown = dice1.getValue()+dice2.getValue();
            DiceThrowNumber = NumberThrown;
            dicesthrown = true;
            System.out.println("You rolled the number: " + DiceThrowNumber);
        }else System.out.println("A number was already thrown this turn.");
    giveresources();
    }

    public int getDiceThrowNumber(){
        return DiceThrowNumber;
    }

    /**
     * Metoda bude davat hracom na ruku karty
     */
    public void giveresources(){
        for(int i=0;i<Game.getHexSize();i++){
            //TODO bude davat hracom karty
            if(Game.getHex(i).getPriradeneCislo()==getDiceThrowNumber()){
                Tiles typsuroviny = Game.getHex(i).getTileType();
                switch (typsuroviny){
                    case Desert -> {

                    }
                    case Sheep -> {
                        PlayerGetsResource(i,Cards.Sheep,playerBlue);
                        PlayerGetsResource(i,Cards.Sheep,playerRed);
                         }
                    case Brick -> {
                        PlayerGetsResource(i,Cards.Brick,playerBlue);
                        PlayerGetsResource(i,Cards.Brick,playerRed);
                    }
                    case Ore -> {
                        PlayerGetsResource(i,Cards.Ore,playerBlue);
                        PlayerGetsResource(i,Cards.Ore,playerRed);
                    }
                    case Wood -> {
                        PlayerGetsResource(i,Cards.Wood,playerBlue);
                        PlayerGetsResource(i,Cards.Wood,playerRed);
                    }
                    case Wheat -> {
                        PlayerGetsResource(i,Cards.Wheat,playerBlue);
                        PlayerGetsResource(i,Cards.Wheat,playerRed);
                    }
                }
            }
        }
    }

    public void PlayerGetsResource(int i,Cards cards,Player player){
        for(int j=0;j<Game.getHex(i).getCornerSize();j++)
            if(Game.getHex(i).getCorner(j).getisBuilt()){
                if(Game.getHex(i).getCorner(j).getPiece().getColor()==player.getColor()){
                    if(Game.getHex(i).getCorner(j).getPiece().getPieceType()==PieceType.Village){
                        player.getHand().AddCard(cards);
                    }else if(Game.getHex(i).getCorner(j).getPiece().getPieceType()==PieceType.City){
                        player.getHand().AddCard(cards);
                        player.getHand().AddCard(cards);
                    }
                }
            }
    }

    public void ShowCards(){
        playerOnTurn.getHand().ShowCards();
    }

    public void GiveInitialreources(Player player){
        player.getHand().AddCard(Cards.Sheep);
        player.getHand().AddCard(Cards.Brick);
        player.getHand().AddCard(Cards.Brick);
        player.getHand().AddCard(Cards.Wood);
        player.getHand().AddCard(Cards.Wood);
        player.getHand().AddCard(Cards.Wheat);
        player.getHand().AddCard(Cards.Wood);
        player.getHand().AddCard(Cards.Wood);
        player.getHand().AddCard(Cards.Brick);
        player.getHand().AddCard(Cards.Brick);
        player.getHand().AddCard(Cards.Sheep);
        player.getHand().AddCard(Cards.Wheat);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Game.createBoard();
        System.out.println("Game board has been created");
        //HexFilling.FillingOfHexes();
        GiveInitialreources(playerRed);
        GiveInitialreources(playerBlue);

    }

}
