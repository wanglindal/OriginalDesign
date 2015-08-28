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

float rotateBall= 0;
float PokeX=60;
float PokeY=340;
float rectX=25;
float rectY=335;

public void setup()
{
size(600,400);

}
public void draw()
{
 background(125);
 jigglypuff();
  bottomPokeball();
   topPokeball();
  middlePokeball(); //open ball
  
  
}
public void jigglypuff()
{
fill(255,228,225);
ellipse(440,220,160,160); //body


//right arm

beginShape();

curveVertex(361,226);

curveVertex(361,226);

curveVertex(327,223);

curveVertex(337,237);

curveVertex(372,253);

curveVertex(372,253);

endShape();



//left arm

beginShape();

curveVertex(520,226);

curveVertex(520,226);

curveVertex(554,223);

curveVertex(544,237);

curveVertex(508,253);

curveVertex(508,253);

endShape();

beginShape(); //right ear
curveVertex(337,  153);
curveVertex(409,  146);
curveVertex(354,  120);

curveVertex(366, 189);
curveVertex(417, 184);
endShape();

beginShape(); //left ear
curveVertex(500,  120);
curveVertex(516, 191);
curveVertex(527,  119);
curveVertex(498,  120);
curveVertex(469, 144);
curveVertex(480, 143);
endShape();

fill(255);
ellipse(403,210,45,45); //biggest eye right
ellipse(479,210,45,45); //biggest left eye
fill(141,211,193);
ellipse(403,210,34,34); //second biggest right
ellipse (479,210,34,34); //2 biggest left
fill(74,170,145);
ellipse(403,206,29,25); // 3rd biggest left
ellipse(479,206,29,25); //3rd biggest right
fill(255);
ellipse(474,200,10,10); //smallest left
ellipse(401,198,10,10); //smallest right



//mouth
fill(226,129,129);
beginShape();
curveVertex(426,235); //left side
curveVertex(426,235);
curveVertex(432,246);
curveVertex(442,251);
curveVertex(452,244);
curveVertex(456,235);
curveVertex(456,235); //right side
endShape();



}

public void bottomPokeball()
{
  noStroke();
fill(255);
arc(PokeX,PokeY,70,70,0,PI); //bottom


}
public void topPokeball()
{
  fill(255,0,0);
  translate(PokeX,PokeY);
  rotate(rotateBall);
arc(0,0,70,70,PI,TWO_PI); //top x=60, y=340
frameRate(50);
  rotateBall= rotateBall +  (1.999f*PI );
  PokeX++;
  PokeY=PokeY-0.5f; //keeps rotating
  translate(-PokeX,-PokeY); //stops translation
  frameRate(-50);
  

}
public void middlePokeball()
{
  fill(0);
rect(rectX,rectY,71,10);
rectX++; //to move with ball
rectY=rectY-.5f;//middle x=25 y=335
ellipse(PokeX,PokeY,25,25);
fill(255);
stroke(10);
ellipse(PokeX,PokeY,17,17);
ellipse(PokeX,PokeY,11,11);
 rotate(-rotateBall); //cancel rotation

/*if(rotateBall < (1.65*PI) ) //changing rotation
 {
    rotateBall = 6.27686; //1.65*PI ; // PI must rotate near 2
 }*/

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
