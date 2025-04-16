package co.ogury.test

import org.apache.spark.sql.SparkSession
import org.scalatest.GivenWhenThen
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.util.{Failure, Success, Try}

trait BaseSpec extends AnyFlatSpec with Matchers with GivenWhenThen {

  def withSparkSession[T](code: SparkSession => T): T = {
    val session = SparkSession.builder().master("local[*]").getOrCreate()
    Try {
      code(session)
    } match {
      case Success(result) =>
        session.stop()
        result
      case Failure(exception) =>
        session.stop()
        throw exception
    }
  }

}
