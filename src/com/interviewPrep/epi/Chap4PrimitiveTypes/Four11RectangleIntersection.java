package com.interviewPrep.epi.Chap4PrimitiveTypes;

public class Four11RectangleIntersection {
    static class Rectangle{
        int x;
        int y;
        int w;
        int h;
        Rectangle(int x, int y, int w, int h){
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "x=" + x +
                    ", y=" + y +
                    ", w=" + w +
                    ", h=" + h +
                    '}';
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1, 2, 2);
        Rectangle r2 = new Rectangle(2, 2, 2, 2);
        Rectangle intersection = rectangleIntersection(r1, r2);
        System.out.println(intersection);
    }

    private static Rectangle rectangleIntersection(Rectangle r1, Rectangle r2) {
        if(!isIntersectionExists(r1, r2)){
            return null;
        }

        return new Rectangle(
                Math.max(r1.x, r2.x),
                Math.max(r1.y, r2.y),
                Math.min(r1.x + r1.w, r2.x + r2.w) - Math.max(r1.x, r2.x),
                Math.min(r1.y + r1.h, r2.y + r2.h) - Math.max(r1.y, r2.y)
        );
    }

    private static boolean isIntersectionExists(Rectangle r1, Rectangle r2) {
        return (r1.x <= (r2.x + r2.w) && r2.x <= (r1.x + r1.w) &&
                r1.y <= (r2.y + r2.h) && r2.y <= (r1.y + r1.h));
    }

}
