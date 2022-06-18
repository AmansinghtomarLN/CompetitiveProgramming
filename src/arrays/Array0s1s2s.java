package arrays;

public class Array0s1s2s {

public static void main(String[] args) {
	
	int[] arr  = new int[] {0,1,2,1,0,2,2};
	
	sort012(arr, 0);
	CyclicRotateOfArrayClockWise.display(arr);
}

	public static void sort012(int a[], int n)
    {
        
    int aa=0,b=0,c =0;
    
    for(int i:a){
        if(i==0){
            aa++;
        }else if(i==1){
            b++;
        }else{
            c++;
        }
    }
    for(int i =0; i<aa; i++){
        a[i] = 0;
    }
        for(int i =0; i<b; i++){
        a[aa+i] = 1;
    }
    
       for(int i =0; i<c; i++){
        a[aa+b+i] = 2;
    }
    
    
    }
	

}
