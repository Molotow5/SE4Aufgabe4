//Marcus Jan Almert 119606
//Luigi Portwich 119649
//Sebastian Reichmann 120450
//Vladimir Dimitrov Spassov

public class ShapeFactory {

    private static final ShapeFactory factory = new ShapeFactory();

    private ShapeFactory(){}

    public static ShapeFactory getInstance(){
        return factory;
    }

    public Shape makeShape(String shapetype) throws  IllegalArgumentException{
        if (shapetype.equals("Kreis")){
            return new Circle();
        } else if (shapetype.equals("Quadrat")){
            return new Square();
        } else if (shapetype.equals("Dreieck")){
            return new Rectangle();
        } else {
            throw new IllegalArgumentException("Fehler bei Shapekonstruktion[ShapeFactory");
        }
    }

}
