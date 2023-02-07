package Functional;

import javafx.scene.image.ImageView;

import java.util.Arrays;

public class Hex {
    private Tiles tileType;
    private int priradeneCislo, id, x, y;
    private boolean jeObsadeneZlodejom;
    private Corner[] corners;

    public Hex(int id, Tiles tileType, int priradeneCislo) {
        this.id = id;
        this.tileType = tileType;
        this.priradeneCislo = priradeneCislo;
        this.jeObsadeneZlodejom = false;
        int[] cisla= cornersToHex(id);
        this.corners = new Corner[cisla.length];
        setCorners(cisla);
    }

    int[] cornersToHex(int id){
        int[] cisla = new int[6];
        switch (id){
            case 1:
                cisla[0]= 1;
                cisla[1]=2;
                cisla[2]=3;
                cisla[3]=9;
                cisla[4]=10;
                cisla[5]=11;
                break;
            case 2:
                cisla[0]=3;
                cisla[1]=4;
                cisla[2]=5;
                cisla[3]=11;
                cisla[4]=12;
                cisla[5]=13;
                break;
            case 3:
                cisla[0]=5;
                cisla[1]=6;
                cisla[2]=7;
                cisla[3]=13;
                cisla[4]=14;
                cisla[5]=15;
                break;
            case 4:
                cisla[0]=8;
                cisla[1]=9;
                cisla[2]=10;
                cisla[3]=18;
                cisla[4]=19;
                cisla[5]=20;
                break;
            case 5:
                cisla[0]=10;
                cisla[1]=11;
                cisla[2]=12;
                cisla[3]=20;
                cisla[4]=21;
                cisla[5]=22;
                break;
            case 6:
                cisla[0]=12;
                cisla[1]=13;
                cisla[2]=14;
                cisla[3]=22;
                cisla[4]=23;
                cisla[5]=24;
                break;
            case 7:
                cisla[0]=14;
                cisla[1]=15;
                cisla[2]=16;
                cisla[3]=24;
                cisla[4]=25;
                cisla[5]=26;
                break;
            case 8:
                cisla[0]=17;
                cisla[1]=18;
                cisla[2]=19;
                cisla[3]=28;
                cisla[4]=29;
                cisla[5]=30;
                break;
            case 9:
                cisla[0]=19;
                cisla[1]=20;
                cisla[2]=21;
                cisla[3]=30;
                cisla[4]=31;
                cisla[5]=32;
                break;
            case 10:
                cisla[0]=21;
                cisla[1]=22;
                cisla[2]=23;
                cisla[3]=32;
                cisla[4]=33;
                cisla[5]=34;
                break;
            case 11:
                cisla[0]=23;
                cisla[1]=24;
                cisla[2]=25;
                cisla[3]=34;
                cisla[4]=35;
                cisla[5]=36;
                break;
            case 12:
                cisla[0]=25;
                cisla[1]=26;
                cisla[2]=27;
                cisla[3]=36;
                cisla[4]=37;
                cisla[5]=38;
                break;
            case 13:
                cisla[0]=29;
                cisla[1]=30;
                cisla[2]=31;
                cisla[3]=39;
                cisla[4]=40;
                cisla[5]=41;
                break;
            case 14:
                cisla[0]=31;
                cisla[1]=32;
                cisla[2]=33;
                cisla[3]=41;
                cisla[4]=42;
                cisla[5]=43;
                break;
            case 15:
                cisla[0]=33;
                cisla[1]=34;
                cisla[2]=35;
                cisla[3]=43;
                cisla[4]=44;
                cisla[5]=45;
                break;
            case 16:
                cisla[0]=35;
                cisla[1]=36;
                cisla[2]=37;
                cisla[3]=45;
                cisla[4]=46;
                cisla[5]=47;
                break;
            case 17:
                cisla[0]=40;
                cisla[1]=41;
                cisla[2]=42;
                cisla[3]=48;
                cisla[4]=49;
                cisla[5]=50;
                break;
            case 18:
                cisla[0]= 42;
                cisla[1]=43;
                cisla[2]=44;
                cisla[3]=50;
                cisla[4]=51;
                cisla[5]=52;
                break;
            case 19:
                cisla[0]=44;
                cisla[1]=45;
                cisla[2]=46;
                cisla[3]=52;
                cisla[4]=53;
                cisla[5]=54;
                break;

        }
        return cisla;
    }

    void setCorners(int[] args){
        for(int i=0;i< args.length;i++){
            this.corners[i] = Game.getCorners(args[i]);
        }
    }

    public int getPriradeneCislo() {
        return priradeneCislo;
    }

    public void setPriradeneCislo(int priradeneCislo) {
        this.priradeneCislo = priradeneCislo;
    }

    public void setJeObsadeneZlodejom(boolean jeObsadeneZlodejom) {
        this.jeObsadeneZlodejom = jeObsadeneZlodejom;
    }

    public Tiles getTileType() {
        return tileType;
    }

    public Corner getCorner(int j){
        return corners[j];
    }

    public int getCornerSize(){
        return corners.length;
    }
}
