import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }


    float flowerX = 150;
    float flowerY = 150;
    float petalSize = 100;
    float petalDistance = petalSize / 2;

    
    float flowera = 00;
    float flowerb = 200;
    float petalSizec = 100;
    float petalDistanced = petalSize / 2;

        
    float flowerf = 020;
    float flowerr = 120;
    float petalSizes = 50;
    float petalDistancea = petalSize / 2;
  public void draw() {
	  
	// sample code, delete this stuff


    fill(255, 0, 0);
    ellipse(flowerX, flowerY,  petalSize, petalSize);

      fill(255, 0, 0);
   rect(flowera, flowerb,  petalSizec, petalSizec);

        fill(255, 0, 0);
   rect(flowerf, flowerr,  petalSizes, petalSizes);

  int m = minute();  // Values from 0 - 59
  int h = hour();    // Values from 0 - 23
  int hour = h - 5;

text(hour, 20, 200);
text (m, 50, 200);
  
}

}