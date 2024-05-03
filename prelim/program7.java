package prelim;

public class program7 {
    public static void main(String[] args) {
		/*Logical operator (||(logical) 
		and | (boolean logical inclusive OR)*/
		int i = 0;
		int j = 10;
		boolean test= false;
		//demonstrate ||
		test = (i < 10) || (j++ > 9);
		System.out.println(i);
		System.out.println(j);
		System.out.println(test);
		//demonstrate |
		test = (i < 10) | (j++ > 9);
		System.out.println(i);
		System.out.println(j);
		System.out.println(test);

	}
}
