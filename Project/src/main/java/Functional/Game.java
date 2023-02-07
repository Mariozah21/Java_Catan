package Functional;

import java.util.*;

public class Game {

    private static List<Hex> GamePlanHex = new ArrayList<Hex>();
    private static List<Corner> GamePlanCorn = new ArrayList<Corner>();
    private static List<Edge> GamePlanEdge = new ArrayList<Edge>();
    private static int ThrownNumber,counter;

    public static void setThrownNumber(int thrownNumber) {
        ThrownNumber = thrownNumber;
    }

    /**
     * vytvara hraci plan - nedokoncene
     */
    public static void createBoard(){
        FillEdges();
        FillCorners();
        FillHexes();


    }

    /**
     * Z triedy HexAssignment zavola metody na vytvorenie poli ktore nasledne ulozi do listu.
     * Da pozor na to aby sa polu Desert nepriradilo ziadne cislo (z toho pola si hrac netaha suroviny takze nepotrebuje cislo)
     * namiesto toho polu Desert da cislo 0 ktore na kockach nemoze padnut.
     */
    private static void FillHexes(){
        HexAssignment.GenerateNumbers();
        HexAssignment.GenerateHexes();
        for(int i = 0;i<18;i++){
            if(HexAssignment.getHexes()[i]==Tiles.Desert){
                GamePlanHex.add(new Hex(i,HexAssignment.getHexes()[i],0 ));
            }else{
                GamePlanHex.add(new Hex(i,HexAssignment.getHexes()[i],HexAssignment.getNumbers()[i] ));
            }
        }
    }

    /**
     * naplni list rohmi na ktorych sa budu moct stavat budovy
     */
    private static void FillCorners(){
        for(int i =0;i<53;i++){
            GamePlanCorn.add(new Corner(i));
        }
    }

    /**
     * naplni list krajmi na ktorych sa budu moct stavat cesty
     */
    private static void FillEdges(){
        for(int i =0;i<73;i++){
            GamePlanEdge.add(new Edge(i));
        }
    }

    public  static Corner getCorners(int i){
        return GamePlanCorn.get(i);
    }

    public static Hex getHex(int i){
        return GamePlanHex.get(i);
    }

    public static int getHexSize (){return GamePlanHex.size();}

    public  static Edge getEdges(int i){
            if(i == 0){
                return null;
            }
            else
        return GamePlanEdge.get(i);
    }

    /**
     * na zaklade hodeneho cisla bude pridavat hracom karty
     */
    public static void GivePlayersResources(){

    }
}
