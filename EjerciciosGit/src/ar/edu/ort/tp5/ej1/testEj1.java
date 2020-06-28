package ar.edu.ort.tp5.ej1;

import java.util.Stack;

public class testEj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenano = "(Cadena no equilibrada en paréntesis(()()()))))";
		/*
 		((()()()))))
		 * */
		String cadenasi = "(Cadena equilibrada en paréntesis())";
		String cadenaNoFull = "(Cadena equilibrada en paréntesis(){]})";
		String cadenaSiFull = "(Cadena equilibrada en paréntesis(){[i]}[]())";
		System.out.println("Verificación balanceo para: " + cadenano);
		System.out.println(verificaParentesis(cadenano));
		System.out.println("Verificación balanceo para: " + cadenasi);
		System.out.println(verificaParentesis(cadenasi));
		System.out.println("Verificación balanceo para: " + cadenaNoFull);
		System.out.println(verificaParentesis(cadenaNoFull));
		System.out.println("Verificación balanceo para: " + cadenaSiFull);
		System.out.println(verificaParentesis(cadenaSiFull));
	}
	public static boolean verificaParentesis(String cadena){
		Stack<String> pila = new Stack<String>();
		int i = 0;
		//String letra = "";
		boolean equilibrio = true;
		char caracter;
		//String letraTop = "";
		while (i < cadena.length() && equilibrio){ // Recorremos la expresión carácter a carácter
			//letra = cadena.substring(i,i+1);
			caracter = cadena.charAt(i);
			
			if(caracter =='('){
				pila.push("(");
			}else{
				if (caracter =='{'){
					pila.push("{");
				}else{
					if (caracter =='['){
						pila.push("[");
					}else{
						if(caracter ==')' || caracter =='}' || caracter ==']'){ // Si es de cierre actuamos según el caso
							if(!pila.empty()){
								switch(caracter){
									case ')':
										if(pila.peek().equals("(")){
											pila.pop();	// Apilo si en TOP de la pila hay un ( 									
										}else{
											System.out.println("Falta => (");
											equilibrio = false;
										}
										break;
									case '}':
										if(pila.peek().equals("{")){
											pila.pop();	// Apilo si en TOP de la pila hay un {
										}else{
											System.out.println("Falta => {");
											equilibrio = false;
										}								
										break;
									case ']':
										if(pila.peek().equals("[")){
											pila.pop();	// Apilo si en TOP de la pila hay un [
										}else{
											System.out.println("Falta => [");
											equilibrio = false;
										}
										break;
								}
							}else{
								equilibrio = false;
							}
						}
					}
				}
			}
			// Si es de apertura apilamos siempre
			i++;
		}
		System.out.println();
		if(pila.isEmpty() && equilibrio){
			return true;
		}else{
			return false;
		}
	}

}
