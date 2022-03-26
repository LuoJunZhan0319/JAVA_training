import java.util.Arrays;

//這邊很重要喔!!!感覺會考~~~~
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 5, 4, 3, 8, 1 };

		int[] newArray = Arrays.copyOf(array, array.length); // 此方法接受兩參數，1.你到底想複製哪個陣列? 2.新的陣列長度
		// copyof()方法複製出來的陣列，也是產生出新的陣列

		for (int a : newArray) {
			System.out.print(a + "");
		}
		// 特別注意，newArray跟Array是不同的陣列
		// 但Arrays.equals()比較的是陣列內容跟跟順序是否一樣
		System.out.println(Arrays.equals(array, newArray));

		Arrays.sort(newArray); // 陣列排序
		for (int a : newArray) {
			System.out.print(a + "");
		}

		System.out.println(Arrays.equals(array, newArray));
	}

}
