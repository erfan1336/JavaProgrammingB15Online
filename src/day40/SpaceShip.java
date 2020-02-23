package day40;


//create a class called SpaceShip
// it has 3 attributes:
// name as String
// xCoordinate as int
// yCoordinate as int

// few behaviours:
// setInitialPosition void method: accept 2 int parameters to provide initial position of SpaceShip
// setDirection : accept 1 String parameter to set the direction
// move1Block, accept no parameter, and change the position according to the position
// toString method : return String representation of SpaceShip Object

public class SpaceShip {

    String name;
    int xCoordinates;
    int yCoordinates;
    String currentDirection;
    int x;
    int y;

    public void setInitialPosition(int newX, int newY){
        x = newX;
        y = newY;
    }

    public void setDirection(String newDirection){

        if (    newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("let")){
            currentDirection = newDirection;
        }else {
            System.out.println("Invalid Input");
        }
    }

    public void move1Block(){

        switch (currentDirection){
            case "right":
                x += 1;
                break;
            case "left":
                x -= 1;
                break;
            case "up":
                y += 1;
                break;
            case "down":
                y -= 1;
                break;
            default:
                break;
        }

    }

    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", xCoordinates=" + xCoordinates +
                ", yCoordinates=" + yCoordinates +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
