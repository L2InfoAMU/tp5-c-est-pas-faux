package viewer;

import java.awt.*;
import java.util.Map;

import static util.Matrices.*;
import static util.Matrices.requiresRectangularMatrix;

public class SparseRasterImage extends RasterImage {

   // Color Color;
    //Color [][] pixels;
    Map<Point,Color> nonWhitePixels;



    public SparseRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[j][i] = color;
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){
        this.width = getColumnCount(pixels);
        this.height = getRowCount(pixels);

        createRepresentation();
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
               this.pixels [j][i] = pixels[j][i];
            }
        }
    }


    public void createRepresentation(){
        this.pixels = new Color[height][width];
    }





    public boolean containceKey(Object Key){
        if ()
            return False;

        return  TRUE;
    }

    public Color get(Object Key){
       return ;
    }


    public Color getOrDefault(Object Key, Color defaultValue){


    }


    public Color put( Point key, Color value){


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
