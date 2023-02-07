package Functional;

import java.util.Arrays;

public class Corner {
    private int cornerId, x, y;
    private Pieces piece;
    private boolean isBuilt;
    private final Edge[] edge;

    public Corner(int cornerId) {
        this.cornerId = cornerId;
        this.x = 0;
        this.y = 0;
        this.piece = null;
        this.isBuilt = false;
        int[] cisla = EdgesToCorner(cornerId);
        this.edge = new Edge[cisla.length];
        setEdge(cisla);
    }

    public void setEdge(int[] args) {
        for(int i=0;i< args.length;i++){
            this.edge[i] = Game.getEdges(args[i]);
        }
    }


    public int[] EdgesToCorner(int id){
        int[] cisla = new int[3];
        switch (id) {
            case 1 -> {
                cisla[0] = 1;
                cisla[1] = 7;
            }
            case 2 -> {
                cisla[0] = 2;
                cisla[1] = 1;
            }
            case 3 -> {
                cisla[0] = 3;
                cisla[1] = 8;
                cisla[2] = 2;
            }
            case 4 -> {
                cisla[0] = 3;
                cisla[1] = 4;
            }
            case 5 -> {
                cisla[0] = 5;
                cisla[1] = 9;
                cisla[2] = 4;
            }
            case 6 -> {
                cisla[0] = 6;
                cisla[1] = 5;
                cisla[2] = 0;
            }
            case 7 -> {
                cisla[0] = 10;
                cisla[1] = 6;
                cisla[2] = 0;
            }
            case 8 -> {
                cisla[0] = 11;
                cisla[1] = 19;
                cisla[2] = 0;
            }
            case 9 -> {
                cisla[0] = 7;
                cisla[1] = 12;
                cisla[2] = 11;
            }
            case 10 -> {
                cisla[0] = 13;
                cisla[1] = 20;
                cisla[2] = 12;
            }
            case 11 -> {
                cisla[0] = 8;
                cisla[1] = 14;
                cisla[2] = 13;
            }
            case 12 -> {
                cisla[0] = 15;
                cisla[1] = 21;
                cisla[2] = 14;
            }
            case 13 -> {
                cisla[0] = 9;
                cisla[1] = 16;
                cisla[2] = 15;
            }
            case 14 -> {
                cisla[0] = 17;
                cisla[1] = 22;
                cisla[2] = 16;
            }
            case 15 -> {
                cisla[0] = 10;
                cisla[1] = 18;
                cisla[2] = 17;
            }
            case 16 -> {
                cisla[0] = 23;
                cisla[1] = 18;
                cisla[2] = 0;
            }
            case 17 -> {
                cisla[0] = 24;
                cisla[1] = 34;
                cisla[2] = 0;
            }
            case 18 -> {
                cisla[0] = 19;
                cisla[1] = 25;
                cisla[2] = 24;
            }
            case 19 -> {
                cisla[0] = 26;
                cisla[1] = 35;
                cisla[2] = 25;
            }
            case 20 -> {
                cisla[0] = 20;
                cisla[1] = 27;
                cisla[2] = 26;
            }
            case 21 -> {
                cisla[0] = 28;
                cisla[1] = 36;
                cisla[2] = 27;
            }
            case 22 -> {
                cisla[0] = 21;
                cisla[1] = 29;
                cisla[2] = 28;
            }
            case 23 -> {
                cisla[0] = 30;
                cisla[1] = 37;
                cisla[2] = 29;
            }
            case 24 -> {
                cisla[0] = 22;
                cisla[1] = 31;
                cisla[2] = 30;
            }
            case 25 -> {
                cisla[0] = 32;
                cisla[1] = 36;
                cisla[2] = 31;
            }
            case 26 -> {
                cisla[0] = 23;
                cisla[1] = 33;
                cisla[2] = 32;
            }
            case 27 -> {
                cisla[0] = 39;
                cisla[1] = 33;
                cisla[2] = 0;
            }
            case 28 -> {
                cisla[0] = 34;
                cisla[1] = 40;
                cisla[2] = 0;
            }
            case 29 -> {
                cisla[0] = 41;
                cisla[1] = 50;
                cisla[2] = 40;
            }
            case 30 -> {
                cisla[0] = 35;
                cisla[1] = 42;
                cisla[2] = 41;
            }
            case 31 -> {
                cisla[0] = 43;
                cisla[1] = 51;
                cisla[2] = 42;
            }
            case 32 -> {
                cisla[0] = 36;
                cisla[1] = 44;
                cisla[2] = 43;
            }
            case 33 -> {
                cisla[0] = 45;
                cisla[1] = 52;
                cisla[2] = 44;
            }
            case 34 -> {
                cisla[0] = 37;
                cisla[1] = 46;
                cisla[2] = 45;
            }
            case 35 -> {
                cisla[0] = 47;
                cisla[1] = 53;
                cisla[2] = 46;
            }
            case 36 -> {
                cisla[0] = 36;
                cisla[1] = 48;
                cisla[2] = 47;
            }
            case 37 -> {
                cisla[0] = 49;
                cisla[1] = 54;
                cisla[2] = 48;
            }
            case 38 -> {
                cisla[0] = 39;
                cisla[1] = 49;
                cisla[2] = 0;
            }
            case 39 -> {
                cisla[0] = 50;
                cisla[1] = 55;
                cisla[2] = 0;
            }
            case 40 -> {
                cisla[0] = 56;
                cisla[1] = 63;
                cisla[2] = 55;
            }
            case 41 -> {
                cisla[0] = 51;
                cisla[1] = 57;
                cisla[2] = 56;
            }
            case 42 -> {
                cisla[0] = 58;
                cisla[1] = 64;
                cisla[2] = 57;
            }
            case 43 -> {
                cisla[0] = 52;
                cisla[1] = 59;
                cisla[2] = 58;
            }
            case 44 -> {
                cisla[0] = 60;
                cisla[1] = 65;
                cisla[2] = 59;
            }
            case 45 -> {
                cisla[0] = 53;
                cisla[1] = 61;
                cisla[2] = 60;
            }
            case 46 -> {
                cisla[0] = 62;
                cisla[1] = 66;
                cisla[2] = 61;
            }
            case 47 -> {
                cisla[0] = 54;
                cisla[1] = 62;
                cisla[2] = 0;
            }
            case 48 -> {
                cisla[0] = 63;
                cisla[1] = 47;
                cisla[2] = 0;
            }
            case 49 -> {
                cisla[0] = 48;
                cisla[1] = 47;
                cisla[2] = 0;
            }
            case 50 -> {
                cisla[0] = 64;
                cisla[1] = 69;
                cisla[2] = 68;
            }
            case 51 -> {
                cisla[0] = 70;
                cisla[1] = 69;
                cisla[2] = 0;
            }
            case 52 -> {
                cisla[0] = 65;
                cisla[1] = 68;
                cisla[2] = 71;
            }
            case 53 -> {
                cisla[0] = 72;
                cisla[1] = 71;
                cisla[2] = 0;
            }
            case 54 -> {
                cisla[0] = 66;
                cisla[1] = 72;
                cisla[2] = 0;
            }
        }
        return cisla;
    }



    public void setPiece(Pieces piece) {
            this.piece = piece;
            setBuilt();
    }

    public void setBuilt() {
        isBuilt = true;
    }

    @Override
    public String toString() {
        return "Corner{" +
                "cornerId=" + cornerId +
                ", x=" + x +
                ", y=" + y +
                ", piece=" + piece +
                ", isBuilt=" + isBuilt +
                ", edge=" + Arrays.toString(edge) +
                '}';
    }

    public boolean CheckIfCityOrTown(Pieces piece){
        if(piece.getPieceType()== PieceType.Road){
            System.out.println("You cannot build a road on a corner. Roads can only be built on edges");
            return false;
        }else
            System.out.println("");
            return true;
    }

    public boolean CheckiIfVillageExists(Color color){
        if(piece==null){
            return false;
        }else{
            if(piece.getPieceType() == PieceType.Village && color == piece.getColor()){
                System.out.println( "");
                return true;
            }else
                System.out.println("No village to be upgraded to city");
            return false;
        }
    }

    public boolean checkifroadisconnected(Color color, Edge[] edges){
        boolean temp=false;
        for (Edge value : edges) {
            if (value.getPiece() == null) {
            } else {
                System.out.println("");
                if (value.getPiece().getColor() == color) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean getisBuilt(){
        return isBuilt;
    }

    public int getCornerId(){
        return cornerId;
    }

    public Edge[] getEdges(){
        return edge;
    }

    public Pieces getPiece(){return piece;}
}
