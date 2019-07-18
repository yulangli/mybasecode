package base;

import java.math.BigDecimal;

/**
 * 用于求一个角度的正玄值
 */
public class Angle {
    private int  m_x;//定义角度变量
    double PI = 3.14159;//定义π

    public Angle(int x) {
        this.m_x = x;
    }

    public void f() {
        double x = m_x*PI/180;
        double s = Math.sin(x);
        BigDecimal b = new BigDecimal(s).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(b);
    }

    public Angle operator(Angle c) {
        Angle a = new Angle(this.m_x - c.m_x);
        return a;
    }

    public static void main(String[] args) {
        Angle A1 = new Angle(60);
        Angle A2 = new Angle(30);
        Angle A3 = A1.operator(A2);

        A3.f();
    }
}
