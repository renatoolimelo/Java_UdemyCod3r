package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //implic�ta
		System.out.println(a);
		
		float b = (float) 1.12345678888888; //expl�cita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;  //expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.99999999999;
		int f = (int) e;
		System.out.println(f);
	}

}
