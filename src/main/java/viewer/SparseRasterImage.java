package viewer;

import image.Image;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.paint.Color;

import static util.Matrices.*;

public class SparseRasterImage extends RasterImage implements Image {

    Map<Point,Color> nonWhitePixels;

    public SparseRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();

        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                nonWhitePixels.put(new Point(j, i), color);
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){
        this.width = getColumnCount(pixels);
        this.height = getRowCount(pixels);
        createRepresentation();

        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                nonWhitePixels.put(new Point(j, i), pixels[j][i]);
            }
        }
    }

    public void createRepresentation(){
        this.nonWhitePixels = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y){
        nonWhitePixels.put(new Point(x ,y), color);
    }

    public void setPixelsColor(Color[][] pixels) {

        for(int i = 0; i < getColumnCount(pixels); i++){
            for(int j = 0; j < getRowCount(pixels); j++){
                setPixelColor(pixels[j][i], j, i);
            }
        }
    }

    public void setPixelsColor(Color color){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                nonWhitePixels.put(new Point(j, i), color);
            }
        }
    }

    public Color getPixelColor(int x, int y){
        return nonWhitePixels.getOrDefault(new Point(y,x), Color.WHITE);
    }
}
