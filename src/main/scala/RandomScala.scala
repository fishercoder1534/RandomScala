object RandomScala extends App {
  val s3 = new S3UploadStrategy();
  println("s3 is: ")
  println(s3)
  println(s3.bucketRange)
  println(s3.validateUploadCount)
}

class S3UploadStrategy() extends Serializable {
  val bucketRange: Int = 1
  val validateUploadCount: EntityRecords => Unit = _ => {}
}

case class EntityRecords() extends Serializable {}
