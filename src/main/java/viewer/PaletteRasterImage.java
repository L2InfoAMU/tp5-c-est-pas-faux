package viewer;

import image.Image;
import image.Pixel;
import static util.Matrices.*;
import javafx.scene.paint.Color;
import java.util.ArrayList;
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
        this.palette=new ArrayList<>();
    }

    public void setPixelColor(Color color, int x, int y){
        int index=palette.indexOf(color);
        if(index==-1){
            palette.add(color);
            index=palette.size()-1;
        }
        indexesOfColors[y][x]=index;
    }

    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[y][x]);
    }

    public void setPixelsColor(Color[][] pixels){

    }

    private void setPixelsColor(Color color){
       this.palette.clear();
       palette.add(color);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                indexesOfColors[j][i]=0;
            }
        }
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

