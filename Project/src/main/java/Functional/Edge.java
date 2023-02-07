package Functional;

public class Edge {
    private int edgeId;
    private Pieces piece;
    private boolean isBuilt;

    public Edge(int edgeId) {
        this.edgeId = edgeId;
        this.piece=null;
        this.isBuilt = false;
    }


    /**
     * kontrola ci sa hrac pokusa stavat cestu
     * @param piece druh figurky ktory hrac stava
     * @return true/false
     */
    public boolean CheckIfRoad(Pieces piece){
        if(piece.getPieceType()!= PieceType.Road){
            System.out.println("You can only build a road on an edge.");
            return false;
        }else
            return true;
    }

    public boolean getisBuilt(){
        return isBuilt;
    }

    public Pieces getPiece(){
        return piece;
    }

    public void setPiece(Pieces piece){
        this.piece = piece;
        this.isBuilt = true;
    }
}
