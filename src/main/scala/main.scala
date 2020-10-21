import org.apache.spark.sql.SparkSession

object main {


  def main(args: Array[String]) : Unit = {

    val spark = SparkSession
      .builder()
      .appName("mj_emr_test")
      .master("local")
      .getOrCreate()

    print( "\n" + "\n" +
      """
                   Cause this is Thriller
      (o_o)//
        )  )
        /  \


                    Thriller night
      \\(o_o)
        (  (
        /  \



         1 1        And no one's gonna save you from the beast about to strike
        (o_o)/
        <)  )
        /  \                \(o_o)/ \(o_o)/ \(o_o)/ \(o_o)/

      """.stripMargin + "\n" + "\n")

  }
}
