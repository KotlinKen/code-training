package com.hoya.graph;

public class MakeBigNumber {
    public String solution(String n, int k) {
        String answer = "";

        String [] list = n.split("");

        int get = list.length - k;


        String pick = "";

        for(int i = 0; i<get; i++){

        }

        return answer;
    }

    public static void main(String[] args){
        MakeBigNumber ds = new MakeBigNumber();
        ds.solution("1924", 2);
        ds.solution("1231234", 3);
        ds.solution("4177252841", 4);

    }
}
