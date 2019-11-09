PImage face;
void setup() {
face = loadImage("op.jpg");
 size(800,600);
    face.resize(800,600);
    
}

void draw() {
  background(face);
  fill(#E6E5E8);
  ellipse(300, 140, 55, 55);
 fill(#050505);
 ellipse(mouseX,mouseY, 22, 22);
 
 fill(#E6E5E8);
 ellipse(360, 140, 55, 55);
  fill(#050505);
  ellipse(mouseX,mouseY, 22, 22);
 
    
  
}
