PImage creeper;
void setup() {
  creeper=loadImage("creeper.png"); 
  size(600, 600);
  PImage minecraft = loadImage("minecraft.png");     
  minecraft.resize(600, 600);          
  background(minecraft);
  creeper.resize(8, 8);
}
void draw() {
  image(creeper, 89, 100);
  if (mousePressed) {


    if (isNear(mouseX, 89) && isNear(mouseY, 100)) {
      fill(0, 255, 0);
    } else {
      fill(255, 0, 0);
    }
    ellipse(mouseX, mouseY, 20, 20);
  }
}
boolean isNear(int a, int b) {
  if (abs(a - b) < 10)
    return true;
  else
    return false;
}
