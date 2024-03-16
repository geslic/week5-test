public class codebat {
	
	public static  int sumDouble(int a, int b) {
		  if (a == b)
		  {
		    return 2 * (a + b);
		  }
		  return a + b;
		}
	
	public static int diff21(int n) {
		  if(n > 21)
		  {
		    return 2 * (Math.abs (n - 21));
		  }
		  return Math.abs(n - 21);
		}
	
	public static boolean parrotTrouble(boolean talking, int hour) {
		if(talking == true && (hour < 7 || hour > 20))
		  {
		    return true;
		  }else{
		    return false;
		  }
		}
	
	public boolean nearHundred(int n) {
		  if((n < 10 && n > 9 || n < 100 && n > 90) || n == 200 )
		  {
		    return true;
		  }
		  return false;
		}
	
	public static String frontBack(String str) {
		  if (str.length() <= 1) 
		  {
		    return str;
		  }
		  char[] charArray = str.toCharArray();
		  char firstChar = charArray[0];
		  charArray[0] = charArray[str.length() - 1];
		  charArray[str.length() - 1] = firstChar;
		  return new String(charArray);
		}

	public static boolean icyHot(int temp1, int temp2) {
		return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
		}
	
	public static String endUp(String str) {
		  if (str.length() <= 3) return str.toUpperCase();
		  int cut = str.length() - 3;
		  String front = str.substring(0, cut);
		  String back  = str.substring(cut);  // this takes from cut to the end
		  
		  return front + back.toUpperCase();
		}

	public static String front22(String str) {
			  // First figure the number of chars to take
			  int take = 2;
			  if (take > str.length()) {
			    take = str.length();
			  }
			  
			  String front = str.substring(0, take);
			  return front + str + front;
			
		}
	
	public static String missingChar(String str, int n) {
		  return str.substring(0, n) + str.substring(n + 1);
		}
	
	public static boolean stringE(String str) {
		  int count = 0;
		  for (char c : str.toCharArray())
		  {
		   if (c == 'e')
		   {
		     count++;
		   }
		  }
		  return count >= 1 && count <= 3;
		}
	
	public static int max1020(int a, int b) {
		  
		if (b > a)
		  {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  if (a <= 20 && a >= 10)
		  {
		    return a;
		  }
		  if (b <= 20 && b >= 10)
		  {
		    return b;
		  }else{
		    return 0;
		  }
		}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (vacation == true || weekday == false)
		  {
		    return true;
		  }
		  return false;
		}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false))
		  {
		    return true;
		  }else{
		    return false;
		  }
		}

	public static boolean makes10(int a, int b) {
		  if(a == 10 || b == 10)
		  {
		    return true;
		  }
		  if(a + b == 10)
		  {
		    return true;
		    
		  }else{
		    return false;
		  }
		}
	

	public static void main(String[] args)
	{
		System.out.println(sumDouble(2,2));
		System.out.println(diff21(420));
		System.out.println(parrotTrouble(false, 6));
		System.out.println(frontBack("code"));
		System.out.println(icyHot(120, -1));
		System.out.println(endUp("Girly Boy"));
		System.out.println(front22("Lolita"));
		System.out.println(missingChar("Mitch", 0));
		System.out.println(stringE("hello"));
		System.out.println(max1020(11,19));
		System.out.println(sleepIn(false, true));
		System.out.println(monkeyTrouble(true,false));
		System.out.println(makes10(1,9));
	}

}