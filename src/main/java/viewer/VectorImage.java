package viewer;

import java.awt.*;

import image.Image;
import image.Point;
import image.Shape;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage extends RasterImage implements Image {

    public List<Shape> shapes;

    public  VectorImage(List<Shape> shapes, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        this.shapes=shapes;
       // for (Shape shape : shapes)
            //this.shapes.add(shape);
    }

    public void createRepresentation(){
        this.shapes = new ArrayList<>();
    }


    public Color getPixelColor(int x, int y) {
        Point point= new Point(x, y);
        for (Shape shapes: shapes) {
            if (shapes.contains(point)) {
                return shapes.getColor();
            }
        }
        return Color.WHITE;
    }
}
