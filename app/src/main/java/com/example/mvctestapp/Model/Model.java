package com.example.mvctestapp.Model;

import java.util.ArrayList;

import java.util.Observable;

public class Model extends Observable {
    ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
    public Model(){

       integerArrayList.add(0);
       integerArrayList.add(0);
       integerArrayList.add(0);
   }
   public int getInteger(int index){
       return integerArrayList.get(index);
   }
   public void updateIntegerArrayList(int index){
        integerArrayList.set(index,integerArrayList.get(index)+1);
        setChanged();
        notifyObservers();
    }
}
