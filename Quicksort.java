class Quicksort {
    public static void quicksort(int []a,int low,int high)
    {
        if(low<high)
        {
            int j=partition(a,low,high);
            quicksort(a, low, j);
            quicksort(a, j+1, high);
        }
    }
    public static int partition(int []a,int low,int high)
    {
        int pivot=a[low];
        int i=low,j=high,temp;
        while (i<j){
            do {
                i++;
            } while (a[i]<=pivot);
            do {
                j--;
            } while (a[j]>pivot);
            if (i<j) {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        int arr[]={6,5,8,9,3,10,15,12,16};
        quicksort(arr, 0, 8);
        System.out.println("output");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
