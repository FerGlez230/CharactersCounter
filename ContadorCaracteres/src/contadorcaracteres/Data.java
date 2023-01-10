/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcaracteres;

/**
 *
 * @author maryf
 */
public class Data {
    private int a;
    private int e; 
    private int i;
    private int o;
    private int u;

    public Data() {
        this.a=0;
        this.e=0;
        this.i=0;
        this.o=0;
        this.u=0;
    }
    public void clear(){
        this.a=0;
        this.e=0;
        this.i=0;
        this.o=0;
        this.u=0;
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setO(int o) {
        this.o = o;
    }

    public void setU(int u) {
        this.u = u;
    }
    
    public int getA() {
        return a;
    }
    public void addA() {
        this.a ++;
    }
    
    public int getE() {
        return e;
    }
    public void addE() {
        this.e ++;
    }
    
    public int getI() {
        return i;
    }
    public void addI() {
        this.i ++;
    }
    
    public int getO() {
        return o;
    }
    public void addO() {
        this.o++;
    }
    
    public int getU() {
        return u;
    }
    public void addU() {
        this.u ++;
    }  
}
