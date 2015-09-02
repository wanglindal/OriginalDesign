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
float ballX=60;
float ballY=340;
float rectX=25;
float rectY=335;
float stopX=225; //stops movement at x
PImage background;

public void setup()
{
size(600,400);
background = loadImage("http://i52.tinypic.com/mn2ra0.png");

}
public void draw()
{
 image(background,0,0,600,400);
 if(ballX>=stopX)
  {
  jigglypuff(); 
  }

  bottomPokeball();
   topPokeball();
  middlePokeball(); //open ball
  
  while(rotateBall <= (1.65f*PI) ) //changing rotation
 {
   rotateBall = 6.27686f; //1.65*PI ; // PI must rotate near 2
 }
 if (ballX>stopX)
 {
 	ballX=stopX;
 	ballY=257;
 	rectX=190;
 	rectY=252;
 }

  
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

//right foot
beginShape();
curveVertex(393,284);
curveVertex(393,284);
curveVertex(381,292);
curveVertex(369,307);
curveVertex(386,309);
curveVertex(403,306);
curveVertex(417,294);
curveVertex(417,294);
endShape();
//left foot
beginShape();
curveVertex(485,287);
curveVertex(485,287);
curveVertex(494,292);
curveVertex(509,307);
curveVertex(487,309);
curveVertex(475,306);
curveVertex(459,296);
curveVertex(459,296);
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

//inner left ear
fill(15,4,33);
beginShape();
curveVertex(373,174);
curveVertex(373,174);
curveVertex(367,139);
curveVertex(397,153);
curveVertex(397,153);
endShape();
//inner right ear
beginShape();
curveVertex(507,173); //starting from right side
curveVertex(507,173);
curveVertex(515,127);
curveVertex(485,147);
curveVertex(485,147);
endShape();
//end of ears

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

//jiggly hair
fill(255,228,225); //same color as body
arc(436,155,56,56,PI, 2*PI);
beginShape();
curveVertex(408,153); //left part of twirl
curveVertex(408,153);
curveVertex(405,169);
curveVertex(413,191);
curveVertex(424,201);
curveVertex(438,202);
curveVertex(438,202);
endShape();

beginShape();//right part of twirl
curveVertex(438,202);
curveVertex(438,202);
curveVertex(448,198);
curveVertex(452,185);
curveVertex(440,176);
curveVertex(437,189);
curveVertex(480,180);
endShape();


beginShape(); //top right twirl
curveVertex(440,176);
curveVertex(440,176);
curveVertex(448,174);
curveVertex(458,166);
curveVertex(462,161);
curveVertex(463,158);
curveVertex(463,158);
endShape();

//end jiggly hair


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
arc(ballX,ballY,70,70,0,PI); //bottom


}
public void topPokeball()
{
  fill(255,0,0);
  
  translate(ballX,ballY);
  rotate(rotateBall);
arc(0,0,70,70,PI,TWO_PI); //top x=60, y=340
  rotateBall= rotateBall +  (1.999f*PI );

  ballX++;
  ballY=ballY-0.5f; //keeps rotating
  frameRate(300);
   translate(-ballX,-ballY); //stops translation

  //frameRate(-50);
  

}
public void middlePokeball()
{
  fill(0);
rect(rectX,rectY,71,10);
rectX++; //to move with ball
rectY=rectY-.5f;//middle x=25 y=335
ellipse(ballX,ballY,25,25);
fill(255);
stroke(10);
ellipse(ballX,ballY,17,17);
ellipse(ballX,ballY,11,11);

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
