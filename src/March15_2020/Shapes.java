package March15_2020;

public class Shapes {
        char symbol;
        int width;
        int height;
        public Shapes(){
            this.symbol = '*';
            this.width = 15;
            this.height = 15;
        }
        public Shapes(char symbol, int width, int height) {
            this.symbol = symbol;
            this.width = width;
            this.height = height;
        }
        public void printPyramid(){
            for (int i = 1; i <this.height ; i++) {
                for (int j = 1; j <i ; j++) {
                    System.out.print(this.symbol+" ");
                }
                System.out.println();
            }
        }
        public void printRectangle(){
            for (int i = 0; i <this.height ; i++) {
                for (int j = 1; j <this.width ; j++) {
                    System.out.print(this.symbol+"  ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Shapes newShape = new Shapes('*', 15,15);
            newShape.printPyramid();
            newShape.printRectangle();
        }
    }

