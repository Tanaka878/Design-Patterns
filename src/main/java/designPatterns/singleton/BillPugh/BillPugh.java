package designPatterns.singleton.BillPugh;

public class BillPugh {
    private BillPugh() {}
    private int value = 0;
    public static BillPugh getInstance() {
        return SingletonHelper.instance;
    }



    private final static class SingletonHelper{
        private final static BillPugh instance = new BillPugh();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
