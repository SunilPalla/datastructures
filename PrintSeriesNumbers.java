package ds;

public class PrintSeriesNumbers {

	public static void main(String[] args) {
		printSeries(1000000000);
	}

	private static void printSeries(int i) {
		try{
			StringBuilder sb = new StringBuilder();
			for(int j=1;j<=i;j++){
				sb.append(j);
			}
			System.out.println(sb.toString());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
