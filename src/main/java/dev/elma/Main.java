package dev.elma;

import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {
//        SparkConf conf = new SparkConf()
//                                        .setAppName("Spark App")
//                                        .setMaster("spark://spark-master:7077");
//        SparkContext sc = new SparkContext(conf);

            SparkSession spark = SparkSession.builder()
                                        .appName("Spark App")
                                        .master("spark://spark-master:7077")
                                        .getOrCreate();
            spark.read()
                    .option("header", "true")
                    .option("inferSchema", "true")
                    .csv("/bitnami/dataDev.csv").show();


    }
}