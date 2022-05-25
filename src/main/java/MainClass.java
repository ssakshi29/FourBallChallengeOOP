import processing.core.PApplet;


public class MainClass extends PApplet{

    public static final float DIAMETER =20;
    public static  float HEIGHT =480;
    public static  float WIDTH =680;

    BALL4 first=new BALL4(this,0,HEIGHT/5,DIAMETER,1);
    BALL4 second=new BALL4(this,0,2*HEIGHT/5,DIAMETER,2);
    BALL4 third=new BALL4(this,0,3*HEIGHT/5,DIAMETER,3);
    BALL4 fourth=new BALL4(this,0,4*HEIGHT/5,DIAMETER,4);

    public static void main(String[] args) {
        PApplet.main("MainClass", args);
    }



    @Override
    public void settings() {
        super.settings();
        size(680,480);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        first.drawCircle();
        second.drawCircle();
        third.drawCircle();
        fourth.drawCircle();
    }
}
