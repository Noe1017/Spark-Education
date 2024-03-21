package com.atguigu.bigdata.spark.core.rdd.builder
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
/**
 * @author Noe
 * @date {DATE} 20:00 
 */
object Spark02_RDD_File_Par {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(sparkConf)

    //textFile 可以将文件作为数据处理的数据源，默认也可以设定分区。

    // minPartitions: 最小分区数量
    // math.min(defaultParallelism, 2 )
    //如果不想使用默认的分区数量，可以通过第二个参数指定分区数

    val rdd = sc.textFile("datas/1.txt",2)

    //total size
    //分区数量的计算方式

    //val rdd: RDD[String] = sc.textFile("dats/1.txt")

    rdd.saveAsTextFile("output")

    sc.stop()
  }
}
