package Q1;

public class CircleWithException{
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius<0){
            throw new IllegalArgumentException("Radius is not a positive number, please re-enter radius.");
        }
        this.radius = radius;
    }

    public double getArea() throws Exception{
        double area;
        area = Math.PI * this.radius * this.radius;

        if(area>1000){
            throw new Exception("Area exceeds 1000.");
        }
        return area;
    }

    public double getDiameter() {
        return (this.radius * 2);
    }

}