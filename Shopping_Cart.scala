

object Shopping_Cart {
           val shop = Map("Apples" -> 0.60, "Oranges" -> 0.25)

   def main(args: Array[String]): Unit = {
     val list = List("Apples","Apples","Apples","Oranges","Oranges")
     println("Your total is "+totalprice(list)+" £")

      }
           
     def totalprice(list:List[String]):BigDecimal={
       return list.foldLeft(0.0)((total,x)=>total+shop.getOrElse(x, 0.0))
     }
}