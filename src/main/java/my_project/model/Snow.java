package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.model.Cloud;
import java.awt.*;

public class Snow extends GraphicalObject {

    public double x;
    public double y;
    private double radius;

    public Snow(double x, double y, double rad){
        this.x = x;
        this.y = y;
        this.radius = rad;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(238, 0, 0));
        drawTool.drawFilledCircle(x,y,radius);

    }
    public void update(double dt){
        //if(boolean.go == true){
            y += dt* 100;
        //}

    }
}


