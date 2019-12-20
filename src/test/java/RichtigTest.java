import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class RichtigTest {

    @Test
    public void shapeFactoryGetsWrongKeynameForConstructionShape(){
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        assertThrows(IllegalArgumentException.class, () -> {
            Shape testshape = shapeFactory.makeShape("Falscher Inhalt");
        });
    }
}
