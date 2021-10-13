
public class String_Tips {

	public static void main(String[] args) {

		String original = "abcde AOVAS asbc ASODNWQ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		//Remove os espaçamentos.
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2, 9): -" + s05 + "-");
		System.out.println("Replace('a' - 'x'): -" + s06 + "-");
		System.out.println("Replace('abc' - 'xyz'): -" + s07 + "-");
		System.out.println("Index of 'bc';  " + i);
		System.out.println("Last Index of 'bc':  " + j);


	}

}
