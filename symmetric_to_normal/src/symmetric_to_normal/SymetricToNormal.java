package symmetric_to_normal;

public class SymetricToNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] symmetric = {0.13125, 0.77541, 0.99704, 1.65704, 1.85234, 2.57524, 2.65103, 3.35482, 3.52757, 4.41858};
		double[] symmetric = {0.25, 0.75, 1.25, 1.75, 2.25, 2.75, 3.25};
		
		double[] normal = new double[symmetric.length*2];
		normal[0] = 0;
		int normal_counter = 1;
		for (int i = symmetric.length - 1; i > 0 ; i--) {
			normal[normal_counter] = normal[normal_counter-1] + symmetric[i] - symmetric[i - 1];
			normal_counter++;
		}
		
		normal[normal_counter] = normal[normal_counter-1] + symmetric[0]*2;
		normal_counter++;
		
		for (int i = 1; i < symmetric.length; i++) {
			normal[normal_counter] = normal[normal_counter-1] + symmetric[i] - symmetric[i - 1];
			normal_counter++;
		}
		
		// print them
		for (int i = 0; i < normal.length; i++) {
			
			System.out.println(normal[i]);			
		}
		System.out.println("Deneme");
		
	}

}
