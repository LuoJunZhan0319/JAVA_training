import java.util.Arrays;

//�o��ܭ��n��!!!�Pı�|��~~~~
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 5, 4, 3, 8, 1 };

		int[] newArray = Arrays.copyOf(array, array.length); // ����k������ѼơA1.�A�쩳�Q�ƻs���Ӱ}�C? 2.�s���}�C����
		// copyof()��k�ƻs�X�Ӫ��}�C�A�]�O���ͥX�s���}�C

		for (int a : newArray) {
			System.out.print(a + "");
		}
		// �S�O�`�N�AnewArray��Array�O���P���}�C
		// ��Arrays.equals()������O�}�C���e��򶶧ǬO�_�@��
		System.out.println(Arrays.equals(array, newArray));

		Arrays.sort(newArray); // �}�C�Ƨ�
		for (int a : newArray) {
			System.out.print(a + "");
		}

		System.out.println(Arrays.equals(array, newArray));
	}

}
