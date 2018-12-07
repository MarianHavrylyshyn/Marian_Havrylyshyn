public class Rectangle extends Figure implements IRectangle,   ITest{
    @Override
    public void printName() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    private float a = 10;

    private float b = 20;
    public float area (){
        return a*b;

    }

}

