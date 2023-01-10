/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcaracteres;

import java.util.Arrays;

/**
 *
 * @author maryf
 */
public class ExecutorCounter implements Runnable {
    private Data data=new Data();
    private final int MAX=50;
    private final char[] array;
    private final int begin;
    private  int end;
    private final Frame frame;
    public Data getData(){
        return data;
    }
    public ExecutorCounter(char arr[], int beg, int end, Frame f){
        this.array = arr;
        this.begin = beg;
        this.end = end;
        this.frame=f;
        //this.data=frame.dataES;
    }
    @Override
    public void run() {
        if(end>array.length) end=array.length;
        counter(array, begin, end);
        frame.dataES.setA(frame.dataES.getA()+data.getA());;
        frame.dataES.setE(frame.dataES.getE()+data.getE());;
        frame.dataES.setI(frame.dataES.getI()+data.getI());;
        frame.dataES.setO(frame.dataES.getO()+data.getO());;
        frame.dataES.setU(frame.dataES.getU()+data.getU());;
        /*int[]labels=new int[5];
        labels[0]=data.getA();
        labels[1]=data.getE();
        labels[2]=data.getI();
        labels[3]=data.getO();
        labels[4]=data.getU();
        
        frame.setLabelsES(labels,end);*/
        //System.out.println("data"+ data.getA()+" "+data.getE());
    }
       
   public void counter(char arr[], int beg, int end){
       //System.out.println("arr = " + arr.length+"beg= "+beg+"end: "+end);
       for (int i = beg; i < end; i++) {  
                //System.out.print ("hi");  
                if(arr[i]=='a') {data.addA(); frame.aCaracteres[i]='@'; }
                if(arr[i]=='e') {data.addE(); frame.aCaracteres[i]='£';}
                if(arr[i]=='i') {data.addI(); frame.aCaracteres[i]='&';}
                if(arr[i]=='o') {data.addO(); frame.aCaracteres[i]='Ø';}
                if(arr[i]=='u') {data.addU(); frame.aCaracteres[i]='¥';}
                
        }
        
        
   } 
}
