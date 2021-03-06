package Code;

import java.awt.*;

import static Code.Main.container;
import static Code.Utils.Utils.*;

public class Ball {
    int x;
    int y;
    int xVel;
    int yVel;
    int width;
    int height;
    int mass;// mass of the ball, proportional to its dimensions
    Color color;

    public Ball(int xVel,int yVel){
        mass=randMass();
        width=mass;
        height=mass;
        this.xVel=xVel;
        this.yVel=yVel;
        x=randCoordinateX(mass);
        y=randCoordinateY(mass);
        color=randColor();

    }

    public void move(){
        x=x-xVel;
        y=y-yVel;
        checkBoundaries();
    }

    //check for the position of the ball, not to cross the boundaries of the frame
    private void checkBoundaries() {
        if((this.x>container.getWidth()-this.width)||(this.x<1)){
            this.xVel=-this.xVel;
        }
        if((this.y>container.getHeight()-this.height-40)||(this.y<1)){
            this.yVel=-this.yVel;
        }
    }

    public Color randColor(){
        int i=(int) (7*Math.random());
        switch (i){
            case 0: return Color.green;
            case 1: return Color.blue;
            case 2: return Color.red;
            case 3: return Color.CYAN;
            case 4: return Color.yellow;
            case 5: return Color.MAGENTA;
            case 6: return Color.ORANGE;
            default:return Color.black;
        }

    }
}
