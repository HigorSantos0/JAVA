package herança;

public class animalteste {
	
	public static void main(String[]args) {
		
		cachorro max = new cachorro();
		max.comida = "ração";
		max.dormir();
		
		galinha cocorico = new galinha();
		cocorico.dormir();
	}
}
