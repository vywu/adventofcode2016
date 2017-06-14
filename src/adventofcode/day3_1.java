package adventofcode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day3_1 {
	public static void main(String args[]) throws IOException{
		int count=0;
		BufferedReader br=new BufferedReader(new FileReader("input3.txt"));
		String line=br.readLine();
		while (line!=null){
			String[] sides=line.split("\\s+");
			int a=Integer.parseInt(sides[1]);
			int b=Integer.parseInt(sides[2]);
			int c=Integer.parseInt(sides[3]);
			line=br.readLine();
			if (Math.max(Math.max(a, b),c)==a){
				if(b+c>a)
					count++;
			}else{
				if (Math.max(Math.max(a, b),c)==b){
					if(a+c>b)
						count++;
				}else{
					if (Math.max(Math.max(a, b),c)==c){
						if(a+b>c)
							count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
