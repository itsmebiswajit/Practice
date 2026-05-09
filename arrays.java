// Online Java Compiler

class Main {

    //BUBBLE SORT
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp; }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }



    //BINARY SEARCH
    public static int Binary_Search(int arr[], int k){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==k){
               return mid;  }
            else if(arr[mid]>k){
                right=mid-1;}
            else{
                left=mid+1; }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,9,21,30,76,88,100,23,42,62,1,91,33,43,98};
      
    }
}
