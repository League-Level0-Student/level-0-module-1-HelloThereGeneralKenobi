import ddf.minim.*;
Minim minim;
AudioPlayer sound;
minim = new Minim(this);

void setup() {
  sound = minim.loadFile("Beep.mp3");
size(800,600);
fill(#815C0C);
ellipse(400,300,400,400);
fill(#E81C20);
ellipse(400,300,380,380);
}
void draw() {
  if(mousePressed) {
PImage nut = loadImage("nut.gif");
nut.resize(20,20);
image(nut, 380, 310);
sound.play();
image(nut, 300, 380);
sound.play();
image(nut, 290, 230);
sound.play();
image(nut, 460, 170);
sound.play();
image(nut, 430, 440);
sound.play();
PImage sink = loadImage("sink.gif");
sink.resize(20,20);
image(sink, 510,360);
sound.play();
image(sink, 400,380);
sound.play();
image(sink, 380,190);
sound.play();
image(sink, 440,240);
sound.play();
image(sink, 330,440);
sound.play();
  }
}