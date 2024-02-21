enum AnglesNumber {
    fourAngles,
    threeAngles
}

abstract class Shape {

    private AnglesNumber anglesNumber;

    public Shape(AnglesNumber anglesNumber) {
        this.anglesNumber = anglesNumber;
    }

    public AnglesNumber getAnglesNumber() {
        return anglesNumber;
    }

    public void setAnglesNumber(AnglesNumber anglesNumber) {
        this.anglesNumber = anglesNumber;
    }

    public void calculateArea() {
        System.out.println("Area of a generic shape");
    }
}
