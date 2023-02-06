package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Wind extends GraphicalObject {
    private double x;
    private double y;
    private double timer;
    public Wind(double x, double y){
        this.x = x;
        this.y = y;
        setNewImage("src/main/resources/graphic/Wind.png");
    }
    public void draw(DrawTool drawTool){
        drawTool.drawImage(getMyImage(),x,y);
    }
    public void update(double dt){
        timer = timer + dt;
        if(timer > 12){
            this.x = this.x + 100*dt;
        }
    }
}
