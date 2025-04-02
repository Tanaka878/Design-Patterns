package designPatterns.singleton.eagerEvaluation;

public class EagerEvaluation {

    private static final EagerEvaluation instance =new EagerEvaluation();
    private int value =0;

    //private instance of class
    private EagerEvaluation() {}
    public static EagerEvaluation getInstance() {
        return instance;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
