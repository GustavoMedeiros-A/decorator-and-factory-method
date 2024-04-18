package decorator;

public class ContrastImageFilter extends ImageDecorator {

    public ContrastImageFilter(Image image) {
        super(image);
    }

    public float getProcessingCost() {
        return 20.0f;
    }

    public String getStructureName() {
        return "ContrastImageFilter";
    }
}
