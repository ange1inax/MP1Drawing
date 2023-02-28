public class Drawing {
    public static char[][] createCanvas(int width, int height) {
        char[][] canvas = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    canvas[i][j] = '=';
                } else if (j == 0 || j == width - 1) {
                    canvas[i][j] = '|';
                } else {
                    canvas[i][j] = ' ';
                }
                if ((i == 0 && j == 0) || (i == 0 && j == width - 1) || (i == height - 1 && j == 0) || (i == height - 1 && j == width - 1)) {
                    canvas[i][j] = '+';
                }
            }
        }
        return canvas;
    }

    public static void addCharacter(char[][] canvas, char character, int x, int y) {
        canvas[y][x] = character;
    }
    
    
    public static void main(String[] args) {
        char[][] canvas = createCanvas(10,5); // (width,height) this creates the dimension of the canvas
        // The letter H
        addCharacter(canvas, '|', 1, 1);
        addCharacter(canvas, '|', 1, 2);
        addCharacter(canvas, '|', 1, 3);
        addCharacter(canvas, '-', 2, 2);
        addCharacter(canvas, '-', 3, 2);
        addCharacter(canvas, '|', 4, 1);
        addCharacter(canvas, '|', 4, 2);
        addCharacter(canvas, '|', 4, 3);

        // The letter I
        addCharacter(canvas, 'o', 6, 1);
        addCharacter(canvas, '|', 6, 2);
        addCharacter(canvas, '|', 6, 3);

        //Exclamation point
        addCharacter(canvas, '|', 8, 1);
        addCharacter(canvas, '|', 8, 2);
        addCharacter(canvas, '.', 8, 3);
        for (int i = 0; i < canvas.length; i++) {
            System.out.println(new String(canvas[i]));
        }
    }
}
