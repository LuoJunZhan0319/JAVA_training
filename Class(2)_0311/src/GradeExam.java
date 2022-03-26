
public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] answers = {
			      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

		char[]	keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		isCorrect(answers, keys);

//		for(int i = 0; i < answers.length ; i++)  //每一位同學
//		{
//			int score = 0;  //初始同學得分
//			
//			for(int j = 0; j < answers[i].length ; j++)  //各個題答案
//			{
//				if(answers[i][j] == keys[j])
//				{
//					score ++;
//				}
//			}
//			
//			System.out.println("Student " + i +"'s correct count is "+score);
//		}
		
	}
	
	public static void isCorrect(char[][] answers, char[]keys)
	{
		for(int i = 0; i < answers.length ; i++)  //每一位同學
		{
			int score = 0;  //初始同學得分
			
			for(int j = 0; j < answers[i].length ; j++)  //各個題答案
			{
				if(answers[i][j] == keys[j])
				{
					score ++;
				}
			}
			
			System.out.println("Student " + i +"'s correct count is "+score);
		}
	}

}
