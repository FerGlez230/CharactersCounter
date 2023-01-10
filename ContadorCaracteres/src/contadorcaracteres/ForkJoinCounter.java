/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcaracteres;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author maryf
 */
public class ForkJoinCounter extends RecursiveAction {
    private Data data=new Data();
    
    private final int MAX=50;
    private final char[] array;
    private final int begin;
    private final int end;
    public Data getData(){
        return data;
    }
    public ForkJoinCounter(char arr[], int beg, int end){
        this.array = arr;
        this.begin = beg;
        this.end = end;
    }

    @Override
    protected void compute() {
        //Data data=new Data();
       if (end - begin <= MAX) {
            for (int i = begin; i < end; i++) {  
                //System.out.print (array[i]);  
                if(array[i]=='a'){ data.addA(); array[i]='@';}
                if(array[i]=='e'){ data.addE(); array[i]='£';}
                if(array[i]=='i'){ data.addI(); array[i]='&';}
                if(array[i]=='o'){ data.addO(); array[i]='Ø';}
                if(array[i]=='u'){ data.addU(); array[i]='¥';}
            }
        } else {
            int mid = (begin + end) /2;
            ForkJoinCounter a=new ForkJoinCounter(array, begin, mid);
            ForkJoinCounter b= new ForkJoinCounter(array, mid, end);
            //a.fork();
            //b.compute();
            //a.join();
            
            invokeAll(a,b);
            data.setA(a.data.getA()+b.data.getA());
            data.setE(a.data.getE()+b.data.getE());
            data.setI(a.data.getI()+b.data.getI());
            data.setO(a.data.getO()+b.data.getO());
            data.setU(a.data.getU()+b.data.getU());
            //merge(array, begin, mid, end);//Mezclamos ambas partes 
        }
       //return data;
    }
    
}
