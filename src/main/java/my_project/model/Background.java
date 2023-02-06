package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {
        private int b;
        private double timer;

        public Background(int b){
            this.b = b;
        }

        public void draw(DrawTool drawTool){

            drawTool.setCurrentColor(new Color(111, 120, b));
            drawTool.drawFilledRectangle(0,0,600,400);
            drawTool.setCurrentColor(new Color(255, 255, 255));
            drawTool.drawFilledRectangle(0,400,600,200);
        }
        public void update(double dt){
            timer = timer + dt;
            if(timer > 17 && b < 255){
                b = b + 1;
            }
        }
}
