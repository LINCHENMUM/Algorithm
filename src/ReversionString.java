import java.util.Stack;

public class ReversionString {
	public static void main(String[] args) {
		String string = "we test coders";
		String result = reverseString(string);
		System.out.println(result);
	}

	public static String reverseString(String str) {

		char[] stArray = str.toCharArray();
		Stack<Character> st = new Stack<Character>();
		String temp = "";
		String r = "";
		for (int i = 0; i < stArray.length; i++) {
			st.push(stArray[i]);
		}
		while (!st.empty()) {
			temp = temp + st.pop().toString();
		}
		String[] result = temp.split("\\s+");
		int len = result.length;
		for (int k = 0; k < result.length; k++) {
			r = r + result[len - k - 1] + " ";
		}
		return r.trim();
	}
}
