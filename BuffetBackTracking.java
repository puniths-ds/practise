package programs;

public class BuffetBackTracking {
	static String[] food= {"idli","dosa","dhal","chapathi"};
	static int[] calories= {100,120,130,140};
	static int calorieslimit=200;
	
	public static void combinefoodcal(int Index,String CurrentPlate,int CurrentCalorie) {
		if (CurrentCalorie>calorieslimit) {
			return;
		}
		if (Index==food.length) {
			if (!CurrentPlate.isEmpty()) {
			System.out.println(CurrentPlate+"="+CurrentCalorie+"calories");
			}
			return;
		}
		combinefoodcal(Index+1,CurrentPlate+food[Index]+" ",CurrentCalorie+calories[Index]);
		
		combinefoodcal(Index+1,CurrentPlate,CurrentCalorie);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinefoodcal(0,"",0);
	}

}
