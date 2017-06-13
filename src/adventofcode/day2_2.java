package adventofcode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day2_2 {
	public static void main(String args[]) throws IOException{
		final String[] hex=new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E"};
		
		final int[][] pad=new int[][]{{0,0,1,0,0},{0,2,3,4,0},{5,6,7,8,9},{0,10,11,12,0},{0,0,13,0,0}};
		final int R=27;
		final int D=13;
		final int L=21;
		final int U=30;
		int current=5;
		int xaxis=2;
		int yaxis=0;
		BufferedReader br=new BufferedReader(new FileReader("input2.txt"));
		String line=br.readLine();
		while(line!=null){
		for(int i=0;i<line.length();i++){
			int dir=Character.getNumericValue(line.charAt(i));
			try{switch(dir){
			case R:
				if(pad[xaxis][yaxis+1]!=0){
//					System.out.print("moving right!");
					yaxis++;
					}
				break;
			case D:
				if(pad[xaxis+1][yaxis]!=0){
					xaxis++;
					}
				break;
			case U:
				if(pad[xaxis-1][yaxis]!=0){
					xaxis--;
					}
				break;
				
			case L:
				if(pad[xaxis][yaxis-1]!=0){
					yaxis--;
					}
				break;
			}}
			catch(ArrayIndexOutOfBoundsException exception)
			{
//				System.out.println(dir+"at"+i);
			}
//			System.out.print(pad[xaxis][yaxis]);
	}
	System.out.print(hex[pad[xaxis][yaxis]]);
	line=br.readLine();
		}
	
}
}
