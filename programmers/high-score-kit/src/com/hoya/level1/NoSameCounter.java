package com.hoya.level1;

public class NoSameCounter {
    public int[] solution(int []arr) {

        int [] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int cur = arr[i];
            for( int j = i+1; j < arr.length; j++){
                int compare = arr[j];
                if(cur == compare){
                    arr[j] = -1;
                }else{
                    break;
                }
            }
        }
        int index =0;
        for(int d : arr){
            if(d != -1){
                answer[index++] = d;
            }
        }

        int[] result = new int[index];
        for(int i = 0; i < result.length; i++) {
            result[i] = answer[i];
        }

        return result;
    }

    public static void main(String[] args){
        NoSameCounter s = new NoSameCounter();
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        int [] result = s.solution(arr);
    }

}
