package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Person extends GraphicalObject {
    private double x;
    private double y;
    private double rx;
    private double ry;

    public Person(double x, double y, double rx, double ry) {
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
    }

    public void draw(DrawTool drawTool){




        drawTool.setCurrentColor(new Color(206, 159, 100));
        //Körper
        drawTool.drawFilledEllipse(x,y,rx,ry);
        //Kopf
        drawTool.drawFilledCircle(x,y-ry-rx,rx);
        //Hut
        drawTool.setCurrentColor(new Color(77, 50, 5));
        drawTool.drawFilledArc(x-1.1*rx,y-ry-2.4*rx,rx*2.2,0.0,180.0,1);
        drawTool.setCurrentColor(new Color(206, 159, 100));
        drawTool.drawFilledEllipse(x,y-ry-1.2*rx,rx,rx/2);
        //Hände
        drawTool.drawFilledEllipse(x+1.6*rx,y+1.1*rx,rx/3,rx/4);
        drawTool.drawFilledEllipse(x-1.6*rx,y+1.1*rx,rx/3,rx/4);
        drawTool.setCurrentColor(new Color(96, 91, 91));
        drawTool.drawFilledPolygon(x+0.8*rx,y-1.2*rx,x+1.8*rx,y+1*rx,x+1.3*rx,y+1*rx,x+0.9*rx,y+0.1*rx);
        drawTool.drawFilledPolygon(x-0.8*rx,y-1.2*rx,x-1.8*rx,y+1*rx,x-1.3*rx,y+1*rx,x-0.9*rx,y+0.1*rx);
        //Körper/Jacke
        drawTool.drawFilledEllipse(x,y,rx,ry);
        drawTool.setCurrentColor(new Color(255,255,255));
        drawTool.drawFilledPolygon(x-0.1*rx,y-1.5*rx,x+0.1*rx,y-1.5*rx,x+0.3*rx,y+1.3*rx,x-0.3*rx,y+1.3*rx);
        drawTool.setCurrentColor(new Color(255,0,0));
        drawTool.drawFilledRectangle(x-0.1*rx,y-1.5*rx,0.2*rx,2.8*rx);
        //Beine
        drawTool.setCurrentColor(new Color(84, 46, 11));
        drawTool.drawFilledPolygon(x+0.6*rx,y+1.6*rx,x+1.2*rx,y+4*rx,x+0.8*rx,y+4*rx,x+0.2*rx,y+1.6*rx);
        drawTool.drawFilledPolygon(x-0.6*rx,y+1.6*rx,x-1.2*rx,y+4*rx,x-0.8*rx,y+4*rx,x-0.2*rx,y+1.6*rx);
        //Hose
        drawTool.drawFilledArc(x-0.85*rx,y+0.3*rx,1.7*rx,180,180,1);

        //Schuhe
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawFilledEllipse(x+1.2*rx,y+4*rx,rx/2,rx/4);
        drawTool.drawFilledEllipse(x-1.2*rx,y+4*rx,rx/2,rx/4);
        //Eyes
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledEllipse(x-0.5*rx,y-ry-rx,0.3*rx,0.2*rx);
        drawTool.drawFilledEllipse(x+0.5*rx,y-ry-rx,0.3*rx,0.2*rx);
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawFilledCircle(x-0.5*rx,y-ry-rx,2);
        drawTool.drawFilledCircle(x+0.5*rx,y-ry-rx,2);
        //Mouth
        drawTool.drawFilledCircle(x,y-ry-0.5*rx,5);
        drawTool.setCurrentColor(new Color(206, 159, 100));
        drawTool.drawFilledCircle(x,y-ry-0.7*rx,5);
    }
}
