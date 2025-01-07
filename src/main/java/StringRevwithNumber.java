
public class StringRevwithNumber {

	public static void main(String[] args) {
		String str= "prince kumar";
		int length = str.length();

	       int vowelcount=0;
        for (int i = 0; i < length; i++) {
            // Calculate reverse index
            int reverseIndex = length - 1 - i;
   

            // Print the character and its reverse index
            System.out.println(str.charAt(reverseIndex) + " -> " + i);
            
            char[] ch = str.toCharArray();
         
            
            for(char c: ch) {
            	if(c=='a' || c =='e'|| c =='i' || c=='o' || c=='u') {
            	    
            	}
            	else {
            		
            	}
            }
        }

        System.out.println(vowelcount);
	}

}
