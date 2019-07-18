package base;

/**
 * 该类用于模拟3个点对应的三条线
 * fun()方法用于求三条线之和
 * display()方法用于判断三条线能否组成三角形
 */
public class ctriangle {
    private Point A, B,C;
    private double AB,BC,AC;

    public ctriangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
        AB = A.distance(b);
        BC = B.distance(c);
        AC = A.distance(c);
    }
    /*
        此方法判断坐标中3条直线能不能组成三角形
     */
    public boolean display(){
        double a = AB,b = BC,c = AC,t;
        if(a>c){
            t=a;
            a=c;
            c=t;
        }
        if(b>c)
        {
            t=b;
            b=c;
            c=t;
        }
        if((b*b+a*a-c*c)<10e-6){
            return true;
        }
        else {
            return false;
        }


    }
    public double fun(){
        return AB+BC+AC;
    }
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(0, 4);
        ctriangle D = new ctriangle(A, B, C);
        boolean a = D.display();
        double b = D.fun();
        System.out.println(a);
        System.out.println(b);
    }
}
