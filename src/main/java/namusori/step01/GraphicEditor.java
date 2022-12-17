package namusori.step01;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[ARRAY_LENGTH];
        Ellipse[] ellipses = new Ellipse[ARRAY_LENGTH];
        Line[] lines = new Line[ARRAY_LENGTH];

        // Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNumber = (int) (Math.random() * 3);

            if (randomNumber == 0) {
                rectangles[i] = new Rectangle();
            }

            if (randomNumber == 1) {
                ellipses[i] = new Ellipse();
            }

            if (randomNumber == 2) {
                lines[i] = new Line();
            }
        }

        // Drawing Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (rectangles[i] != null) {
                rectangles[i].drawRectangle();
            }
            if (ellipses[i] != null) {
                ellipses[i].drawEllipse();
            }
            if (lines[i] != null) {
                lines[i].drawLine();
            }
        }


    }
}
