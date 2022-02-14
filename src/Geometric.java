public class Geometric {

    public static void main(String[] args) {
        Geometric geoObj = new Geometric();
        System.out.println(geoObj.getName());
        Rectangle rectObj = new Rectangle();
        System.out.println(rectObj.getName());
        rectObj.p(20);
        rectObj.p(20.2222);
    }
    public void p(int num){
        System.out.println(num);
    }

    public String getName(){
        return "I am a Geometric object";
    }
}
class Rectangle extends Geometric {
    @Override
    public String getName(){
        return "I am a Rectangle object";
    }
    public void p(double num){
        System.out.println(num);
    }
}

