public class Sum {

	public static void main(String[] args) {

		System.out.print("Enter termination value (int): ");
		int terminator = IO.readInt();

		int sum = 0;
		System.out.print("Enter next value, or terminator: ");
		int number = IO.readInt();

		while (number != terminator) {
			sum += number;  // sum = sum + number
			System.out.println("in the loop");

			System.out.print("Enter next value, or terminator: ");
			number = IO.readInt();

		}

		System.out.println("Sum = " + sum);
	}
}
