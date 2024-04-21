package main;

public class Main {
    public static void main(String[] args) {
        Chess[][] ChessBoard = new Chess[8][8];
        boolean squaresColor = false;

        for (int row = 0; row < ChessBoard[0].length; row++) {
            squaresColor = !squaresColor;
            for (int col = 0; col < ChessBoard[0].length; col++) {
                ChessBoard[row][col] = new Chess();
                ChessBoard[row][col].setLine(row);
                ChessBoard[row][col].setColumn(col);
                ChessBoard[row][col].setPiece("vazio");
                if (squaresColor) {
                    ChessBoard[row][col].setColor("Branca");
                    squaresColor = false;
                } else {
                    ChessBoard[row][col].setColor("Preta");
                    squaresColor = true;
                }
            }
        }
    }

    static class Chess {
        private int line;
        private int column;
        private String piece;
        private String color;

        public int getLine() {
            return line;
        }

        public void setLine(int line) {
            this.line = line;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public String getPiece() {
            return piece;
        }

        public void setPiece(String piece) {
            this.piece = piece;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
