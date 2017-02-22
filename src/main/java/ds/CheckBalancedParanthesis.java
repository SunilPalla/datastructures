package ds;

public class CheckBalancedParanthesis {
	private static String strToTest="{{[[(}[}]]]][][)()}";
	private static String strToTest1="[()]{}{[()()]()}";
	
	private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    private static final char L_BRACE    = '{'; 
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';
    
	public static void main(String[] args) {
		checkParanthesis(strToTest);
		//checkParanthesis(strToTest1);
	}

	private static void checkParanthesis(String str) {
		int leftBraceCount=0;
		int leftBracketCount=0;
		int leftParenthesisCount=0;
		int rightBraceCount=0;
		int rightBracketCount=0;
		int rightParenthesisCount=0;
		
		for(int i=0;i<str.length();i++){
			if(str.startsWith(String.valueOf(R_PAREN)) || 
					str.startsWith(String.valueOf(R_BRACE)) || 
					str.startsWith(String.valueOf(R_BRACKET))){
				System.out.print("String cannot start with '}' or ']' or ')'");
				return;
			}
			else if(str.endsWith(String.valueOf(L_PAREN)) || 
					str.endsWith(String.valueOf(L_BRACE)) || 
					str.endsWith(String.valueOf(L_BRACKET))){
				System.out.print("String cannot end with '{' or '[' or '('");
				return;
			}
			if(str.charAt(i)==L_PAREN){
				leftParenthesisCount++;
			}
			else if(str.charAt(i)==L_BRACE){
				leftBraceCount++;
			}
			else if(str.charAt(i)==L_BRACKET){
				leftBracketCount++;
			}
			else if(str.charAt(i)==R_PAREN){
				rightParenthesisCount++;
				if(leftParenthesisCount!=rightParenthesisCount){
					
				}
			}
			else if(str.charAt(i)==R_BRACE){
				rightBraceCount++;
			}
			else if(str.charAt(i)==R_BRACKET){
				rightBracketCount++;
			}
		}
		
		if(leftParenthesisCount!=rightParenthesisCount){
			System.out.println("The count of "+"("+" and "+")"+" is not matching..should be enclosed to complete " );
		}else if(leftParenthesisCount==rightParenthesisCount){
			System.out.println("The count of "+"("+" and "+")"+" is matching.");
		}
		if(leftBraceCount!=rightBraceCount){
			System.out.println("The count of "+"{"+" and "+"}"+" is not matching..should be enclosed to complete " );
		}else if(leftBraceCount==rightBraceCount){
			System.out.println("The count of "+"{"+" and "+"}"+" is matching.");
		}
		if(leftBracketCount!=rightBracketCount){
			System.out.println("The count of "+"["+" and "+"]"+" is not matching..should be enclosed to complete " );
		}else if(leftBracketCount==rightBracketCount){
			System.out.println("The count of "+"["+" and "+"]"+" is matching.");
		}
	}
}
