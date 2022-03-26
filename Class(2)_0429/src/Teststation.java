import java.util.ArrayList;
import java.util.Scanner;

enum Station {台北, 桃園, 台中, 嘉義, 台南, 高雄}

public class Teststation {
	
	public static void main(String[] args)
	{
		ArrayList<Train> trains = createDB();  //呼叫createDB，取得列車資料
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("各站站名與編號");
		
		Station[] stations = Station.values();  //取得Station列舉型態值所構成的陣列
		
		for(int i = 0; i < stations.length; i++)
		{
			System.out.println(stations[i]+"("+i+")");
		}
		
		int user = in.nextInt();                //記錄使用者要查詢的停靠站編號
		
	    for(int i = 0; i < trains.size(); i++)  //針對trains串列進行掃描，每列車都要檢查
	    {
	    	ArrayList<Station> stops = trains.get(i).stops; //取出正在處理的列車，取出該列車的停靠站串列
	    	
	    	for(int j = 0; j < stops.size(); j++)
	    	{	
	    		if(stops.get(j).ordinal() == user)      //如果某個停靠站編號等於使用者要查詢的編號
	    		{
	    			System.out.println(trains.get(i).id);  //印出該列車的編號
	    		}
	    	}
	    }
	}
	
	public static ArrayList<Train> createDB()  //負責產生列車資料、供主程式進行查詢
	{
		ArrayList<Station> list = new ArrayList<Station>();
		list.add(Station.台北);
		//list.add(高雄); 錯誤示範
		list.add(Station.高雄);
		
		Train t001 = new Train();	//產生第一班列車物件
		t001.id = "001";
		t001.stops = list;
		
		ArrayList<Station> list2 = new ArrayList<Station>();
		list2.add(Station.台北);
		list2.add(Station.台中);
		list2.add(Station.高雄);
		
		Train t002 = new Train();	//產生第二班列車物件
		t002.id = "002";
		t002.stops = list2;
		
		ArrayList<Station> list3 = new ArrayList<Station>();
		list3.add(Station.台北);
		list3.add(Station.桃園);
		list3.add(Station.台中);
		list3.add(Station.嘉義);
		list3.add(Station.台南);
		list3.add(Station.高雄);
		
		Train t003 = new Train();	//產生第三班列車物件
		t003.id = "003";
		t003.stops = list3;
		
		ArrayList<Train> trains = new ArrayList<Train>();
		trains.add(t001);
		trains.add(t002);
		trains.add(t003);
		
		return trains;
	}
	
}

class Train //列車
{
	String id;  //列車編號 
	
	ArrayList<Station> stops; //停靠站名
	
}
