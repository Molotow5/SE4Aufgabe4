public class Square extends Shape {

    private String name;
    private Point2D point1;
    private Point2D point2;

    public Square(){
        super();
        point1 = new Point2D();
        point2 = new Point2D();
    }

    public void draw(){
        System.out.println("Objektname: " + name + "\nObjekttyp : Square \nPunkt1:     "+ point1.toString() +
                "\nPunkt2:     " + point2.toString() + "\n");
    }
}
