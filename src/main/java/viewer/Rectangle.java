package viewer;

import image.Point;
import image.Shape;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {

    public int x, y, width, height;
    public Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
       // return (point.x >= this.x && point.y > this.y && point.x < width && point.y < height);
        return( point.x>= this.x && point.x<=this.x+width && point.y>=this.y && point.y<=this.y+height);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
