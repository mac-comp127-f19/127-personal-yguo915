package train;

import comp127graphics.*;
import comp127graphics.Rectangle;

import java.awt.*;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {

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

    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;
    private TrainCar traincar;
    private Engine engine;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);
        this.traincar = new TrainCar(Color.GREEN);
        this.engine = new Engine(Color.BLACK);
        double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight();
        double dx = CAR_WIDTH + CONNECTOR;
        canvas.add(engine);
        drawBoxcar(x + dx, y, Color.GREEN);
        drawCaboose(x + 2 * dx, y);

    }



    /* Draws a boxcar in the specified color */
    private void drawBoxcar(double x, double y, Color color) {
        traincar.drawCarFrame(x, y, color);
        double xRight = x + CONNECTOR + CAR_WIDTH / 2;
        double xLeft = xRight - DOOR_WIDTH;
        double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
        canvas.add(new Rectangle(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
        canvas.add(new Rectangle(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }

    /* Draws a red caboose */
    private void drawCaboose(double x, double y) {
        traincar.drawCarFrame(x,y, Color.RED);
        drawCupola(x,y);
    }

    private void drawCupola(double x, double y) {
        double xLeft = x + CONNECTOR+CAR_WIDTH/2-CUPOLA_WIDTH/2;
        double yTop = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
        Rectangle cupola = new Rectangle(xLeft, yTop, CUPOLA_WIDTH, CUPOLA_HEIGHT);
        cupola.setFillColor(Color.RED);
        cupola.setFilled(true);
        canvas.add(cupola);
    }



}