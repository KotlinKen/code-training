package com.hoya.graph;

public class MakeBigNumber {
    public String solution(String n, int k) {
        String answer = "";

        String [] list = n.split("");
        int [] numbers = new int[list.length];

        for( int i = 0; i< list.length; i++){
            numbers[i] = Integer.parseInt(list[i]);
        }



        int get = numbers.length - k;


        int[] dn = new int[numbers.length - get];

        int pick = 0;
        int pickIndex = 0;

        String t = "";

        int startIndex = 0;

//        [0 , 0]
//         4 - 2  = 2

        for(int i = 0; i< numbers.length - get ; i++){
            if(i==0){
                pick = Integer.parseInt(list[i]);
                pickIndex = 0;
            }else {
                if(pick <  numbers[i+1]){
                    pick = numbers[i+1];
                    pickIndex = i+1;
                    i = i+2;
                    t += pick;
                };
            }
        }

        return answer;
    }

    public static void main(String[] args){
        MakeBigNumber ds = new MakeBigNumber();
//        ds.solution("1924", 2);
//        ds.solution("1594", 2);


//        ds.solution("1231234", 3);
        ds.solution("4177252841", 4);

    }
}
