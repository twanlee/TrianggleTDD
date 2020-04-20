package com.company;

public class CheckTriangle {
    public static String TriangleClassfier(double a, double b, double c) {
        String result = null;
        boolean isZero = a > 0 && b > 0 && c > 0;
        boolean isTriangle = a + b > c && a + c > b && b + c > a;
        boolean isEquilateral = a == b || a == c || b == c;
        boolean isIsosceles  = a == b && a == c;
        if (isZero){
            if (isTriangle) {
                if (isEquilateral) {
                    if (isIsosceles ) {
                        result = "Equilateral_Triangle";
                    } else {
                        result = "Isosceles_Triangle";
                    }
                } else {
                    result = "Triangle";
                }
            } else {
                result = "Not a Triangle";
            }
        }
        return result;
    }

}
