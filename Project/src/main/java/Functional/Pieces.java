package Functional;

public class Pieces {
    private Color color;
    private PieceType pieceType;
    private int amountOfPiecesAvailable;

    public Pieces(Color color, PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
        if(pieceType == PieceType.Road){
            this.amountOfPiecesAvailable=15;
        } else if (pieceType==PieceType.City) {
            this.amountOfPiecesAvailable=4;
        } else if (pieceType==PieceType.Village) {
            this.amountOfPiecesAvailable=5;
        }
    }

    public PieceType getPieceType(){
        return pieceType;
    }

    public void Build1piece(){
        if (amountOfPiecesAvailable==0){
            System.out.println("O pieces of this type left");
        }else{
            this.amountOfPiecesAvailable--;
        }

    } public void Return1Piece(){
        this.amountOfPiecesAvailable++;
    }
    public Color getColor(){
        return color;
    }
}

