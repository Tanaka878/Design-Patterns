package designPatterns.singleton.sychronizedApproach;

public class SychronizedApproach {

    private static SychronizedApproach instance =null;
    private int value =0;

    //private instance of class
    private SychronizedApproach() {}
    public static synchronized SychronizedApproach getInstance() {
        if (instance == null) {
            instance = new SychronizedApproach();
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
