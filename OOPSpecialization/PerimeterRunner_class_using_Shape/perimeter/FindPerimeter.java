import edu.duke.*;

public class FindPerimeter {
    private static double computePerimeter(Shape s) {
        Point prevPoint = s.getLastPoint();
        double totalPerimeter = 0;
        for (Point currPoint : s.getPoints() ) {
            totalPerimeter += currPoint.distance(prevPoint);
            prevPoint = currPoint;
        }
        return totalPerimeter;
    }

    public static void main(String[] args) {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        System.out.println("The parameter is " + computePerimeter(s));
    }
}
