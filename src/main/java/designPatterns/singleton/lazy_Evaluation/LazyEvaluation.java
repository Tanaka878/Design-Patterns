package designPatterns.singleton.lazy_Evaluation;

public class LazyEvaluation {

    private static LazyEvaluation instance =null;
    private int value =0;

    //private instance of class
    private LazyEvaluation() {}
    public static LazyEvaluation getInstance() {
        if (instance == null) {
            instance = new LazyEvaluation();
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
