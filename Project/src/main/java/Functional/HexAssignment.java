package Functional;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class HexAssignment {

    static Tiles[] Hexes = new Tiles[19];
    static int[] Numbers = new int[18];
    static int Desert = 0,Wheat = 0,Wood = 0,Sheep = 0,Ore = 0,Brick = 0;
    static int two=0,three=0,four=0,five=0,six=0,eight=0,nine=0,ten=0,eleven=0,twelve=0;




    public static  Tiles GenerateHex() {
        int rand = new Random().nextInt(Tiles.values().length);
        return Tiles.values()[rand];
    }

    public static int GenerateNumber(){
        Random rand = new Random();
        return rand.nextInt(12) + 2;
    }

    /**
     * Metoda ma na starosti volanie funkcie na vygenerovanie nahodnej hodnoty z
     * enum Tiles do lokalnej premennej temp. Nasledne odosle vygenerovanu hodnotu ako string na kontrolu. Kym kontrola
     * neprebehne uspesne bude generovat nove hodnoty. Po uspesnej kontrole hodnotu priradi
     * ku koncu Array Tiles ktora ma velkost 19 policok.
     */
    public static void GenerateHexes() {
        for (int i = 0; i < Hexes.length; i++) {
            Tiles temp = GenerateHex();
            while (!checkAmountOf(String.valueOf(temp))) {
                temp = GenerateHex();
            }
            Hexes[i] = temp;
        }
    }

    public static Tiles[] getHexes() {
        return Hexes;
    }

    public static int[] getNumbers() {
        return Numbers;
    }


    public static void GenerateNumbers(){
        for(int i = 0;i< Numbers.length;i++){
            int temp = GenerateNumber();
            while(!checkAmountOf(temp)){
                temp = GenerateNumber();
            }
            Numbers[i]=temp;
        }
        for (int number : Numbers) {
            //System.out.println(number);
        }
    }

    private static boolean checkAmountOf(int number){
        if(number == 2 ){
            if(two==1){
                //System.out.println(2 +" failed" + two);
                return false;
            }else {
                two++;
                //System.out.println(2 +" inkrement");
                return true;
            }
        }else
        if(number == 3 ){
            if(three==2){
                //System.out.println(3 +" failed" + three);
                return false;
            }else {
                three++;
                //System.out.println(3 +" inkrement");
                return true;
            }
        }else
        if(number == 4 ){
            if(four==2){
                //System.out.println(4 +" failed" + four);
                return false;
            }else {
                four++;
                //System.out.println(4 +" inkrement");
                return true;
            }
        }else
        if(number == 5 ){
            if(five==2){
                //System.out.println(5 +" failed" + five);
                return false;
            }else {
                five++;
                //System.out.println(5 +" inkrement");
                return true;
            }
        }else
        if(number == 6 ){
            if(six==2){
                //System.out.println(6 +" failed");
                return false;
            }else {
                six++;
                //System.out.println(6 +" inkrement" + six);
                return true;
            }
        }else
        if(number == 7 ){
            //System.out.println(7 +" skipped");
                return false;
        }else
        if(number == 8 ){
            if(eight==2){
                //System.out.println(8 +" failed" + eight);
                return false;
            }else {
                eight++;
                //System.out.println(8 +" inkrement");
                return true;
            }
        }else
        if(number == 9 ){
            if(nine==2){
                //System.out.println(9 +" failed" + nine);
                return false;
            }else {
                nine++;
                //System.out.println(9 +" inkrement");
                return true;
            }
        }else
        if(number == 10 ){
            if(ten==2){
                //System.out.println(10 +" failed" + ten);
                return false;
            }else {
                ten++;
                //System.out.println(10 +" inkrement");
                return true;
            }
        }else
        if(number == 11 ){
            if(eleven==2){
                //System.out.println(11 +" failed" + eleven);
                return false;
            }else {
                eleven++;
                //System.out.println(11 +" inkrement");
                return true;
            }
        }else
        if(number == 12 ){
            if(twelve==1){
                //System.out.println(12 +" failed" + twelve);
                return false;
            }else {
                twelve++;
                //System.out.println(12 +" inkrement");
                return true;
            }
        }
        return false;
    }

    /**
     * Metoda zaistuje aby pocet druhov poli na hracom plane bol vyvazeny a aby bola hra hratelna
     * @param tileName Nazov druhu pola
     * @return true/false podla toho ci uz bolo naplnene mnozstvo urciteho druhu pola
     */
    private static boolean checkAmountOf(String tileName) {
        if (Objects.equals(tileName, "Desert")) {
            if (Desert >= 1) {
                return false;
            } else {
                Desert++;
                return true;
            }

        } else if (Objects.equals(tileName, "Wheat")) {
            if (Wheat >= 4) {
                return false;
            } else {
                Wheat++;
                return true;
            }

        } else if (Objects.equals(tileName, "Wood")) {
            if (Wood >= 4) {
                return false;
            } else {
                Wood++;
                return true;
            }

        } else if (Objects.equals(tileName, "Sheep")) {
            if (Sheep >= 4) {
                return false;
            } else {
                Sheep++;
                return true;
            }

        } else if (Objects.equals(tileName, "Brick")) {
            if (Brick >= 3) {
                return false;
            } else {
                Brick++;
                return true;
            }

        } else if (Objects.equals(tileName, "Ore")) {
            if (Ore >= 3) {
                return false;
            } else {
                Ore++;
                return true;
            }
        } else return false;
    }
}

