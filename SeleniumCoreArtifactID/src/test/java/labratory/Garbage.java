package labratory;

public class Garbage {
	public void finalize(){
		System.out.println("clean it");
	}
	public static void main(String[] Args){
		Garbage g= new Garbage();
		Garbage g2 = new Garbage();
		g2=g;
		// this coment
		// some code here
		System.gc();
		
	}

}
