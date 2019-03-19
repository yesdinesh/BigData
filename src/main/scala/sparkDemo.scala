import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Logger,Level}

// object sparkDemo{
object sparkDemo{
  def main(args : Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    val logFile = "data/kv1.txt" // Input file path
    val spark = SparkSession.builder.master("local[*]").appName("spark_demo").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("0")).count()
    val numBs = logData.filter(line => line.contains("1")).count()
    println(s"Lines contains with 0: $numAs, Lines contains with 1: $numBs")
    spark.stop()
} 
}