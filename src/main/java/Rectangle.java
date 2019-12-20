public class Rectangle extends  Shape {

    private String name;
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;

    public Rectangle(){
        super();
        point1 = new Point2D();
        point2 = new Point2D();
        point3 = new Point2D();
    }

    public void draw(){
        System.out.println("Objektname: " + name + "\nObjekttyp : Rectangle \nPunkt1: "+ point1.toString() +
                "\nPunkt2: " + point2.toString() + "\nPunkt3: " + point3.toString() + "\n");
    }
}
