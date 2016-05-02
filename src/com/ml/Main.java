package com.ml;

import com.ml.algos.NaiveBayesUsingMLlib;

public class Main {

    public static void main(String[] args) {
        if(args[0]== null){
            System.err.println("***** Usage Error - No File Path Found ***** ");
            System.exit(-1);
        }
        else{
            NaiveBayesUsingMLlib.solution(args[0]);
        }
    }
}
