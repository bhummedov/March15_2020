package March15_2020;

public class RectangularPyramid {
    int height;
    int width;
    char Symbol;

    public RectangularPyramid() {
        int height = 20;
        int width = 21;
        char Symbol = '*';
    }

    public RectangularPyramid(int number1, int number2, char number3) {
        int height = 20;
        int width = 21;
        char Symbol = '*';
    }

    public void printRectangular() {
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                System.out.print(Symbol);
            }
            System.out.println();
        }
    }

    public void printPyramid() {
        for (int i = 0; i < height; i++) {
            for (int j = i; j < width; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(Symbol + " ");
            }
            System.out.println();
        }
    }
}

