package Polymorphism;

class SuperClass{
    protected int data1;

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public int getData1() {
        return data1;
    }
}

class SubClass extends SuperClass{
    protected int data2;

    SubClass(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public int getData2() {
        return data2;
    }

    public String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition True!";
        } else {
            return "Condition False!";
        }
    }
}

public class Problem_02 {
    public static void main(String[] args) {
        SubClass obj = new SubClass(10, 15);

        System.out.println("Data1 : " + obj.getData1());
        System.out.println("Data2 : " + obj.getData2());

        System.out.println(obj.checkCondition());

        System.out.println(" ");

        obj.setData2(20);
        System.out.println("New Data2 : " + obj.getData2());
        System.out.println(obj.checkCondition());
    }
}
