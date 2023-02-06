package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {
    private double x;
    private double y;
    private double width;
    public Tree(double x, double y, double width){
        this.x = x;
        this.y = y;
        this.width = width;
    }
    public void draw(DrawTool drawTool){
        //Baumstamm
        drawTool.setCurrentColor(new Color(84, 53, 9));
        drawTool.drawFilledRectangle(x,y,width,width*2);
        //Baumblätter
        drawTool.setCurrentColor(new Color(21, 86, 16));
        drawTool.drawFilledTriangle(x-2*width,y,x+0.5*width,y-1.5*width,x+3*width,y);
        drawTool.drawFilledTriangle(x-1.5*width,y-width,x+0.5*width,y-2.5*width,x+2.5*width,y-width);
        drawTool.drawFilledTriangle(x-1*width,y-2*width,x+0.5*width,y-3.5*width,x+2*width,y-2*width);
        drawTool.drawFilledTriangle(x-0.5*width,y-3*width,x+0.5*width,y-4.5*width,x+1.5*width,y-3*width);
        //Deko
        drawTool.setCurrentColor(new Color(255, 255, 0));
        drawTool.drawFilledPolygon(x+0.5*width,y-5.75*width,x+0.75*width,y-5.25*width,x+1.25*width,y-5.25*width,x+0.8*width,y-4.9*width,x+width,y-4.5*width,x+0.5*width,y-4.75*width,x,y-4.5*width,x+0.2*width,y-4.9*width,x-0.25*width,y-5.25*width,x+0.25*width,y-5.25*width);
    }

}
