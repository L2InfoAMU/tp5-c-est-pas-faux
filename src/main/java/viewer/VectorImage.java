package viewer;

import image.Point;
import image.Shape;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class VectorImage extends RasterImage  {

    public List<Shape> shapes;

    public  VectorImage(List<Shape> shapes, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        for (Shape shape : shapes)
            this.shapes.add(shape);
    }

    public void createRepresentation(){
        this.shapes = new ArrayList<>();
    }


    /*public Color getPixelColor(int x, int y) {
        Point toSearch = new Point(x, y);
        for (Shape shape : shapes){
            if (shape.contains(toSearch)) {
                return shapes.getFillColor();
            }
        }
        return Color.WHITE;
    }*/



}
