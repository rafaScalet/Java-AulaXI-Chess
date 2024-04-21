package main;

public class Main {
    public static void main(String[] args) {

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
