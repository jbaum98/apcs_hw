public class TwoD {
		public static void main(String[] args) {
				int[][] a;
				a = new int[5][3];
				System.out.println(a.length);
				System.out.println(a[0].length);

				a[4][1]=2;
				a[1][2]=9;

				for (int i = 0; i < a.length; i++) {
						for (int j = 0; j < a[i].length; j++) {
								System.out.print(a[i][j]+" ");
						}
						System.out.println();
				}

				System.out.println();
				System.out.println();
				a[2] = new int[30];
				
				for (int i = 0; i < a.length; i++) {
						for (int j = 0; j < a[i].length; j++) {
								System.out.print(a[i][j]+" ");
						}
						System.out.println();
				}

		}

}
