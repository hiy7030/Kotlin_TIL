package Lec12;

public class Lec12Main {
    public static void main(String[] args) {
        // Person.Factory.newBaby("ABC");
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("move method");
            }

            @Override
            public void fly() {
                System.out.println("fly method");
            }
        });
    }

    public static void moveSomething(Movable movable) {
        movable.fly();
        movable.move();
    }
}
