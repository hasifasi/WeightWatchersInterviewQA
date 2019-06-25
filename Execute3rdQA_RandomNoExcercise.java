package ExcercieseInterviewWW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Execute3rdQA_RandomNoExcercise {

	public static void main(String[] args) {
		
		Random r= new Random();
		
		List<Integer> Randomnumbers = new ArrayList<Integer>();
		
		for (int i=0;i<499;i++){		
		Randomnumbers.add(r.nextInt(1000));
		}
		System.out.println("The 500 random numbers are :"+Randomnumbers);
		int temp=Randomnumbers.get(0);
		int index=0;
		for(int i=0;i<Randomnumbers.size();i++){
			
			if(temp>Randomnumbers.get(i)){
				temp=Randomnumbers.get(i);
				index=i;
			}
		}
		System.out.println("The value of smallest number is :"+temp);
		System.out.println("The index of smallest number from the array is :"+index);
		System.out.println("The nth smallest number is :"+(index+1));
	}

}
