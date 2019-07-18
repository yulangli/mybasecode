package base;

/**
 * 定义一个坐标类
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    /*
        此方法返回两点之间的距离
     */
    public double distance(Point c){
        return Math.sqrt((x-c.x)*(x-c.x)+(y-c.y)*(y-c.y));
    }
}
