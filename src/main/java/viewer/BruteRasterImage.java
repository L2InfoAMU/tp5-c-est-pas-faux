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

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                pixels[j][i] = color;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        this.width =getColumnCount(colors);
        this.height = getRowCount(colors);

        requiresNonNull(colors);
        requiresNonZeroDimensions(colors);
        requiresRectangularMatrix(colors);

        createRepresentation();
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                pixels[j][i] = colors[j][i];
            }
        }
    }

    public void createRepresentation(){
        this.pixels = new Color[height][width];
    }


    @Override
    public Color getPixelColor(int x, int y) {
        return this.pixels[y][x];
    }

    @Override
    public int getWidth() {
        return getColumnCount(this.pixels);
    }

    @Override
    public int getHeight() {
        return getRowCount(this.pixels);
    }

    public void setPixelColor(Color color, int x, int y){
        this.pixels[y][x]=color;
    }



    private void setPixelsColor(Color[][] pixels){
        for (int i = 0; i < getRowCount(this.pixels); i++) {
            for (int j = 0; j < getColumnCount(this.pixels); j++) {
                this.pixels[j][i]=pixels[j][i];
            }
        }
    }
    private void setPixelsColor(Color color) {
        for (int i = 0; i < getRowCount(this.pixels); i++) {
            for (int j = 0; j < getColumnCount(this.pixels); j++) {
                pixels[j][i] = color;
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
