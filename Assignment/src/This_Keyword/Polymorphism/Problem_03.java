package Polymorphism;

class Pizza{
    private String size;
    private int cheeseTop;
    private int pepTop;
    private int hamTop;

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    public void setCheeseTop(int cheeseTop) {
        this.cheeseTop = cheeseTop;
    }
    public int getCheeseTop() {
        return cheeseTop;
    }

    public void setPepTop(int pepTop) {
        this.pepTop = pepTop;
    }
    public int getPepTop() {
        return pepTop;
    }

    public void setHamTop(int hamTop) {
        this.hamTop = hamTop;
    }
    public int getHamTop() {
        return hamTop;
    }

    public Pizza(String size,int cheeseTop,int pepTop,int hamTop){
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.pepTop = pepTop;
        this.hamTop = hamTop;
    }
}

public class Problem_03 {
    public static void main(String[] args) {

    }
}
