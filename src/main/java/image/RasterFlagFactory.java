package image;

import javafx.scene.paint.Color;
import viewer.BruteRasterImage;
import viewer.NotSupportedException;
import viewer.RasterImageType;

public class RasterFlagFactory implements ImageFactory {

    private int width;
    private int height;
    private Color leftColor;
    private Color middleColor;
    private Color rightColor;
    private RasterImageType rasterImageType;

    public RasterFlagFactory(int width, int height, Color leftColor, Color middleColor, Color rightColor, RasterImageType rasterImageType) {
        this.width = width;
        this.height = height;
        this.leftColor = leftColor;
        this.middleColor = middleColor;
        this.rightColor = rightColor;
        this.rasterImageType = rasterImageType;
    }

    @Override
    public Image makeImage() {
        Color[][] colors = new Color[height][width];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                colors[y][x] = (x < width / 3) ? leftColor : ((x > 2 * width / 3) ? rightColor : middleColor);
            }
        }
        switch (rasterImageType){
            case BRUTE:
                return new BruteRasterImage(colors);
            default:
                throw new NotSupportedException(rasterImageType + " is not supported");
        }
    }
}