package com.hoya.stack_queue;

public class Printer {
    static class Solution {
        public int solution(int[] p, int location) {
            int length = p.length;
            int size = p.length - 1;

            for(int i=0; i<length; i++){
                boolean flag = false;
                int tmp = p[i];
                for(int j=i; j<length; j++){
                    if(flag){
                        if(j != 0){
                            p[j - 1] = p[j];
                        }
                        if(j == size){
                            p[size] = tmp;
                            flag = false;
                            tmp = p[i];
                            j=i;
                        }
                    }else{
                        if(tmp < p[j]){
                            j = i;
                            flag = true;
                            if(location == i){
                                location = size;
                            }else if(location > i){
                                location--;
                            }
                        }
                    }
                }
            }
            return location+1;
        }
    }


    public static void main(String[] args){
        Solution s = new Solution();

        int[] p = {1,1,9,1,1,1};

        s.solution(p, 0);

    }

}

