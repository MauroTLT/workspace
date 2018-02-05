package ejercicio5;

class Ejercicio {

	public static void main(String[] args) {
		Clase1 obj1 = new Clase1(7);
		Clase1 obj2 = new Clase1(9);
		obj2 = obj1;//Al ser el atributo static esta sentencia no hace nada
		System.out.println(obj1.valorProp() + "	");
		System.out.println(obj2.valorProp() + "	");
	}
}
class Clase1 {
	static int prop = 0;
	public Clase1(int valor){
		prop = valor;
	}
	public int valorProp(){
		return prop;
	}
}
//Imprime ambos objetos con el mismo valorProp ya que el atributo es static.
//Primero ese atributo recibe el 7 del primer objeto, pero despues el segundo
//objeto lo sobreescribe con su valor(9) para todos los objetos ya creados o que se puedan crear.
//Si el atributo no fuera static el resultado seria 7, ya que el objeto 2 copia el valor del objeto 1
