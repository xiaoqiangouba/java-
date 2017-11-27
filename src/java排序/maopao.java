package java排序;

public class maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] a={6,2,4,8,1};
      for(int i=0;i<a.length-1;i++){
    	  for(int j=0;j<a.length-i-1;j++){
    		  if(a[j]>a[j+1]){
    			  int temp=a[j];
    			  a[j]=a[j+1];
    			  a[j+1]=temp;
    		  }
    	  }
      }
      for(int l=0;l<a.length;l++){
			System.out.println(a[l]);
		}
	}

}
