package viewer;

import image.Point;
import image.Shape;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    public int x, y, width, heigth;
    public Color color;

    public Rectangle(int x, int y, int width, int heigth, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.color = color;
        new Rectangle(x, y, width, heigth, color);
    }

    @Override
    public boolean contains(Point point) {
        return (point.x > x && point.y > y && point.x < width && point.y < heigth);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
