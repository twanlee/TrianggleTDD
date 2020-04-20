package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void equilateral_triangle() {
        String expected = "Equilateral_Triangle";
        String result = CheckTriangle.TriangleClassfier(2,2,2);
        assertEquals(expected, result);
    }
    @Test
    void isosceles_triangle() {
        String expected = "Isosceles_Triangle";
        String result = CheckTriangle.TriangleClassfier(2,2,3);
        assertEquals(expected, result);
    }
    @Test
    void triangle() {
        String expected = "Triangle";
        String result = CheckTriangle.TriangleClassfier(3, 4, 5);
        assertEquals(expected, result);
    }
}