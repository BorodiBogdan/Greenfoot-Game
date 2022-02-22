import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends World
{
    int started = 0;
    public static GreenfootSound sound = new GreenfootSound("background_monkey.wav");
    //muzica de background
    
    public Start()
    {    
        super(1100, 600, 1); 
        prepare();
        ShipPlayer mainPlayer = new ShipPlayer();
        addObject(mainPlayer, getWidth() / 2, getHeight() / 2);
        addObject(new DivideSubtractionDivision (), 100, 200);
        started = 1;
        sound.playLoop();
        sound.setVolume(20);
    }

    public void act() {
      
    }

    private void prepare()
    {
        PlusSubtractionDivision plus = new PlusSubtractionDivision ();  
        addObject(plus,889,141);

    }

}