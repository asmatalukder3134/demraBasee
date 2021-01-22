package demra;

public class Loops {
	@Test
	public void max_smax() {
		int []a= {66,77,44,88,121};
		int max=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				smax=a[0];
			}else(smax>a[i]){
				smax=a[i];
			}
			System.out.println("max:"+""+max);
			System.out.println("smax:"+""+smax);
		}
		
		
	}
	
	


}
