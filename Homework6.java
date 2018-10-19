public class Homework6 {
// Lorenzo Largent
	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	 private String s;
	 private int a;
	 private int b;
	 private int c;

	public Homework6(String s, int a, int b, int c) {
this.s = s;
this.a = a;
this.b = b;
this.c = c;
	}

	/* Return true if the stored String comes before the provided
	 * String lexicographically, return false if it does not
	 */
	public boolean isBefore(String other) {
if  (s.compareTo(other) == 1) {
	return true;}
else {return false;}
}


	/* Return the maximum of the stored integers
	 */
	public int max() {
if (a > b && a > c) {
	return a;
}  if (	b > a && b > c) {
	return b;
} else  {
	return c;}

}


	/* Return the middle value of the stored integers. If two numbers
	 * have the same value, return the lowest value. If all three numbers
	 * have the same value, return any. You must call the max() function
	 * to receive full credit
	 */
	public int mid() {
if (max() == a && b>c){
	return b;}
if (max() == a && c>b){
		return c;}
if (max() == b && a>c){
	return a;}
if (max() == b && c>a){
	return a;}
if (max() == c && b>a){
	return b;}
if (max() == c && a>b){
	return a;}
if (a == b){
	return c;}
if (a == c){
	return b;}
if (b == c){
	return a;}
if (a == b && b == c){
	return a;}
else {return a;}
}







	/* Return true if the stored numbers were provided in ascending
	 * order. They are considered ascending if each number is greater
	 * than or equal to the previous. To get full credit, do not use
	 * >= or =<; instead use < or > and invert them with !
	 */
	public boolean isAscending() {
if (!(a<b && b<c)) {
	return true;}
else {return false;}
}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework6 hw6 = new Homework6("Drive", 4, 5, 6);

		if (hw6.isBefore("Cars")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw6.max() == 6) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw6.mid() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		hw6 = new Homework6("Drive", 4, 5, 5);
		if (hw6.mid() == 4) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw6.isAscending()) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
