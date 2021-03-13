package com.interviewPrep.epi.Chap13Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thirteen5MaxSimultaneous {
    public static void main(String[] args) {
        int[][] events= {{8, 10}, {9, 11}, {10, 14}, {10, 13}};
        System.out.println(maxSimultaneous(events));
    }

    static class EventTime{
        int time;
        boolean isStart;

        public EventTime(int time, boolean isStart){
            this.time = time;
            this.isStart = isStart;
        }

        @Override
        public String toString(){
            return "time "+time+" isStart "+isStart;
        }
    }

    private static int maxSimultaneous(int[][] events){
        int maxEvents = 0;
        List<EventTime> eventTimeList = new ArrayList<>();

        for(int[] event: events){
            eventTimeList.add(new EventTime(event[0], true));
            eventTimeList.add(new EventTime(event[1], false));
        }

        Collections.sort(eventTimeList, (o1, o2) -> {
            if(o1.time != o2.time)
                return Integer.compare(o1.time, o2.time);

            return o1.isStart && !o2.isStart ? -1 : !o1.isStart && o2.isStart ? 1 : 0;
        });

        int numEvents = 0;

        for(EventTime e: eventTimeList){
            if(e.isStart){
                ++numEvents;
                maxEvents = Math.max(maxEvents, numEvents);
            }else
                --numEvents;
        }

        return maxEvents;
    }
}
