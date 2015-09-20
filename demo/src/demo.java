import magick.ImageInfo;
import magick.MagickImage;

/**
 * Created by dev on 15-9-18.
 */
public class demo
{
    static
    {
        System.setProperty("jmagick.systemclassloader", "false");
    }

    public static void main(String[] args) throws Exception
    {
        System.setProperty("java.library.path", "/app/jmagick/lib");
        System.out.println(System.getProperty("java.library.path"));
        ImageInfo outImgInfo;
        MagickImage image;
        MagickImage outImage;
        outImgInfo = new ImageInfo();
        image = new MagickImage(new ImageInfo("/app/dev/jmagick/demo/src/test.jpg"));
        outImage = image.scaleImage(800,1000);
        outImage.setFileName("/app/dev/jmagick/demo/src/test.webp");
        boolean result= outImage.writeImage(new ImageInfo());
        System.out.println("=========================" + outImage.getFileName());
        System.out.println(result);
    }
}
