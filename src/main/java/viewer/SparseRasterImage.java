package viewer;

import java.awt.*;
import java.util.Map;

import static util.Matrices.*;

public class SparseRasterImage extends RasterImage {

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
                nonWhitePixels.put(new Point(j, i), pixels[j][j]);
            }
        }
    }

    public void createRepresentation(){
        this.pixels = new Color[height][width];
    }

    public void setPixelColor(Color color, int x, int y){


    }

    public void setPixelsColor(Color[][] pixels){

    }

    public void setPixelsColor(Color color){


    }


    public Color getPixelColor(int x, int y){
        return nonWhitePixels.getOrDefault(new Point(x,y), Color.WHITE);
    }


}
