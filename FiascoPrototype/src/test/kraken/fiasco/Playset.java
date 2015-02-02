package test.kraken.fiasco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Playset {

	public static String parsePlayset()
	{
		
		File file = new File("C:\\FiascoPlaysets\\homeInvasion3.txt");
		Scanner input;
		try {
			String thisString = "";
			input = new Scanner(file);
			while(input.hasNext()) {
//			    String nextToken = input.next();
			    //or to process line by line
			    String nextLine = input.nextLine();
			    thisString = thisString +nextLine;
			    
			}

			input.close();
			String string = input.toString();
			return thisString;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			return "Reading file failed...";
	}
		 		 
	public static String[][] parseString(String string)
	{
		 Scanner sc = new Scanner(string).useDelimiter(",");
		    final int M = 144;
		    final int N = 5;
		    String[][] matrix = new String[M][N];
		    for (int r = 0; r < M; r++) {
		        for (int c = 0; c < N; c++) {
		            matrix[r][c] = sc.next();
		        }
		    }
		    System.out.println(Arrays.deepToString(matrix));
		    System.out.println(matrix[0][4]);
		    
		    return matrix;

	}
	
	public static List<String> showRelationships(String[][] playset, int dice)
	{
		System.out.println("here:" +playset.toString());
		List<String> results = new ArrayList<String>();
		for(int i = 0; i < 6;i++)
		{		
			System.out.println(playset[i][4]);
			results.add(playset[i][4]);
		}
		
		return results;
		
		
	}
	
	public static List<String> narrowDownRelationships (List<String> playset, int[] dicepool)
	{
		List<String> results = new ArrayList<String>();
		results = playset;
		System.out.println(Dice.dicePoolCounter(dicepool));
		System.out.println(playset.get(1));
		return results;
	
	}
}
