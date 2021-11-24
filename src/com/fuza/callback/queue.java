package com.fuza.callback;

public class queue {
    int[] result = new int[8];

    public void cal8queue(int row){
        if (row >=8) return;
        for (int column = 0; column < 8;column++){
            if (isOk(row,column)){
                result[row] = column;
                cal8queue(row+1);
            }
        }
    }

    private boolean isOk(int row, int column) {
        int leftup = row - 1;
        int rightup = column + 1;

        for (int i = row - 1;i>= 0;i--){
            if (result[i] == column) return false;
            if (leftup >= 0) {
                if (result[i] == leftup)return false;
            }
            if (rightup <8){
                if (result[i] ==rightup) return false;
            }
            --leftup;++rightup;
        }
        return true;
    }


}
