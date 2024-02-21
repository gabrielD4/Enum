
public class Rectangle extends Shape {

    private int width;

    private int height;

    public Rectangle(int width, int height) {
        super(AnglesNumber.fourAngles);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
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
        int area = width * height;
        System.out.println("Rectangle width is: " + width + " and height is: " + height);
        System.out.println("The area of a rectangle is width * height ");
        System.out.println("The rectangle area is: " + area);
    }
}

