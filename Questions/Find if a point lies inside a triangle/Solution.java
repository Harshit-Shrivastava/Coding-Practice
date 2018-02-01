public class Solution{
	public static void main(String args[]){
		int x1 = 0;
		int y1 = 0;
		int x2 = 20;
		int y2 = 0;
		int x3 = 20;
		int y3 = 30;
		int x = 6;
		int y = 6;
		
		System.out.println(checkPresence(x1, y1, x2, y2, x3, y3, x, y));
	}
	
	static double calcArea(int x1, int y1, int x2, int y2, int x3, int y3){
		double area = Math.abs(((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2))) / 2.0);
		return area;
	}
	
	static boolean checkPresence(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y){
		double total = calcArea(x1, y1, x2, y2, x3, y3);
		
		double area1 = calcArea(x, y, x2, y2, x3, y3);
		double area2 = calcArea(x1, y1, x, y, x3, y3);
		double area3 = calcArea(x1, y1, x2, y2, x, y);
		
		if(total == (area1 + area2 + area3)){
			return true;
		}
		else{
			return false;
		}
	}
}