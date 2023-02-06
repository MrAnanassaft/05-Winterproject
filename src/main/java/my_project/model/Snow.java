package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.model.Cloud;
import java.awt.*;

public class Snow extends GraphicalObject {
    private double timer;
    private double x;
    private double y;
    private double radius;
    private double speed;

    public Snow(double x, double y, double rad){
        this.x = x;
        this.y = y;
        this.radius = rad;
        this.speed = 20*radius;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x,y,radius);

    }
    public void update(double dt){
        timer = timer+dt;
        if(timer > 7){
            y += dt* speed;
        }
        if(y>605){
            y=-5;
        }
        if(timer > 17){
            x = x+8*(y*0.1)*dt;
        }
    }
}


