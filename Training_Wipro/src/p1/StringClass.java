package p1;

public class StringClass {

	public static void main(String[] args) {
		String sExpected="abcdef";
		String sActual="abcdefghij";
		String sPractice="abdcra";
		System.out.println(sExpected.length());
		System.out.println(sExpected.charAt(2));
		System.out.println(sExpected.indexOf("d"));
		System.out.println(sExpected.toUpperCase());
		System.out.println(sExpected.concat(" Shiv"));
		System.out.println(sExpected.substring(2));
		System.out.println(sExpected.substring(2,5));
		System.out.println(sExpected.startsWith("abc"));
		System.out.println(sExpected.endsWith("ef"));
		System.out.println(sExpected.replace("c", "n"));
		System.out.println(sActual.contains(sExpected));
		System.out.println(sPractice.lastIndexOf("a"));

	}

}
