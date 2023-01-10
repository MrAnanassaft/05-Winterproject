package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {



        public Background(){

        }

        public void draw(DrawTool drawTool){
            drawTool.setCurrentColor(new Color(120, 120, 112, 255));
            drawTool.drawFilledRectangle(0,0,600,400);
            drawTool.setCurrentColor(new Color(71, 58, 22));
            drawTool.drawFilledRectangle(0,400,600,200);
        }

}
