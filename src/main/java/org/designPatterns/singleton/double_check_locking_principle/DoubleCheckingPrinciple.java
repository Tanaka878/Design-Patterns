package org.designPatterns.singleton.double_check_locking_principle;

public class DoubleCheckingPrinciple {

    private static volatile DoubleCheckingPrinciple instance =null;
    private int value =0;


    //private instance of class
    private DoubleCheckingPrinciple() {}
    public static  DoubleCheckingPrinciple getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckingPrinciple.class) {
                if (instance == null) {
                    instance = new DoubleCheckingPrinciple();
                }
            }

        }
        return instance;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
