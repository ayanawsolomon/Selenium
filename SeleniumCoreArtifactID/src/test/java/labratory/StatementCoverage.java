package labratory;

public class StatementCoverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// test case one make w=60 and high h=3
		con(60, 3);
		iAmAvirous();
	}
public static void con(int w, int h ){
	if(w>50){
		System.out.println("over weight");
	}else{
		System.out.println("Under weight");
	}
	if(h > 2 ){
		System.out.println("your are long");
	}
}
public static void iAmAvirous(){
for(int i=0;i<=5; i++){
	System.out.println("hello " + i);
	}
}
}
