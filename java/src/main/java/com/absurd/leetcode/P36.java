package com.absurd.leetcode;

public class P36 {
        public static boolean isValidSudoku(char[][] board) {

            char arr[] = new char[9];
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    arr[j] = board[i][j];
                }
                if(!isValidOneDim(arr)){
                    return false;
                }
                for(int j=0;j<9;j++){
                    arr[j] = board[j][i];
                }
                if(!isValidOneDim(arr)){
                    return false;
                }
            }


            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int corei = (3*i)+1;
                    int corej = (3*j)+1;
                    arr[0] = board[corei-1][corej-1];
                    arr[1] = board[corei-1][corej];
                    arr[2] = board[corei-1][corej+1];
                    arr[3] = board[corei][corej-1];
                    arr[4] = board[corei][corej];
                    arr[5] = board[corei][corej+1];
                    arr[6] = board[corei+1][corej-1];
                    arr[7] = board[corei+1][corej];
                    arr[8] = board[corei+1][corej+1];
                    if(!isValidOneDim(arr)){
                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean isValidOneDim(char[] arr){
            int[] totalArr = new int[]{0,0,0,0,0,0,0,0,0};
            for(int i=0;i<arr.length;i++){
                if(arr[i] <'1' ||arr[i] >'9'){
                    continue;
                }
                if(totalArr[arr[i]-'1']++ >= 1){
                    return false;
                }
            }
            return true;
        }
}
