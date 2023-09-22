import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends FormStage
{
    int gravity = 5;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }
    
    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
    {
        Player snake = new Player();
        this.addObject(snake, -50, 200);
        this.gravity = 5 ;
        Player snake2 = new Player();
        this.addObject(snake2, 250,200);
    }
    
    public void act(){
        List<Character>allChars =this.getObjects(Character.class);
        for(Character chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}
