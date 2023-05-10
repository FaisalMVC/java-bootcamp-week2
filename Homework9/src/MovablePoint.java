public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp(){
        System.out.println("Current points ("+x+", "+y+"), After moveUp with speed : "+ySpeed+", ("+x+", "+(y+=ySpeed)+")");
    }
    public void moveDown(){
        System.out.println("Current points ("+x+", "+y+"), After moveDown with speed : "+ySpeed+", ("+x+", "+(y-=ySpeed)+")");
    }
    public void moveRight(){
        System.out.println("Current points ("+x+", "+y+"), After moveRight with speed : "+xSpeed+", ("+(x+=xSpeed)+", "+y+")");
    }
    public void moveLeft(){
        System.out.println("Current points ("+x+", "+y+"), After moveLeft with speed : "+xSpeed+", ("+(x-=xSpeed)+", "+y+")");
    }
}
