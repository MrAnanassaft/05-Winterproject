package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.*;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class  ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        //Ball ball1 = new Ball(150,150);
        //viewController.draw(ball1);

        Background b1 = new Background(150);
        viewController.draw(b1);

        Cloud c1 = new Cloud(-600,0,40,-600);
        if(c1.getStop()){
            for(int i = 0; i< 500; i++){
                Snow s1 = new Snow(Math.random()*600, Math.random()*(-600)-5,Math.random()*2+3);
                viewController.draw(s1);
            }
        }
        viewController.draw(c1);
        Tree t1 = new Tree(400,460,25);
        viewController.draw(t1);


        Person p1 = new Person(200,400,20,40);
        viewController.draw(p1);

        Wind w1 = new Wind(-500, 100);
        viewController.draw(w1);
        Wind w2 = new Wind(-300, 100);
        viewController.draw(w2);
        Wind w3 = new Wind(-100, 100);
        viewController.draw(w3);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
