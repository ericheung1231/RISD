import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class RISD extends PApplet {

public void setup()
{
    size(1600,2000);
    background(255);
}

public void draw()
{
    ellipse(500, 500, 500, 500);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "RISD" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
