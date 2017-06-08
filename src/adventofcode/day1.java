package adventofcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day1 {
	public static void main(String args[]) throws IOException
	{
		boolean[][] table=new boolean[2000][2000];

		final int NORTH=1;
		final int EAST=2;
		final int SOUTH=3;
		final int WEST=4;
		int result;
		int curStatus=1;
		int xAxis=0;
		int yAxis=0;
		int xOri=0;
		int yOri=0;
		String ins;
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(new FileReader("input1.txt"));
		String line=br.readLine();
	
			String[] tokens=line.split(", ");
			for(int i=0;i<tokens.length;i++){
				ins=tokens[i];
				System.out.println(ins);
				int distance=Integer.parseInt(ins.substring(1,ins.length()));
				switch(curStatus){
				case NORTH:
					xOri=xAxis;
					System.out.println("north");
					if (ins.charAt(0)=='R'){
						//update the current location 
						xAxis+=distance;
						curStatus=EAST;
					}
					else{
						
						xAxis-=distance;
						curStatus=WEST;
					}

					
					if (xOri>xAxis){
						for(int x=xOri;x>xAxis;x--){
							if(table[x+1000][yAxis+1000]!=true)
								{table[x+1000][yAxis+1000]=true;}
							else
								{if(x==xOri){result=Math.abs(xOri)+Math.abs(yAxis);System.out.println(result);
								System.exit(0);}
								result=Math.abs(x)+Math.abs(yAxis);
								System.out.println(result);
								System.exit(0);}}}
					else{
					for(int x=xOri;x<xAxis;x++){
						if(table[x+1000][yAxis+1000]!=true)
						{table[x+1000][yAxis+1000]=true;}
						else
							{
							if(x==xOri){result=Math.abs(xOri)+Math.abs(yAxis);System.out.println(result);
							System.exit(0);}
							result=Math.abs(x)+Math.abs(yAxis);
							System.out.println(result);
							System.exit(0);}
							
					}}
					break;
				case EAST:
					yOri=yAxis;
					System.out.println("east");
					if(ins.charAt(0)=='R'){
						
						yAxis-=distance;
						curStatus=SOUTH;
					}
					else{
						yAxis+=distance;
						curStatus=NORTH;
					}
					
					if (yOri>yAxis){for(int y=yOri;y>yAxis;y--){
						if(table[xAxis+1000][y+1000]!=true)
						{table[xAxis+1000][y+1000]=true;}
					else
						{if(y==yOri){result=Math.abs(xAxis)+Math.abs(yOri);System.out.println(result);
						System.exit(0);}
						result=Math.abs(xAxis)+Math.abs(y);
						System.out.println(result);
						System.exit(0);}}}
					else{
					for(int y=yOri;y<yAxis;y++){
						if(table[xAxis+1000][y+1000]!=true)
							{table[xAxis+1000][y+1000]=true;}
						else
							{
							if(y==yOri){result=Math.abs(xAxis)+Math.abs(yOri);System.out.println(result);
							System.exit(0);}
							result=Math.abs(xAxis)+Math.abs(y);
							System.out.println(result);
							System.exit(0);}
							
					}}
					break;
				case SOUTH:
					xOri=xAxis;
					System.out.println("south");
					if(ins.charAt(0)=='R'){
						xAxis-=distance;
						curStatus=WEST;
					}
					else{
						xAxis+=distance;
						curStatus=EAST;
					}
					
					
					if (xOri>xAxis){for(int x=xOri;x>xAxis;x--){
						if(table[x+1000][yAxis+1000]!=true)
						{table[x+1000][yAxis+1000]=true;}
					else
						{
						if(x==xOri){result=Math.abs(xOri)+Math.abs(yAxis);System.out.println(result);
						System.exit(0);}
						result=Math.abs(x)+Math.abs(yAxis);
						System.out.println(result);
						System.exit(0);}}}
					else{
					for(int x=xOri;x<xAxis;x++){
						if(table[x+1000][yAxis+1000]!=true)
						{table[x+1000][yAxis+1000]=true;}
						else
							{
							if(x==xOri){result=Math.abs(xOri)+Math.abs(yAxis);System.out.println(result);
							System.exit(0);}
							result=Math.abs(x)+Math.abs(yAxis);
							System.out.println(result);
							System.exit(0);}
							
					}}
					break;
				case WEST:
					yOri=yAxis;
					System.out.println("west");
					if(ins.charAt(0)=='R'){
						yAxis+=distance;
						curStatus=NORTH;
					}
					else{
						yAxis-=distance;
						curStatus=SOUTH;
					}
					///////////
					
					if (yOri>yAxis){for(int y=yOri;y>yAxis;y--){
						if(table[xAxis+1000][y+1000]!=true)
						{table[xAxis+1000][y+1000]=true;}
					else
						{
						if(y==yOri){result=Math.abs(xAxis)+Math.abs(yOri);System.out.println(result);
									System.exit(0);}
						result=Math.abs(xAxis)+Math.abs(y);
						System.out.println(result);
						System.exit(0);}}}
					else{
					for(int y=yOri;y<yAxis;y++){
						if(table[xAxis+1000][y+1000]!=true)
							{table[xAxis+1000][y+1000]=true;}
						else
							{
							if(y==yOri){result=Math.abs(xAxis)+Math.abs(yOri);System.out.println(result);
							System.exit(0);}
							result=Math.abs(xAxis)+Math.abs(y);
							System.out.println(result);
							System.exit(0);}
							
					}}
					break;
				}
				
	
			
			
		}
	}
	

}
