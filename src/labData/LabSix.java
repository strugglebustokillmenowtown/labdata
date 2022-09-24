package labData;
import java.util.Stack;
import java.util.Scanner;
public class LabSix{

    public static int sum1toN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum1toN(n - 1);
        }
    }
    public static void main(String[] args) {
		String test_sum = sum1toN(5) == 15 ? "pass" : "fail";
		System.out.println("Result: (5) == 15 ?" + test_sum);
		
		
	}
}

/* public class LabSix {
    static int multiplication(int numOne, int numTwo){      
          if (numOne == 0)      
            return 0;      
          else      
            return(numTwo + multiplication(numOne-1, numTwo));      
    } 
    
	public static void main(String[] args) {
		String test_mul1 = multiplication(3, 4) == 12 ? "pass" : "fail";
        String test_mul2 = multiplication(4, 3) == 12 ? "pass" : "fail";
        String test_mul3 = multiplication(0, 5) == 0 ? "pass" : "fail";
        String test_mul4 = multiplication(5, 0) == 0 ? "pass" : "fail";
        System.out.println("Result: (3, 4) == 12 ?" + test_mul1);
        System.out.println("Result: (4, 3) == 12 ?" + test_mul2);
        System.out.println("Result: (0, 5) == 0 ?" + test_mul3);
        System.out.println("Result: (5, 0) == 0 ?" + test_mul4);
		
		
	}
}
 */
/*public class LabSix{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        if(find(1,s)==true){
            System.out.println("1 is in the stack");
        }
        else System.out.println("1 is NOT in the stack");

        if(find(4,s)==true){
            System.out.println("4 is in the stack");
        }
        else System.out.println("4 is NOT in the stack");

    }
    public static boolean find(int target,Stack<Integer> s){
//temp stack
        Stack<Integer> temp=s;
        while(temp.empty()==false){
        	//if top element matches value we return true if not we pop top element
            if(temp.peek()==target) return true;
            else temp.pop();
        }
        //when the element is not found it returns false
        return false;
    }
} */