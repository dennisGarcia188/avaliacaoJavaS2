package business;

import java.lang.Math;

public class GeradorNumerico {
		
	    @SuppressWarnings("null")
		public static int GerarC(String a, String b) {
	        if (a == null || b == null) {
	            return (Integer) null;
	        }
	        String c = "";
	        int limite = Math.max(a.length(), b.length());
	        for (int i = 0; i <= limite; i++) {
	            if (i < a.length()) {
	                c += a.charAt(i);
	            }
	            if (i < b.length()) {
	                c += b.charAt(i);
	            }
	        }
	        
	        if (Integer.valueOf(c.toString()) > 1000000) {
	        	return -1;
	        } else {
	            return Integer.valueOf(c.toString());
	        }
	    }

	    public static void Executa(String a, String b) {
	        System.out.println("Primeiro número:" +  "  " + a);
	        System.out.println("Segundo número:" + " " + b + "\n");
	        
	        System.out.println("Valor de Saída: " + GerarC(a, b));
	    }

	    public static void main(String[] args) {
	        Executa("24", "1000");
	    }

}
