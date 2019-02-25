

object Shopping_Cart {
   
   val shop = Map("Apples" -> 0.60, "Oranges" -> 0.25)

   def main(args: Array[String]): Unit = {
     val list = List("Apples","Apples","Apples","Apples","Apples","Oranges","Oranges","Oranges","Oranges","Oranges")
     var price=totalprice(list)
     val finalprice=price-offers(list)
     println("Your total is "+finalprice+" £")

      }
           
     def totalprice(list:List[String]):BigDecimal={
       return list.foldLeft(0.0)((total,x)=>total+shop.getOrElse(x, 0.0))
     }
     
     def offers(list:List[String]):BigDecimal={
         val l=list.groupBy(x=>x).mapValues(y=>y.size)
              return l.foldLeft(0.0)((totalsaving,x)=>
                x._1 match {
                  case "Apples"=> totalsaving+((x._2/2)*shop.getOrElse(x._1, 0.0))
                  case "Oranges"=>  totalsaving+((x._2/3)*shop.getOrElse(x._1, 0.0))
               
                 }
                 )          
     }
}