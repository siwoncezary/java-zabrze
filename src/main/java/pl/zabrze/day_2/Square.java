package pl.zabrze.day_2;

public class Square {
    double side;

    Square(double squareSide){
        side = squareSide;
    }

    Square(){
        side = 1;
    }

    double area(){
        return side * side;
    }

    double perimeter(){
        return 4 * side;
    }

    double price(double unitPrice){
        return area() * unitPrice;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
