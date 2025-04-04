package serie4.ex2;

public class Circle extends Shape{
    public Circle(String name){
        super(name);
    }
    @Override
    public double calculateArea(){
        return 10;
    }

    @Override
    public double calculatePerimeter(){
        return 20;
    }
}
