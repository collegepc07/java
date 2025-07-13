package lab4;

public class Application {
	public static void main(String[] args) {
		Calculator Calc1 = new Calculator();
		
		Calc1.setAddition(5 + 3);
		float Add = Calc1.getAddition();
		System.out.println("Addition: " + Add);
		
		Calc1.setSubtraction(10 - 4);
		float Sub = Calc1.getSubtraction();
		System.out.println("Subtraction: " + Sub);
		
		Calc1.setMultiply(6 * 2);
		float Mul = Calc1.getMultiply();
		System.out.println("Multiply: " + Mul);
		
		Calc1.setDivide(8 / 2);
		float Div = Calc1.getDivide();
		System.out.println("Division: " + Div);
		
		Calc1.setModulus(10 % 3);
		float Mod = Calc1.getModulus();
		System.out.println("Modulus: " + Mod);
	}
}
