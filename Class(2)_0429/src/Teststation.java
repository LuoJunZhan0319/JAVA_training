import java.util.ArrayList;
import java.util.Scanner;

enum Station {�x�_, ���, �x��, �Ÿq, �x�n, ����}

public class Teststation {
	
	public static void main(String[] args)
	{
		ArrayList<Train> trains = createDB();  //�I�screateDB�A���o�C�����
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("�U�����W�P�s��");
		
		Station[] stations = Station.values();  //���oStation�C�|���A�ȩҺc�����}�C
		
		for(int i = 0; i < stations.length; i++)
		{
			System.out.println(stations[i]+"("+i+")");
		}
		
		int user = in.nextInt();                //�O���ϥΪ̭n�d�ߪ����a���s��
		
	    for(int i = 0; i < trains.size(); i++)  //�w��trains��C�i�汽�y�A�C�C�����n�ˬd
	    {
	    	ArrayList<Station> stops = trains.get(i).stops; //���X���b�B�z���C���A���X�ӦC�������a����C
	    	
	    	for(int j = 0; j < stops.size(); j++)
	    	{	
	    		if(stops.get(j).ordinal() == user)      //�p�G�Y�Ӱ��a���s������ϥΪ̭n�d�ߪ��s��
	    		{
	    			System.out.println(trains.get(i).id);  //�L�X�ӦC�����s��
	    		}
	    	}
	    }
	}
	
	public static ArrayList<Train> createDB()  //�t�d���ͦC����ơB�ѥD�{���i��d��
	{
		ArrayList<Station> list = new ArrayList<Station>();
		list.add(Station.�x�_);
		//list.add(����); ���~�ܽd
		list.add(Station.����);
		
		Train t001 = new Train();	//���ͲĤ@�Z�C������
		t001.id = "001";
		t001.stops = list;
		
		ArrayList<Station> list2 = new ArrayList<Station>();
		list2.add(Station.�x�_);
		list2.add(Station.�x��);
		list2.add(Station.����);
		
		Train t002 = new Train();	//���ͲĤG�Z�C������
		t002.id = "002";
		t002.stops = list2;
		
		ArrayList<Station> list3 = new ArrayList<Station>();
		list3.add(Station.�x�_);
		list3.add(Station.���);
		list3.add(Station.�x��);
		list3.add(Station.�Ÿq);
		list3.add(Station.�x�n);
		list3.add(Station.����);
		
		Train t003 = new Train();	//���ͲĤT�Z�C������
		t003.id = "003";
		t003.stops = list3;
		
		ArrayList<Train> trains = new ArrayList<Train>();
		trains.add(t001);
		trains.add(t002);
		trains.add(t003);
		
		return trains;
	}
	
}

class Train //�C��
{
	String id;  //�C���s�� 
	
	ArrayList<Station> stops; //���a���W
	
}
