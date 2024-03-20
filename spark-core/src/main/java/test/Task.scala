package test

/**
 * @author Noe
 * @date {DATE} 20:21 
 */
class Task extends Serializable{

  val datas = List(1 , 2 , 3 , 4)

  val logic : (Int) => Int = _ * 2

  def compute(): List[Int] = {
    datas.map(logic)
  }
}
