import java.util.*;
import java.awt.font.*;

class Dimabet {
	public static void main(String[] args) {
		char shapeLetter;
		int outLoopCount = 0;
		int inLoopCount = 0;
		int temp = 0;
		int maxLetter = 0;
		int count = 1;
		char[] alphabet = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What Letter Diamond would you like?");
		shapeLetter = scan.next().charAt(0);
		Character.toUpperCase(shapeLetter);
		
		switch(shapeLetter) {
			case 'A':
				maxLetter = 1;
				break;
			case 'B':
				maxLetter = 2;
				break;
			case 'C':
				maxLetter = 3;
				break;
			case 'D':
				maxLetter = 4;
				break;
			case 'E':
				maxLetter = 5;
				break;
			case 'F':
				maxLetter = 6;
				break;
			case 'G':
				maxLetter = 7;
				break; 
			case 'H':
				maxLetter = 8;
				break;
			case 'I':
				maxLetter = 9;
				break;
			case 'J':
				maxLetter = 10;
				break;
			case 'K':
				maxLetter = 11;
				break;
			case 'L':
				maxLetter = 12;
				break;
			case 'M':
				maxLetter = 13;
				break; 
			case 'N':
				maxLetter = 14;
				break; 
			case 'O':
				maxLetter = 15;
				break;
			case 'P':
				maxLetter = 16;
				break; 
			case 'Q':
				maxLetter = 17;
				break;
			case 'R':
				maxLetter = 18;
				break;
			case 'S':
				maxLetter = 19;
				break;
			case 'T':
				maxLetter = 20;
				break;
			case 'U':
				maxLetter = 21;
				break;
			case 'V':
				maxLetter = 22;
				break;
			case 'W':
				maxLetter = 23;
				break;
			case 'X':
				maxLetter = 24;
				break;
			case 'Y':
				maxLetter = 25;
				break;
			case 'Z': 
				maxLetter = 26;
				break;
		}
		
		inLoopCount = maxLetter;
		
		for(int i = 0; i < maxLetter; i++) {
			for(int j = 0; j < inLoopCount; j++) {
				System.out.print(" ");
			}
			if(outLoopCount < 1) {
				System.out.println(alphabet[outLoopCount]);
			} else {
				System.out.print(alphabet[outLoopCount]);
			}
			
			if(outLoopCount >= 1) {
				for(int k = 0; k < count; k++){
					System.out.print(" ");
				}
				System.out.println(alphabet[outLoopCount]);
				count = count + 2;
			}
			
			inLoopCount--;
			outLoopCount++;
		}
		
		count = count - 4;
		inLoopCount = 2;
		outLoopCount = maxLetter - 2;
		
		for(int i = 0; i < maxLetter; i++) {
			for(int j = 0; j < inLoopCount; j++) {
				System.out.print(" ");
			}
			
			if(outLoopCount > -1) {
				System.out.print(alphabet[outLoopCount]);
			}
			
			if(outLoopCount >= 1) {
				for(int k = 0; k < count; k++){
					System.out.print(" ");
				}
				System.out.println(alphabet[outLoopCount]);
				count = count - 2;
			}
			
			inLoopCount++;
			outLoopCount--;
		}
		
	}
}