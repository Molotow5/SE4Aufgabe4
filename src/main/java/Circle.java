public class Circle extends Shape{

    private String name;
    private Point2D midpoint;
    private float radius;

    public Circle(){
        super();
        midpoint = new Point2D();
        radius = 0;
    }

    public void draw(){
        System.out.println("Objektname: " + name + "\nObjekttyp : Circle \nMittelpunkt "+ midpoint.toString() +
                "\nRadius: " + radius + "\n");
    }

}
