package parentchild;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a={1,2,4,5,7,8,3,10,6,9};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				while(a[i]>a[j]){
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
}
	}

}

