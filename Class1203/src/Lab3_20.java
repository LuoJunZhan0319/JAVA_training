public class Lab3_20 {
	public static void main(String[] args) {
		double a = 3.0, b = 4.0, c = 5.0, d = 6.0;
		int e = 10;

		System.out.printf("a = %f\n", a); // printf(�e���O�榡�r��,��m�Ѽ�)
		System.out.printf("a = %f;b = %f\n", a, b); // �e���榡�r�꦳�X��%�A�᭱�N�n���X�ӰѼ�!!!
		System.out.printf("a = %f;b = %f;c = %f\n", a, b, c);
		System.out.printf("a = %f;b = %f;c = %f;d = %f\n", a, b, c, d);

		System.out.printf("a = %f\n", e); // �|���A�����M�O�k�j���p�b�����ɥi�H�j���ഫ���A�A���b�榡�r��e���榡�N�Oı�o���諸�A�k�䳣�n�ۤv�D�ʦa�h�t�X��!!
		// ���h�A�i�H�o�˼g~
		System.out.printf("a = %f\n", (double) e);
		// �άO������榡�ﱼ
		System.out.printf("a = %d\n", e);
	}
}