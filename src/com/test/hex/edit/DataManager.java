package com.test.hex.edit;

import java.util.ArrayList;

public class DataManager {
    private ArrayList<Byte> copyBuffer;

    public void shiftDelete(ArrayList<ArrayList<Byte>> data, int row, int column){
        data.get(row).remove(column);
    }

    public void delete(ArrayList<ArrayList<Byte>> data, int row, int column){
        data.get(row).set(column, Byte.valueOf("0"));
    }

    public void shiftInsert(ArrayList<ArrayList<Byte>> data, int row, int column){
        ArrayList<Byte> buffer = this.copyBuffer;
        int columnChanging = column;
        for (Byte b : buffer){
            data.get(row).add(columnChanging, b);
            columnChanging++;
        }
    }

    public void insert(ArrayList<ArrayList<Byte>> data, int row, int column){
        ArrayList<Byte> buffer = this.copyBuffer;
        int columnChanging = column;
        for (Byte b : buffer){
            data.get(row).set(columnChanging, b);
            columnChanging++;
        }
    }

    public void copy(ArrayList<ArrayList<Byte>> data, int rowStart, int columnStart, int rowEnd, int columnEnd){
        this.copyBuffer = new ArrayList<>();
        for (int i = rowStart; i <= rowEnd; i++){
            for (int j = columnStart; j <= columnEnd; j++){
                copyBuffer.add(data.get(i).get(j));
            }
        }
    }

}
