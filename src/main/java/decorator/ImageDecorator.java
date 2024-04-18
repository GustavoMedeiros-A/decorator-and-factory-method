package decorator;

public abstract class ImageDecorator implements Image {

    private Image image;
    public String structure;

    public ImageDecorator(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract float getProcessingCost();

    public float getImagePrice() {
        return this.image.getImagePrice() * getProcessingCost();
    }

    public abstract String getStructureName();

    public String getStructure() {
        return this.image.getStructure() + "/" + this.getStructureName();
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

}
