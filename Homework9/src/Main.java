/*
*
* @author Faisal Alharbi
*
* */
public class Main {
    public static void main(String[] args) {
        // Movie
        Movie m1 = new Movie("Shawshank", 45.25,"Frank Darabont");
        Movie m2 = new Movie("Godfather", 95.99,"Francis Ford Coppola");
        Movie m3 = new Movie("The Dark Knight", 29.25,"Christopher Nolan");

        System.out.println("-------------------Test Movie Class-------------------");
        System.out.println("Movie Name : "+m1.getName()+"\nMovie Price : "+m1.getPrice()+"\nPrice after discount : "+m1.getDiscount()+"\n");
        System.out.println("Movie Name : "+m2.getName()+"\nMovie Price : "+m2.getPrice()+"\nPrice after discount : "+m2.getDiscount()+"\n");
        System.out.println("Movie Name : "+m3.getName()+"\nMovie Price : "+m3.getPrice()+"\nPrice after discount : "+m3.getDiscount()+"\n");

        // Books
        Book b1 = new Book("Introduction to OS", 49.99,"Harvey M. Deitel");
        Book b2 = new Book("Introduction to Java", 79.99,"Liang, Y. Daniel");
        Book b3 = new Book("Fundamentals of DBMS", 47.99,"Ramez Elmasri");
        System.out.println("-------------------Test Book Class-------------------");

        System.out.println("Book Name : "+b1.getName()+"\nBook Price : "+b1.getPrice()+"\nPrice after discount : "+b1.getDiscount()+"\n");
        System.out.println("Book Name : "+b2.getName()+"\nBook Price : "+b2.getPrice()+"\nPrice after discount : "+b2.getDiscount()+"\n");
        System.out.println("Book Name : "+b3.getName()+"\nBook Price : "+b3.getPrice()+"\nPrice after discount : "+b3.getDiscount()+"\n");

        // MovablePoint
        System.out.println("-------------------Test Movable Point Class-------------------");
        MovablePoint p1 = new MovablePoint(50,50,5,10);
        p1.moveUp();
        p1.moveLeft();
        p1.moveLeft();
        p1.moveDown();
        p1.moveRight();
        p1.moveRight();
        p1.moveDown();
        p1.moveDown();

    }
}