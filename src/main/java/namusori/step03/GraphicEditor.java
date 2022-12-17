package namusori.step03;

public class GraphicEditor {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[ARRAY_LENGTH];

        // Generate Shapes
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int randomNumber = (int) (Math.random() * 3);

            if (randomNumber == 0) {
                shapes[i] = new Rectangle();
            }

            if (randomNumber == 1) {
                shapes[i] = new Ellipse();
            }

            if (randomNumber == 2) {
                shapes[i] = new Line();
            }
        }

        // Drawing Shapes
        for (Shape shape : shapes) {
            shape.draw();
        }


    }
}
