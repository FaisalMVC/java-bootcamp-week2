public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        setWidth(side);
        setLength(side);
    }

    public Square(double side,String color, boolean filled) {
        super(color, filled, side, side);
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){
        return getLength();
    }
    public String toString(){
        return "A Square with side="+ getSide()+", which is a subclass of "+super.toString();
    }
}
