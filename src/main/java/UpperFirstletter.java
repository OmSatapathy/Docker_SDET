
public class UpperFirstletter {

	public static void main(String[] args) {
		String s = "ajit kumar"; // Ajit kumar

		String output = s.substring(0, 1).toUpperCase() + s.substring(1);
	//	System.out.println(output);

		String[] sp = s.split(" ");
		StringBuilder bs = new StringBuilder();

		for (String word : sp) {
              bs.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1))
              .append(" ");
              }
		
		
		 String output1 = "";
	        for (String word : s.split(" ")) {
	            output += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
	        }
	        

		System.out.println(bs);
		
		//System.out.println(output1.trim());
	}

}
