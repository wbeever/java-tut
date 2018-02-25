
public class retial_shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * object types Integer: byte(1 byte), short(2 b), long(8 b), int(4 b) Float:
		 * float(4 b), double(8 b) Character: char(2 b) Boolean: bool(1 b)
		 */
		int invoice_num, product_id, quant; // default = 0
		double cost, discount, price; // default = 0.0
		boolean feedback; // default = true

		/*
		 * Math Arithmetic: () > * > / > + > - > %(remainder) Unary: ++ (increase 1),
		 * --(decrease 1) Relational: < , <= , > , >= , != , == Logical;: && (and) , ||
		 * (or), ! (not)
		 */
		int itema = 200, itemb = 75, itemc = 500;
		double price1;

		price1 = ((itema * 2) + (itemb) + (itemc * 3));
		price1 = price1 - (.1 * price1);
		price1 = price1 + (.05 * price1);
		System.out.println(price1);

		/*
		 * Control Statements Selection: if..else, switch..case Iteration: while,
		 * do..while, for Jump: break, continue
		 */
		if (price1 > 1500) {
			System.out.println("Congrats you get another 25% coupon!");
		} else {
			System.out.println("Thank you for shopping here.");
		}
		/*
		 * Loops Do..While: Do once, then execute again if true. While: check condition
		 * before executing. For: Repeat given number of times.
		 */
		do {
			System.out.println("Decreasing price by 20% to < 1000");
			price1 = price1 - (.2 * price1);
			System.out.println(price1);
		} while (price1 > 1000);

		for (int p = 1; p <= 5; p++)
		{
			System.out.println("the price is now:" + price1);
			price1 = price1 - 100;
		}

	}

}
