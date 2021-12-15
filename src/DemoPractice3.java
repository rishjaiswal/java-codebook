class Shape {

    int l = 0;
    int b = 0;
    String color = null;
    int d = 0;

    public void setColor(String x){
        color = x;
    }

    public void setDimension(int d1){
        d = d1;
    }

    public void set(int length, int breadth) {
        l = length;
        b = breadth;
    }

    public int getLength() {
        return l;
    }

    public int getBreadth() {
        return b;
    }


}

class Square extends Shape {

    public int area() {
        return getLength()* getLength();
    }

}

class Rectangle extends Shape {

    public int area() {
        return 3 * getLength()* getBreadth();
    }
}



/*
Create a class of Shape which can help to instantiate objects.
The objects will be square, rectangle, circle, cube, sphere
each object will need to have color and dimensions
you need to be able to evaluate area for 2 dimension objects
you need to be able to evaluate volume for 3 dimensional objects
Use testng to test the same
 */

class Main {

public static void main (String args[]){
        Square s = new Square();
        s.set(10,20);
        s.setColor("BLUE");
        s.setDimension(2);
        System.out.println(s.area());
        System.out.println(s.color);


        }
}

/**
 *
 * class Square {
 *     static int a;
 *
 *     Square(int a1) {
 *         a = a1;
 *     }
 *     public static int area() {
 *         return a * a;
 *     }
 * }
 *
 * class Rectangle {
 *     static int a;
 *     static int b;
 *
 *     Rectangle(int a1, int b1) {
 *         a = a1;
 *         b = b1;
 *     }
 *     public static int area() {
 *         return a * b;
 *     }
 * }
 *
 * class Square {
 *     static int a;
 *
 *     Square(int a1) {
 *         a = a1;
 *     }
 *     public static int area() {
 *         return a * a;
 *     }
 * }
 */