
public class Recapt_demo2 {
	public static void main(String[] args) {
	double[] myList = {1.2,3.4,5.6};
	double total= 0;
	double max =myList[0];
	for(double number:myList ) {  //number hepsi üzerinden geçiyor myList de ram üzerinde geziniyor
		System.out.println(number);
		total+=number;
		System.out.println(total);
		
		if(max<number) {
		
		max=number;
		
	}

	System.out.println(max);	
}
}}