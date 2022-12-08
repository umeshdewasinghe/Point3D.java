import java.math.*;

public class Point3D {
    private int coordinate1;
    private int coordinate2;
    private int coordinate3;

    public Point3D() {
        this.coordinate1 = 0;
        this.coordinate2 = 0;
        this.coordinate3 = 0;
    }

    public Point3D(int coordinate1, int coordinate2, int coordinate3) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
        this.coordinate3 = coordinate3;
    }

    public double distance (int coordinate1, int coordinate2, int coordinate3){


        return Math.sqrt((coordinate1 * coordinate1) + (coordinate2 * coordinate2) + (coordinate3 * coordinate3));

    }

    public void display(double distance){


        System.out.println("Distance from the origin is : "+distance);
    }
}
