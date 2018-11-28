package viewer;

import image.Image;
import javafx.scene.paint.Color;

import static util.Matrices.*;

public class BruteRasterImage implements Image {


    Color[][] pixels;
    int width;
    int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        createRepresentation();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[i][j] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        this.width =getRowCount(colors);
        this.height =getColumnCount(colors) ;

        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);

        createRepresentation();
        for (int i = 0; i < getRowCount(colors); i++) {
            for (int j = 0; j < getColumnCount(colors); j++) {
                pixels[i][j] = colors[i][j];
            }
        }
    }

    public void createRepresentation(){
        this.pixels = new Color[height][width];
    }


    @Override
    public Color getPixelColor(int x, int y) {
        return this.pixels[x][y];
    }

    @Override
    public int getWidth() {
        return getRowCount(this.pixels);
    }

    @Override
    public int getHeight() {
        return getColumnCount(this.pixels);
    }

    public void setPixelColor(Color color, int x, int y){
        this.pixels[x][y]=color;
    }

    private void setPixelsColor(Color color) {
        for (int i = 0; i < getRowCount(this.pixels); i++) {
            for (int j = 0; j < getColumnCount(this.pixels); j++) {
                pixels[i][j] = color;
            }
        }
    }
    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }



}
