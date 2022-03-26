public class Lab3_19 {
	public static void main(String[] args) {
		double value = 3.01;
		System.out.println(value);

		System.out.printf("%f\n", value); // 預設 6 位小數 ,當程式看到%符號又看到f，他就知道要從後面找資料，並且資料要為小數型資料
		System.out.printf("%f\n", 6.02 / value); // 可以放運算式!!!
		System.out.printf("%f---%f\n", value, 6.02 / value); // 可以放多個運算式，所以當一個printf中要兩個%符號時，後面就會需要有兩個資料供它使用，且是有次序性的的去做配對

	}
}