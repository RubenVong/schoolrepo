package first;

public class prog {

	public static void main(String[] args) {
		int[] random = {1,2,3,4,5,6,7,8,9,10,20,19,18,17,16,15,14,13,12,11};
		
		//for (int i = 0; i < random.length; i++) {
			//System.out.println("[" + i + "]: " + random[i]);
		//}
		for (int index = 0; index < random.length; index++) {
			System.out.printf("[&d]: %d\n", index, random[index]);
		}
		
	}

}
