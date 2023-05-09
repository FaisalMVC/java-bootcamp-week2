public class Shape {
    private String color = "Without color"; // I don't want the result to be null if the user didn't choose a color.
    private boolean filled;

    public Shape(){

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFILLED() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        String isFilledOrNot;
        if (isFILLED()){
            isFilledOrNot=" is filed";
        }else {
            isFilledOrNot=" is Not filed";
        }
        return "A Shape with color "+color+" and "+isFilledOrNot;
    }
}
