var angle = 0;
var lenVariation = .8;

function setup(){
    createCanvas(800,600);
}

function draw(){
    background(40);
    angle = PI / 4;
    stroke(0,255,33);
    translate(250, height);
    branch(100)
}

function branch(len){
    line(0,0,0,-len);
    translate(0,-len);

//lenVariation = random(0.5, 0.9);

    if(len > 1){
    push();
        rotate(angle);
        branch(len * lenVariation);
    pop();
    push();
        rotate(-angle);
        branch(len * lenVariation);
    pop();
    }
}