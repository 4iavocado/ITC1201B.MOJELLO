package prelim;

public class program6 {
    public static void main(String[] args) {
		//Logical Operator (&&(logical) and &(boolean logical)AND
		int i = 0;
		int j = 10;
		boolean test = false;
		//demonstrate && (and and)
		test = (i > 10) && (j++ > 9);
		System.out.println(i);
		System.out.println(j);
		System.out.println(test);
		//demonstrate &
		test = (i > 10) & (j++ > 9);
		System.out.println(i);
		System.out.println(j);
		System.out.println(test);

	}
}
