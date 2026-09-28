class BinarySearch{
    public static int binarySearch(int arr[], int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==x){
                return m;
            }
        }
         if(arr[m]<x){
            l=m+1;
         }else{
            r=m-1;
            
         }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int x=30;
        int result=binarySearch(arr,x);
            System.out.println("Element found at index:"+result);
        }
        
    }
