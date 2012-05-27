import xml.XML

object Test {
  def main(args: Array[String]): Unit = {
    val input = """<elem one="test" two="test2" three="test3"></elem>"""
    val doc = XML.loadString(input)
    println(doc)
  }
}
