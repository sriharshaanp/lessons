/* Adding two arrays as two numbers */
import java.math.BigInteger;

public class AddingArrays{

protected static int[] addBig(int a[],int b[]){
    int max = Math.max(a.length,b.length);   
    int[] temp = new int[max];
    int cur = temp.length-1;
    int carry = 0,reminder =0;
    while(i>=0 && j>=0){
        int tempVal = a[i]+b[j];
        temp[cur] = carry + tempVal;
        reminder = tempVal%10;
        carry = tempVal/10;
        i--;
	    j--;
    }
    if(j>=0){
	    while(j>=0){
	        temp[cur] = carry + b[j];
	        j--;
            carry = tempVal/10;
	    }
	}
    return temp;
}

/* Returns only the final anwser as asingle variable. Assumption that always the shorter array
    is sent first and then the longer array. */
protected static double add(int a[],int b[]){
	int i = a.length-1;
	int j = b.length-1;
	System.out.println(i+","+j);
	int counter = 0;
	double finalSum = 0;
	while(i>=0 && j>=0){
	    finalSum = finalSum + (a[i]+b[j])*(Math.pow(10,counter));
	    counter++;
	    i--;
	    j--;
	}
	System.out.println("After adding :"+i+","+j);
	if(j>=0){
	    while(j>=0){
	        finalSum = finalSum + (b[j])*(Math.pow(10,counter));
	        j--;
	        counter++;
	    }
	}
	return finalSum;
}

public static void main(String args[]){
    //1. Best case where both are same size and small in size too
	int a1[] = {1,2,3,4};
	int b1[] = {1,2,3,4};
	//2. Different size and small in size
	int a2[] = {2,3,4};
	int b2[] = {1,2,3,4};
	//3. Different size and big in size
	int a3[] = {2,3,4};
	int b3[] = {1,2,3,4};
	System.out.println(addBig(a2,b2));
}

}