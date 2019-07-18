package base;

/**
 * 一元二次方程求解
 */
public class equation {
    private double a;
    private double b;
    private double c;

    /**
     * 该方法用于一元二次方程求解
     * ax2+bx+c
     * @return
     */
    public String solution(){
               double m = (b*b) - (4*a*c);
                if(m<0){
                    return "x1 = -1";
                }
                if (m==0){
                   return  "x1="+(-b/2*a);
                }
                return "x1="+(-b+m)/(2*a)+"   x2="+(-b-m)/(2*a);
    }


    public equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }




}
