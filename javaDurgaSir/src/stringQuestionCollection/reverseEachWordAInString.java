package stringQuestionCollection;

public class reverseEachWordAInString {

	public static void main(String[] args) {
		
		String s = "jonny jonny yes papa";
		
		String sarr [] = s.split(" ");
		
		for(int i = sarr.length-1;i>=0;i--) {
			System.out.print(sarr[i]+" ");
		}

	}

}
