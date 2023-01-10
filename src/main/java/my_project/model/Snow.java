package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snow extends GraphicalObject {

    public Snow(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(238, 0, 0));
        drawTool.drawFilledCircle(25,30,5);

    }
    public void update(double dt){
        x += dt* 100;
    }
}


