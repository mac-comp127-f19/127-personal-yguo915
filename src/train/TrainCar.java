package train;

import comp127graphics.*;
import comp127graphics.Rectangle;

import java.awt.*;

public class TrainCar extends GraphicsGroup {

    public static final int SCALE = 1;

    /* Private constants */

    /* Dimensions of the frame of a train car */
    public static final double CAR_WIDTH = 75*SCALE;
    public static final double CAR_HEIGHT = 36*SCALE;

    /* Distance from the bottom of a train car to the track below it */
    public static final double CAR_BASELINE = 10*SCALE;

    /* Width of the connector, which overlaps between successive cars */
    public static final double CONNECTOR = 6*SCALE;

    /* Radius of the wheels on each car */
    public static final double WHEEL_RADIUS = 8*SCALE;

    /* Distance from the edge of the frame to the center of the wheel */
    public static final double WHEEL_INSET = 16*SCALE;

    /* Dimensions of the cab on the engine */
    public static final double CAB_WIDTH = 35*SCALE;
    public static final double CAB_HEIGHT = 8*SCALE;

    /* Dimensions of the smokestack and its distance from the front */
    public static final double SMOKESTACK_WIDTH = 8*SCALE;
    public static final double SMOKESTACK_HEIGHT = 8*SCALE;
    public static final double SMOKESTACK_INSET = 8*SCALE;

    /* Dimensions of the door panels on the boxcar */
    public static final double DOOR_WIDTH = 18*SCALE;
    public static final double DOOR_HEIGHT = 32*SCALE;

    /* Dimensions of the cupola (the rectangular piece on the top of the caboose) */
    public static final double CUPOLA_WIDTH = 35*SCALE;
    public static final double CUPOLA_HEIGHT = 8*SCALE;



    public TrainCar(Color color){
        super();
        drawCarFrame(0, getCarHeight(),color);
    }


    /* Draws the common part of a train car */
    public void drawCarFrame(double x, double y, Color color) {
        double x0 = x + CONNECTOR;
        double y0 = y - CAR_BASELINE;
        double top = y0 - CAR_HEIGHT;
        this.add(new Line(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
        drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
        drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
        comp127graphics.Rectangle r = new Rectangle(x0, top, CAR_WIDTH, CAR_HEIGHT);
        r.setFilled(true);
        r.setFillColor(color);
        this.add(r);
    }

    /* Draws a wheel centered at (x, y) */
    public void drawWheel(double x, double y) {
        double r = WHEEL_RADIUS;
        Ellipse wheel = new Ellipse(x - r, y - r, 2 * r, 2 * r);
        wheel.setFilled(true);
        wheel.setFillColor(Color.GRAY);
        this.add(wheel);
    }

    public double getCarHeight(){
        return CAR_HEIGHT+CAR_BASELINE;
    }

}
