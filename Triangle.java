
public class Triangle extends Shape {

    private int width;

    private int height;

    public Triangle(int width, int height) {
        super(AnglesNumber.threeAngles);
        this.width = width;
        this.height = height;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        int area = (width * height) / 2;
        System.out.println("Triangle width is: " + width + " and height is: " + height);
        System.out.println("The area of a triangle is (width * height) / 2 ");
        System.out.println("The triangle area is: " + area);
    }

}
