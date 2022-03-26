

public class Binary_Search {
	
	public static void main(String[] args) {
		int[] array = {2, 5, 8, 9, 10, 17};
		System.out.print(binarySearch(8,array));
	}
	
	public static int binarySearch(int search, int[] array)
	{
		int left = 0, right = array.length-1;
		
		while(left <= right)
		{
			int pos = (left + right) / 2;		//�M�w���������m
			if(array[pos] == search)			//�b�����m���search
			{
				return pos;						//�^�Ǧ�m
			}
			else if(array[pos] > search)		//��n�j�M���񵲪G�p�A���Y�d��b����
			{
				right = pos - 1;
			}
			else if(array[pos] < search)		//��n�j�M���񵲪G�j�A���Y�d��b�k��
			{
				left = pos + 1;
			}
			
		}
		
		return -1;   							//�@���^�ǳo�ӭȡA�N��{�������D�A�n�A�ˬd!!!
		
	}

}
