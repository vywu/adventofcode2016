package adventofcode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day2 {
	public static void main(String args[]) throws IOException{
		final int R=27;
		final int D=13;
		final int L=21;
		final int U=30;
		int current=5;
		int xaxis=2;
		int yaxis=2;
		BufferedReader br=new BufferedReader(new FileReader("input2.txt"));
		String line=br.readLine();
		while(line!=null){
		for(int i=0;i<line.length();i++){
			int dir=Character.getNumericValue(line.charAt(i));
			switch(dir){
			case R:
				System.out.print("r");
				if(xaxis<3){
					current=current+1;
					xaxis++;
					}
				break;
			case D:
				System.out.print("d");
				if(yaxis<3){
					current=current+3;
					yaxis++;
				}
				break;
			case U:
				System.out.print("u");
				if(yaxis>1){
					current=current-3;
					yaxis--;
				}
				break;
			case L:
				System.out.print("l");
				if(xaxis>1){
					current=current-1;
					xaxis--;
				}
				break;
			}
	}
	System.out.println(current);
	line=br.readLine();
		}
	
}
}
