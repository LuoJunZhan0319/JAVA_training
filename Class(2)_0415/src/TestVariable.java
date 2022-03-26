
public class TestVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A amanda = new A();
		A bob = new A();
		
		amanda.v1 = 10;
		bob.v1 = 20;
		
	}

}


class A
{
	int v1;				//办跑计(global variable)[⊿Τ本static] : 逆跑计
	
	static int v2;		//办跑计(global variable)[Τ本static] : 摸跑计
	
	public A()
	{
		int v3;			//跋办跑计(local variable)礚猭阁よ猭ㄏノ
		v2 = 90;		//┮Τンの摸よ猭Аㄏノ本static办跑计
		
	}
	
	public static void B()
	{
		v2 = 90;		//┮Τンの摸よ猭Аㄏノ本static办跑计
		v1 = 10;		//⊿Τstatic办跑计続ノンよ猭い礚猭ノ摸よ猭
	}
	
	public void m1()
	{
		v1 = 10;		//⊿Τstatic办跑计続ノンよ猭い礚猭ノ摸よ猭
		v3 = 90;		//度よ猭ず; ネ㏑秅戳籔よ猭; 獶ン
	}
	
}