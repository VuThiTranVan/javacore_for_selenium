package example.handleException;

public class ExampleThrowAndThrows {
	// tu minh raise exception
	static void selfRaiseException(int num1, int num2) {
		try {
			if (num2 == 0)

				throw new ArithmeticException("Khong duowc chia cho 0 nhe!");
			else
				System.out.println(num1 / num2);

		} catch (ArithmeticException e) {
			System.out.println("handle o catch: " + e.getMessage());
		}
	}

	static void mymethod(int num1, int num2) {
		try {

			System.out.println(num1 / num2);
			System.out.println("Call My method");
		} catch (ArithmeticException e) {
			System.out.println("handle o catch: " + e.getMessage());
		}
	}

	static void mymethod1(int num1, int num2) throws ArithmeticException {
		System.out.println(num1 / num2);
		System.out.println("My method 1");
	}

	static void callMymethod1(int num1, int num2) {
		System.out.println("Call My method 1");
		mymethod1(num1, num2);

	}

	public static void main(String[] args) {
		ExampleThrowAndThrows.mymethod(10, 0);
		// ExampleThrowAndThrows.mymethod1(1, 0);

		ExampleThrowAndThrows.callMymethod1(10, 0);
	}

}
