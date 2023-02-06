package my_project.model;

import KAGO_framework.control.Drawable;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import KAGO_framework.control.ViewController;

import java.awt.*;
import java.util.ArrayList;

public class Cloud extends GraphicalObject {

    private double stop;
    private boolean go;
    private double x;
    private double y;
    private double timer;

    private ViewController viewController;

    public static ArrayList allSnow = new ArrayList<Drawable>();
    public Cloud(double x, double y, double rad, double stop){
        this.x = x;
        this.y = y;
        this.radius = rad;
        this.stop = stop;
    }

    public void draw(DrawTool drawTool){
        //drawTool.setCurrentColor(new Color(0, 0, 0));
        //drawTool.drawCircle(x,y,radius);
        //drawTool.drawCircle(x+radius,y-radius/2,radius);
        //drawTool.drawCircle(x+radius*2,y,radius);

        drawTool.setCurrentColor(new Color(49, 51, 53));
        drawTool.drawFilledRectangle(x,y,600,50);
        drawTool.drawFilledCircle(x,y+50,radius);
        drawTool.drawFilledCircle(x+1*radius,y+50,radius);
        drawTool.drawFilledCircle(x+2*radius,y-0.2*radius+50,radius+3);
        drawTool.drawFilledCircle(x+3*radius,y+0.4*radius+50,radius+2);
        drawTool.drawFilledCircle(x+4*radius,y-0.3*radius+50,radius-4);
        drawTool.drawFilledCircle(x+5*radius,y+0.1*radius+50,radius+2);
        drawTool.drawFilledCircle(x+6*radius,y-0.2*radius+50,radius-3);
        drawTool.drawFilledCircle(x+7*radius,y-0.4*radius+50,radius+1);
        drawTool.drawFilledCircle(x+8*radius,y+0.3*radius+50,radius+3);
        drawTool.drawFilledCircle(x+9*radius,y+0.2*radius+50,radius-4);
        drawTool.drawFilledCircle(x+10*radius,y-0.3*radius+50,radius+2);
        drawTool.drawFilledCircle(x+11*radius,y-0.1*radius+50,radius-1);
        drawTool.drawFilledCircle(x+12*radius,y-0.2*radius+50,radius+3);
        drawTool.drawFilledCircle(x+13*radius,y+0.3*radius+50,radius-2);
        drawTool.drawFilledCircle(x+14*radius,y-0.4*radius+50,radius+1);
        drawTool.drawFilledCircle(x+15*radius,y+0.4*radius+50,radius-1);

        drawTool.drawFilledCircle(x+600,y+25,50);


    }

    public void update(double dt){
        timer = timer + dt;
        if(timer < 17){
            if(this.x < this.stop+600){
                x = x+100*dt;
            }else{
                getStop();
            }
        }else{
            x = x + 100*dt;
        }

    }
    public boolean getStop(){
        return true;
    }

}
