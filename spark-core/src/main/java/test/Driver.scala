package test

import java.net.Socket
import java.io.{ObjectOutput, ObjectOutputStream, OutputStream}

/**
 * @author Noe
 * @date {DATE} 17:38 
 */
object Driver {
  def main(args: Array[String]): Unit = {
    val client = new Socket("localhost",9999)

    val out : ObjectOutputStream = client.getOutputStream
    val objOut = new ObjectOutputStream(out)
    val task = new Task()

    objOut.writeObject(task)
    objOut.flush()
    objOut.close()
    client.close()
    println("客户端发送数据完毕")
  }
}
