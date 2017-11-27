package java排序;

public class xuanze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a={6,4,2,8,1};
		
		for(int i=0;i<a.length-1;i++){
			int k=i;    ///k用来记录下标
			for(int j=k+1;j<a.length;j++){
				if(a[j]<a[k]){    //如果前一项比后一项大，那就记录下标
					k=j;//记录下标
				}
				
				
			}
			
			if(k!=i){
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
			}
		}
		
		for(int l=0;l<a.length;l++){
			System.out.println(a[l]);
		}
	}

}
