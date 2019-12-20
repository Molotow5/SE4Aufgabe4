public class TestMain {

    public static void main(String[] args){

        try {
            ShapeFactory shapeFactory = ShapeFactory.getInstance();
            Shape kreis = shapeFactory.makeShape("Kreis");
            Shape quadrat = shapeFactory.makeShape("Quadrat");
            Shape dreieck = shapeFactory.makeShape("Dreieck");

            kreis.draw();
            quadrat.draw();
            dreieck.draw();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
