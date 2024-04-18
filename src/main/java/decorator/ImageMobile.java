package decorator;

public class ImageMobile implements Image {

    public float imagePrice;

    public ImageMobile() {
    }

    public ImageMobile(float imagePrice) {
        this.imagePrice = imagePrice;
    }

    public float getImagePrice() {
        return imagePrice;
    }

    public String getStructure() {
        return "ImageMobile";
    }

}
