package my_project.model;

import KAGO_framework.control.Drawable;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
import java.util.ArrayList;

public class Cloud extends GraphicalObject {
    private double stop;
    public static ArrayList allSnow = new ArrayList<Drawable>();
    public Cloud(double x, double y, double rad, double stop){
        this.x = x;
        this.y = y;
        this.radius = rad;
        this.stop = stop;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawCircle(x,y,radius);
        drawTool.drawCircle(x+radius,y-radius/2,radius);
        drawTool.drawCircle(x+radius*2,y,radius);

        drawTool.setCurrentColor(new Color(49, 51, 53));
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.drawFilledCircle(x+radius,y-radius/2,radius);
        drawTool.drawFilledCircle(x+radius*2,y,radius);
    }

    public void update(double dt){
        if(this.x < this.stop+600){
            x = x+10*dt;
        }

        allSnow.add(new Snow(x,y));

    }

}
