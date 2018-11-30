package viewer;

import image.Image;
import image.Pixel;
import javafx.scene.paint.Color;

import java.util.List;

public class PaletteRasterImage implements Image {

    public int width, height;
    List<Color> palette;
    int[][] indexesOfColors;


    public PaletteRasterImage(int width, int height, List<Color> palette) {
        this.width = width;
        this.height = height;
        this.palette = palette;
    }


    public PaletteRasterImage(int[][] indexesOfColors) {
        this.indexesOfColors = indexesOfColors;
    }

    public void createRepresentation(){
        this.indexesOfColors=new int[height][width];
    }

    public void setPixelColor(Color color, int x, int y){

    }

    public Color getPixelColor(int x, int y){

    }

    public void setPixelsColor(Color[][] pixels){

    }

    private void setPixelsColor(Color color){

    }


    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}

