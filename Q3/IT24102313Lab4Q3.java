import java.util.Scanner;
public class IT24102313Lab4Q3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int num=scanner.nextInt();
		System.out.println("Then num is:-" +" "+((num>0) ? "Positive" : (num<0) ? "Negative" : "zero"));
}
}