public class Point2D {

    public float x;
    public float y;

    public Point2D(){
        x = 0;
        y = 0;
    }

    public Point2D(float newx, float newy){
        x = newx;
        y = newy;
    }

    public String toString(){
        String tostring = "[" + Float.toString(x) + "," + Float.toString(y) + "]";
        return tostring;
    }
}
