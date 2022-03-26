/**
 * This program compares two String objects using the compareTo method.
 */

public class StringCompareTo {
	public static void main(String[] args) {
		String name1 = "Mary", name2 = "Mark", name3 = "Marx";

		// Compare "Mary" and "Mark"

		if (name1.compareTo(name2) < 0) // compareTo()為String的方法，回傳數值
		{
			System.out.println(name1 + " is less than " + name2);
		} else if (name1.compareTo(name2) == 0) {
			System.out.println(name1 + " is equal to " + name2);
		} else if (name1.compareTo(name2) > 0) {
			System.out.println(name1 + " is greater than " + name2);
		}
		System.out.println(name1.compareTo(name3)); // 比較字串間，各字元的內碼差
	}
}
