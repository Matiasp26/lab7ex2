package com.company;

class Shape{
    private double lungime;
    private double latime;

    public double getLatime(){
        return latime;
    }
    public void setLatime(double latime){
        this.latime = latime;
    }

    public double getLungime(){
        return lungime;
    }
    public void setLungime(double lungime){
        this.lungime = lungime;
    }
    public double calcArie(){
        return 0.0;
    }
}
class Dreptunghi extends Shape{
    int latime;
    int lungime;
    public Dreptunghi(int latime, int lungime){
        this.latime=latime;
        this.lungime=lungime;
    }
    @Override
    public double calcArie(){
        return this.latime*this.lungime;
    }
}

class Patrat extends Shape{
    int latime;
    public Patrat(int latime){
        this.latime=latime;
    }
    @Override
    public double calcArie(){
        return this.latime*this.latime;
    }
}

public class Main {

    public static void main(String[] args) {
        Dreptunghi dr=new Dreptunghi(4,6);
        System.out.println("arie dreptunghi: "+dr.calcArie());
        Patrat pt=new Patrat(5);
        System.out.println("arie patrat: "+pt.calcArie());
    }
}
