package labd2;

public class Point<X,Y> {
    private X l;
    private Y r;
    public Point(X l, Y r){
        this.l = l;
        this.r = r;
    }
    public X getX(){ return l; }
    public Y getY(){ return r; }
    public void setX(X l){ this.l = l; }
    public void setY(Y r){ this.r = r; }
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
}