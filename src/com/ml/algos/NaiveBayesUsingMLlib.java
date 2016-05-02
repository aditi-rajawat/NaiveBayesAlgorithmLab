package com.ml.algos;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Created by arajawat on 5/1/2016.
 */
public class NaiveBayesUsingMLlib {
    public static void solution(String path){
        SparkConf sparkConf = new SparkConf().setAppName("NaiveBayesUsingMLlib");
        JavaSparkContext javaSparkContext = new JavaSparkContext(sparkConf);

      //  JavaRDD<LabeledPoint> inputData = MLUtils.loadLibSVMFile(javaSparkContext.sc(), path).toJavaRDD();

        System.out.println("Size of inputData");

    }
}
