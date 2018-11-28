package viewer;

import image.Image;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {


    Color[][] pixels;
    int width;
    int height;

    public BruteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        Color[][] pixels = new Color[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[i][j] = color;
            }
        }
    }



    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
