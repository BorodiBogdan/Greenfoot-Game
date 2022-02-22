import greenfoot.*;  

public class ShipPlayer extends StartActorsSubtractionDivision 
{

    public void act()
    {
        moveAround();
        enterMazeGame();
    }
    public void enterMazeGame() {
        if (isTouching(PlusSubtractionDivision .class)) {
            Greenfoot.setWorld(new ChooseCarSubtractionDivision());
        }
        if (isTouching(DivideSubtractionDivision .class)) {
            Greenfoot.setWorld(new ChooseAnimalSubtractionDivision());
        }
    }
    public void moveAround() {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(4);
        }
        
    }
}