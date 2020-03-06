package train;

import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;

public class Engine extends TrainCar {
    private Color color;

    public Engine(Color color){
        super(color);
        this.color = color;
        drawCarFrame(0, getCarHeight(), color);
        drawSmokestack(0, getCarHeight());
        drawEngineCab(0, getCarHeight());
        drawCowcatcher(0, getCarHeight());

    }

    /* Draws the smokestack */
    private void drawSmokestack(double x, double y) {
        // You fill this in //
        double xLeft = x + SMOKESTACK_INSET + CONNECTOR;
        double yTop = y-CAR_BASELINE-CAR_HEIGHT-SMOKESTACK_HEIGHT;
        comp127graphics.Rectangle smokestack = new comp127graphics.Rectangle(xLeft, yTop , SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
        smokestack.setFillColor(Color.BLACK);
        smokestack.setFilled(true);
        this.add(smokestack);

    }

    /* Draws the engine cab */
    private void drawEngineCab(double x, double y) {

        double xLeft = x + CONNECTOR+CAR_WIDTH-CAB_WIDTH;
        double yTop = y-CAR_BASELINE-CAR_HEIGHT-CAB_HEIGHT;
        comp127graphics.Rectangle cab = new Rectangle(xLeft, yTop , CAB_WIDTH, CAB_HEIGHT);
        cab.setFillColor(Color.BLACK);
        cab.setFilled(true);
        this.add(cab);
    }

    /* Draws the cowcatcher in the front of the engine */
    private void drawCowcatcher(double x, double y) {
        // You fill this in //
        double x1 = x;
        double x2 = x+CONNECTOR/2;
        double x3 = x+CONNECTOR;
        double y1 = y-CAR_BASELINE;
        double y2 = y-CAR_BASELINE-CAR_HEIGHT/2;

        Line l1 = new Line(x1,y1,x3,y2);
        Line l2 = new Line(x2,y1,x3,y2);
        this.add(l1);
        this.add(l2);
    }
}
