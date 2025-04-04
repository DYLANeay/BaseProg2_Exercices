package serie4.ex2;

public class Square extends Shape{
    public Square(String name){
        super(name);
    }
    @Override
    public double calculateArea(){
        return 20;
    }

    @Override
    public double calculatePerimeter(){
        return 30;
    }
}
