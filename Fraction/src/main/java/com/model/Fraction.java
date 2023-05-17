package com.model;

public class Fraction implements Comparable<Fraction> {

    private int a;
    private int b;
    public Fraction() {
        this.a = 0;
        this.b = 1;
    }

    public Fraction(Fraction x) {
        this.a = x.a;
        this.b = x.b;
    }

    public Fraction(int a) {
        this.a = a;
        this.b = 1;
    }

    public Fraction(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("b cannot be 0");
        }
        this.a = a;
        this.b = b;
        this.reduce();
    }

    public Fraction(String s) {
        String[] s1 = s.split("[ /]");
        if (s1.length == 1) {
            this.a = Integer.parseInt(s1[0]);
            this.b = 1;
        } else {
            if (Integer.parseInt(s1[1]) == 0) {
                throw new ArithmeticException("b cannot be 0");
            }
            this.a = Integer.parseInt(s1[0]);
            this.b = Integer.parseInt(s1[1]);
            this.reduce();
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        this.reduce();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        this.reduce();
    }

    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int gcd = 1;
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private void reduce() {
        if (this.b < 0) {
            this.a *= -1;
            this.b *= -1;
        }
        int gcd = GCD(this.a, this.b);
        this.a /= gcd;
        this.b /= gcd;
    }

    public String toString() {
        if (this.a == 0) {
            return "0";
        } else if (this.b == 1) {
            return String.valueOf(this.a);
        }
        return this.a + "/" + this.b;
    }

    public Fraction sum(Fraction other) {
        return new Fraction(this.a * other.b + other.a * this.b, this.b * other.b);
    }

    public Fraction sum(int other) {
        return new Fraction((this.b * other) + this.a, this.b);
    }

    public double sum(double x) {
        return (((double) this.a / this.b) + x);
    }

    public Fraction subtract(Fraction other) {
        Fraction x = new Fraction(-other.getA(), other.getB());
        return this.sum(x);
    }

    public Fraction multiple(Fraction o) {
        return new Fraction(this.a * o.b, this.b * o.a);
    }

    public Fraction division(Fraction o) {
        return this.multiple(o.reciprocal());
    }

    public Fraction reciprocal() {
        return new Fraction(this.b, this.a);
    }

    public Fraction sumAs(Fraction other){
        Fraction sum = this.sum(other);
        this.a = sum.a;
        this.b = sum.b;
        return this;
    }

    public Fraction sum(Fraction[] o) {
        Fraction res = new Fraction();
        for (Fraction fraction : o) {
            res.sumAs(fraction);
        }
        return res;
    }

    public Fraction subtractAs(Fraction other) {
        Fraction subtract = this.subtract(other);
        this.a = subtract.a;
        this.b = subtract.b;
        return this;
    }

    public Fraction multipleAs(Fraction other) {
        Fraction multiple = this.multiple(other);
        this.a = multiple.a;
        this.b = multiple.b;
        return this;
    }

    public Fraction divisionAs(Fraction other) {
        Fraction reciprocal = other.reciprocal();
        this.a = multiple(reciprocal).a;
        this.b = multiple(reciprocal).b;
        return this;
    }

    public Fraction maxFraction(Fraction[] o) {
        Fraction res = new Fraction(Integer.MIN_VALUE, 1);
        for (Fraction fraction : o) {
            if (res.compareTo(fraction) < 0) {
                res = fraction;
            }
        }
        return res;
    }


    @Override
    public int compareTo(Fraction o) {
        return Integer.compare((this.a * o.b), (this.b * o.a));
    }

    public int compareTo(int o) {
        return Integer.compare((this.a * this.b), o);
    }

    public int compareTo(double o) {
        return Double.compare((double) this.a / this.b, o);
    }
}

