package com.hoya.level1;

public class NoSameCounter2 {
    public int[] solution(int []arr) {
        int [] result;

        String tmp = "";

        for(int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if(i==0){
                tmp += cur;
            }
            for (int j = i + 1; j < arr.length; j++) {
                int compare = arr[j];

                if( cur != compare ){
                    tmp += compare;
                    break;
                }else{
                    i = j;
                }
            }
        }

        String [] s = tmp.split("");

        result = new int[s.length];

        for(int i=0; i<s.length; i++){
            result[i] = Integer.parseInt(s[i]);
        }

        for(int a : result){
            System.out.print(a);
        }

        return result;
    }



    public static void main(String[] args){
        NoSameCounter2 s = new NoSameCounter2();
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
//        int [] result = s.solution(arr);
        int [] result2 = s.solution(arr2);
    }

}
