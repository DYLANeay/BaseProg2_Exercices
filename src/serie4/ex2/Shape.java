package serie4.ex2;

abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void displayInfo() {
        System.out.println("Name: " + this.getName()
                + ", Area: "+ this.calculateArea()
                + ", Perimeter: "+ this.calculatePerimeter());
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}