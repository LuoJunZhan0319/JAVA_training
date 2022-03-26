import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();;  //宣告串列變數，給予物件實體
		
		//List就像是一個清單!! 有著曾刪改查的能力!!!(非常好用)
		list.add("Amanda");
		list.add("Bob");
		list.add("Alice");
		System.out.println(list);
		
		list.remove(1);  //移除串列索引到的元素
		System.out.println(list);
		
		list.add(1,"Toby");  //在指定索引位置加入元素
		System.out.println(list);
		
		//查
		for(int i = 0; i<list.size(); i++)  //串列中要查詢大小必須使用size，而不是length
		{
			System.out.println(list.get(i));  //要取得串列裡面的資訊，需要使用ArrayList.get()取得
		}
		
		//改
		list.set(0, "Alan");  //在指定索引位置改變元素
		System.out.println(list);
		
		list.clear();  //清空串列
		System.out.println(list);
		

	}

}
