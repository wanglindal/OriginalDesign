void setup()
{
size(600,400);
background(125);
}
void draw()
{
  Pokeball();
  openPokeball();
}
void Pokeball()
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
void openPokeball()
{
	noStroke();
	fill(255);
	arc(200,200,70,70,0,PI);
	fill(255,0,0);
	arc(200,200,70,70,PI, )

}

