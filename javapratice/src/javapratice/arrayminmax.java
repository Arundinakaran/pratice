package javapratice;

public class arrayminmax {
	
	public static void main(String[] args) {

		 int xyz[][]= {{1,2,8}, {5,4,8} , {5,1,1}};
		 int max= xyz[0][0];

		 
		 for(int i=0;i<3;i++)
			 
		 {
			 for(int j=0;j<3;j++)
			 {
				 
				 if(xyz[i][j]>max)
				 {
					 max=xyz[i][j];
					 
				 }
			 }
			 
			 
		 }
		 
	System.out.println(max);
	
	}
	
	

}
