class Rhombus extends Shape{

    public Rhombus(double a,double b){
        super(a,b);
    }

    @Override
    public double calcArea() {
        return getA()*getB()/2;
    }
}
