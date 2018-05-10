void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    background(#FFFFFF);
    noStroke();
    fill(#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#0BA01B);
    rect(176, 103, 12, 32);
    fill(#FFFFFF);
    if(mousePressed) {
      ellipse(75,200,30,30);
    }

}