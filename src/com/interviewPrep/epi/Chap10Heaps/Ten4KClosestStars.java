package com.interviewPrep.epi.Chap10Heaps;

import java.util.*;

public class Ten4KClosestStars {

    private static class Star implements Comparable<Star>{
        private double x, y, z;

        public Star(double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Double distance(){
            return Math.sqrt(x*x + y*y + z*z);
        }

        @Override
        public int compareTo(Star s1) {
            return Double.compare(this.distance(), s1.distance());
        }

        @Override
        public String toString() {
            return "Star: "+x+" "+y+" "+z;
        }
    }

    public static void main(String[] args) {
        List<Star> stars = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 20; i++){
            stars.add(new Star(100 * r.nextDouble(),
                    100 * r.nextDouble(),
                    100 * r.nextDouble()));
        }

        for(Star s: stars){
            System.out.println(s);
        }

        List<Star> closest = getKClosest(stars.iterator(), 5);

        System.out.println("closest stars");

        for(Star s: closest){
            System.out.println(s);
        }

    }

    private static List<Star> getKClosest(Iterator<Star> stars, int k) {
        PriorityQueue<Star> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        while(stars.hasNext()){
            Star s = stars.next();
            maxHeap.add(s);

            if(maxHeap.size() == k+1){
                maxHeap.remove();
            }
        }

        List<Star> result = new ArrayList<>(maxHeap);
        Collections.sort(result);
        return result;
    }
}
