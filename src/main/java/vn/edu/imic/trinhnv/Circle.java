package vn.edu.imic.trinhnv;

public class Circle {
    double dRadius = 1.0;
    int id ;
    public Circle(){
        
    }
    
    public Circle( int id,double NewdRadius){
        dRadius = NewdRadius;
        this.id = id;
    }
    
    public double Area(){
        return dRadius * dRadius * Math.PI;
    }

    public double getdRadius() {
        return dRadius;
    }

    public void setdRadius(double dRadius) {
        this.dRadius = dRadius;
    }

    public int getId() {
        return id ;
    }
    
}

class objectCircle{
    public static void main(String[] args) {
        System.out.println("------------First-------------");
        Circle objC01 =  new Circle(1,30.5);
        print(objC01);
        Circle objC02 =  new Circle(2,40.0);
        print(objC02);
        Circle objC03 =  new Circle(3,120.5);
        print(objC03);
        Circle objC04 =  new Circle(4,88.5);
        print(objC04); 
        
        System.out.println("-------------Second------------");
        objC02.setdRadius(25.5);
        print(objC02);
        objC03.setdRadius(60.0);
        print(objC04);
    }

    public static void print(Circle ring){
        System.out.println("objC0" +ring.getId() +":Ban kinh = " + ring.getdRadius() 
        + " Dien tich = " + ring.Area());
    }
}
