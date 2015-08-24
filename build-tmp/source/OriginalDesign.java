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

public class OriginalDesign extends PApplet {

public void setup()
{
size(600,400);
background(125);
}
public void draw()
{
  Pokeball();
  openPokeball();
}
public void Pokeball()
{
	noStroke();
fill(255);
arc(60,340,70,70,0,PI);
fill(255,0,0);
arc(60,340,70,70,PI,TWO_PI);
fill(0);
rect(25,335,70,10);
ellipse(60,340,25,25);
fill(255);
stroke(10);
ellipse(60,340,17,17);
ellipse(60,340,11,11);
}
public void openPokeball()
{
	noStroke();
	fill(255);
	arc(200,200,70,70,0,PI);
	

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
