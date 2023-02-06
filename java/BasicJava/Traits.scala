package BasicJava

object Traits {

  trait Talker(subject : String){
    def TalkTo(another:Talker):String
  }

  class person(work: String) extends Talker("Singing") {
    override def TalkTo(another: Talker): String = "Singing song"
  }
  def main(args: Array[String]): Unit = {

  }

}
