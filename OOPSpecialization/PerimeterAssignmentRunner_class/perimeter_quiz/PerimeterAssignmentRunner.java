import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    //The getPerimeter method has one parameter s of type Shape. Given a shape, this method returns the perimeter of the shape.
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    //This method returns an integer that is the number of points in Shape s
    public int getNumPoints (Shape s) {
        int totalPoints = 0;
        for (Point p : s.getPoints() ) {
            totalPoints ++;
        }
        return totalPoints;
    }

    public double getAverageLength(Shape s) {
        return getPerimeter(s) / getNumPoints(s);
    }

    public double getLargestSide(Shape s) {
        double longestSide = 0;
        Point prevPoint = s.getLastPoint();
        for (Point currPoint : s.getPoints() ) {
            if (currPoint.distance(prevPoint) > longestSide) {
                longestSide = currPoint.distance(prevPoint);
            }
        }
        return longestSide;
    }

    public double getLargestX(Shape s) {
        double largestX = 0;
        for (Point p : s.getPoints() ) {
            if (p.getX() > largestX) {
                largestX = p.getX();
            }
        }
        return largestX;
    }

    // read several files and returns the largest perimeter
    public double getLargestPerimeterMultipleFiles() {
        DirectoryResource dr = new DirectoryResource();
        double largestPerimeter = 0;
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                largestPerimeter = perimeter;
            }
        }
        return largestPerimeter;
    }

    // Create its own Directory Resource, except that this new method returns the File that has the largest such perimeter
    public String getFileWithLargestPerimeter() {
        DirectoryResource dr = new DirectoryResource();
        File temp = null;
        double largestPerimeter = 0;

        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double perimeter = getPerimeter(s);
            if (perimeter > largestPerimeter) {
                temp = f;
            }
        }
        return temp.getName();
    }

    //This method is used to select a data file by using the FileResource class, create a shape based on the points from that data file, and then calculate the perimeter of the shape and output its value.
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);

        int totalPoints = getNumPoints(s);
        System.out.println("The shape has " + totalPoints + " points");

        double aveLength = getAverageLength(s);
        System.out.println("The average length is " + aveLength);

        double longestSide = getLargestSide(s);
        System.out.println("The longest side is " + longestSide);

        double largestX = getLargestX(s);
        System.out.println("The largest x-coordinate is " + largestX);

        testPerimeterMultipleFiles();
    }

    // Testing function getLargestPerimeterMultipleFiles()
    public void testPerimeterMultipleFiles() {
        System.out.println("The largest perimeter is " + getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
