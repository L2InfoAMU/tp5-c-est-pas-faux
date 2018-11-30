package viewer;

import image.Image;
import image.Pixel;
import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    public int width, height;
    public PaletteRasterImage palette;

    public PaletteRasterImage(Color color, int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                new Pixel(i, j, color);

            }
        }
    }
















    @Override
    public Color getPixelColor(int x, int y) {
        return getPixelColor(x,y);
    }

    @Override
    public int getWidth() {
        return getWidth();
    }

    @Override
    public int getHeight() {
        return getHeight();
    }
}

