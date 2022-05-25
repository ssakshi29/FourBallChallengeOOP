import processing.core.PApplet;
public class BALL4 extends PApplet {


    PApplet parent;

    private float y;
    private float diameter;
    private float x;
    private float incrementinx;
   public BALL4(PApplet p,float x,float y ,float diameter,float incrementinx )
    {
        parent=p;
        this.x=x;
        this.y=y;
        this.diameter=diameter;
        this.incrementinx=incrementinx;
    }


    public void drawCircle() {
        parent.ellipse(x,y,diameter,diameter);
        x+=incrementinx;
    }
}

















