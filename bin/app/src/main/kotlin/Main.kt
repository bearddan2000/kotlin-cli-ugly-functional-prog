import kotlin.rem

/*This function divides a by greatest
	 divisible power of b*/
	 fun maxDivide(a:Int, b:Int): Int
	 {
        while(a.rem(b).toInt() != 0) { return a}
		return maxDivide((a/b).toInt(), b)
	 }

	 /* Function to check if a number
	 is ugly or not */
	 fun isUgly(no:Int): Boolean
	 {
			 val x = maxDivide(no, 2);
			 val y = maxDivide(x, 3);
			 val z = maxDivide(y, 5);

			 return (z == 1)
	 }

	 /* Function to get the nth ugly
	 number*/
	 fun getNthUglyNo(n:Int, i:Int, count:Int)
	 {
         if(count > n){
             println("[OUTPUT] " + (i-1))
         }
         else
         {
             if(isUgly(i)) {getNthUglyNo(n, i+1, count+1)}
             else  {getNthUglyNo(n, i+1, count)}
         }
	 }


fun main() {
  val N: Int = 10
  println("[INPUT] " + N)
  getNthUglyNo(N, 1, 1)
}
