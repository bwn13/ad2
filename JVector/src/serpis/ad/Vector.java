package serpis.ad;

public class Vector {
	
	public static void main(String[] args) {
		
		int [] vector = new int [] {33,16,12,15,19};
		int minValue = min (vector);
		System.out.println("minValue="+ minValue);
		
	}
	
	
	
	public static int min(int[]v) {
		int minValue=v[0];
		for (int i=1; i< v.length; i++)
			if (v[i] < minValue)
				minValue=v[i];
		
		return minValue;
	
	}
}