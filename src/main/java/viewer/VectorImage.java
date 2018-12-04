package viewer;

import image.Image;
import image.Shape;
import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image {

    public int width, height;
    public List<Shape> shapes;

    public VectorImage(List<Shape> shapes, int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    protected int setWidth(int width) {
        return this.width = width;
    }

    protected int setHeight(int height) {
        return this.height = height;
    }
}
