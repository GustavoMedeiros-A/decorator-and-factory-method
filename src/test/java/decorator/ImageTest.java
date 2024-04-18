package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImageTest {

    @Test
    void shouldReturnImagePrice() {
        var image = new ImageMobile(100.0f);

        assertEquals(100.0f, image.getImagePrice());
    }

    @Test
    void shouldReturnImagePriceWithBasicFilter() {
        var image = new BasicImageFilter(new ImageMobile(100.0f));

        assertEquals(1000.0f, image.getImagePrice());
    }

    @Test
    void shouldReturnImagePriceWithContrastFilter() {
        var image = new ContrastImageFilter(new ImageMobile(100.0f));

        assertEquals(2000.0f, image.getImagePrice());
    }

    @Test
    void shouldReturnImagePriceWithContrastAndBasicFilter() {
        var image = new ContrastImageFilter(new BasicImageFilter(new ImageMobile(100.0f)));

        assertEquals(20000.0f, image.getImagePrice());
    }

    @Test
    void shouldReturnImageStructure() {
        var image = new ImageMobile();

        assertEquals("ImageMobile", image.getStructure());
    }

    @Test
    void shouldReturnImageStructureWithBasicFilter() {
        var image = new BasicImageFilter(new ImageMobile());

        assertEquals("ImageMobile/BasicImageFilter", image.getStructure());
    }

    @Test
    void shouldReturnImageStructureWithContrastFilter() {
        var image = new ContrastImageFilter(new ImageMobile());

        assertEquals("ImageMobile/ContrastImageFilter", image.getStructure());
    }

    @Test
    void shouldReturnImageStructureWithContrastAndBasicFilter() {
        var image = new ContrastImageFilter(new BasicImageFilter(new ImageMobile()));

        assertEquals("ImageMobile/BasicImageFilter/ContrastImageFilter", image.getStructure());
    }

}
