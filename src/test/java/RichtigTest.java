import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class RichtigTest {

    @Test
    public void shapeFactoryGetsWrongKeynameForConstructionShape(){
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        assertThrows(IllegalArgumentException.class, () -> {
            Shape testshape = shapeFactory.makeShape("Falscher Inhalt");
        });
    }

    @Test
    public void testForCorrectShapeConstructionTroughFactory(){
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        Shape kreis = shapeFactory.makeShape("Kreis");
        Shape quadrat = shapeFactory.makeShape("Quadrat");
        Shape dreieck = shapeFactory.makeShape("Dreieck");

        assertEquals("NoName", kreis.getName());
        assertEquals("NoName", quadrat.getName());
        assertEquals("NoName", dreieck.getName());
    }
}
