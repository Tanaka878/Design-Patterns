package org.designPatterns.singleton;

import org.designPatterns.singleton.lazy_Evaluation.LazyEvaluation;

public class TestSingleton {

    public static void main(String[] args) {
        LazyEvaluation lazyEvaluation = LazyEvaluation.getInstance();
        lazyEvaluation.setValue(10);
        System.out.println(lazyEvaluation);
        System.out.println("Value"+ lazyEvaluation.getValue());

        lazyEvaluation =null;
        lazyEvaluation = LazyEvaluation.getInstance();
        System.out.println(lazyEvaluation);
        System.out.println("Value"+ lazyEvaluation.getValue());



    }
}
