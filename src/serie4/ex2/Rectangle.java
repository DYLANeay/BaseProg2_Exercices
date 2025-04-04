package serie4.ex2;

public class Rectangle extends Shape{

    public Rectangle(String name){
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
