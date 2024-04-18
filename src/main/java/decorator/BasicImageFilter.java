package decorator;

public class BasicImageFilter extends ImageDecorator {

    public BasicImageFilter(Image image) {
        super(image);
    }

    public float getProcessingCost() {
        return 10.0f;
    }

    public String getStructureName() {
        return "BasicImageFilter";
    }
}
