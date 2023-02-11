package com.jimmywan.javafakedata.Bean;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FakeImage {
    private BufferedImage  image;
    public static  BufferedImage  getFakeImage() throws IOException {
        return getFakeImage(new Random().nextInt(300), new Random().nextInt(300));
    };
    private static String path ="src/main/java/com/jimmywan/javafakedate/Data/country";
    public static  BufferedImage  getFakeImage(int width,int height) throws IOException {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.ORANGE);
//        String path = "D://test1.jpg";
        createImage(path, bufferedImage);
//        graphics.drawImage(ImageIO.read(new File(path,"image.png"))), 128, 128, this);
        return bufferedImage;
    };

    private static void createImage(String fileLocation, BufferedImage image) {
        try {
            FileOutputStream fos = new FileOutputStream(fileLocation);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
            encoder.encode(image);
            bos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
