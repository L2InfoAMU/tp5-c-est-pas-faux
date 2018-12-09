package viewer;

import image.Image;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

import static util.Matrices.getColumnCount;
import static util.Matrices.getRowCount;

public class PaletteRasterImage extends viewer.RasterImage implements Image {

    List<Color> palette;
    int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        this.palette = palette;
        palette.add(color);
    }

    public PaletteRasterImage(Color[][] pixels) {
        this.width = getColumnCount(pixels);
        this.height = getRowCount(pixels);
        createRepresentation();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if(!palette.contains(pixels[j][i]))
                    palette.add(pixels[j][i]);
                indexesOfColors[j][i] = palette.indexOf(pixels[j][i]);
            }
        }
    }

    public void createRepresentation(){
        this.indexesOfColors = new int[height][width];
        this.palette = new ArrayList<>();
    }

    public void setPixelColor(Color color, int x, int y){
        int index = palette.indexOf(color);
        if(index == -1){
            palette.add(color);
            index = palette.size()-1;
        }
        indexesOfColors[y][x] = index;
    }

    public void setPixelsColor(Color[][] pixels){

        for(int i = 0; i < getColumnCount(pixels); i++){
            for(int j = 0; j < getRowCount(pixels); j++){
                setPixelColor(pixels[j][i], j, i);
            }
        }
    }

    private void setPixelsColor(Color color){
        this.palette.clear();
        palette.add(color);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                indexesOfColors[j][i] = 0;
            }
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[y][x]);
    }
}
