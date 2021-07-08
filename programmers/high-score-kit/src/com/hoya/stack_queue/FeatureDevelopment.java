package com.hoya.stack_queue;

import java.util.ArrayList;
import java.util.List;

public class FeatureDevelopment {
    public static void main(String[] args) {

        int [] progresses1 = {93, 55, 30};
        int [] speeds1 = {1, 30, 5};


        int [] progresses2 = {53, 15, 20};
        int [] speeds3 = {3, 30, 1};

        List<Tests> tests = new ArrayList<>();
        tests.add(new Tests(progresses1, speeds1));
        tests.add(new Tests(progresses2, speeds3));


        for(Tests t : tests){
            new Solution(t.getProgresses(), t.getSpeeds());
        }


    }

    static class Solution {
        public Solution(int[] progresses, int[] speeds) {
            solution(progresses, speeds);
        }


        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = {};
            System.out.println(progresses[0]);
            System.out.println(speeds[0]);

            return answer;
        }
    }

    static class Tests{
        int[] progresses;
        int[] speeds;

        public Tests(int[] progresses, int[] speeds) {
            this.progresses = progresses;
            this.speeds = speeds;
        }

        public int[] getProgresses() {
            return progresses;
        }

        public int[] getSpeeds() {
            return speeds;
        }
    }

}
