/**
  * Created by fishercoder1534 on 1/22/17.
  */
object Solution {
  def reverse(x: Int): Int = {
    var ret: Int = 0
    var tmp: Int = x
    while (tmp != 0) {
      // handle overflow/underflow
      if (Math.abs(ret) > 214748364) {
        0
      }
      ret = ret * 10 + tmp % 10
      tmp /= 10
    }
    ret
  }
}
