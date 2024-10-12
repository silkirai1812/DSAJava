package BinarySearch;

public class Median2SortedArrays {
    public static void main(String[] args) {
        int[] a= {1,4,7,10,12};
        int[] b ={2,3,6,15};
        System.out.println(median(a,b));
    }

    static int median(int[] arr1, int [] arr2){
        int l1=arr1.length;
        int l2= arr2.length;
        int n = l1+l2;
        int ind1el = -1;
        int ind2el = -1;
        int cnt=0;
        int i=0, j=0;
            while(i<l1 && j<l2){
                if(arr1[i]<arr2[j]){
                    if(cnt==n/2){
                        ind2el = arr1[i];
                    }
                    if(cnt==n/2-1){
                        ind1el = arr1[i];
                    }
                    i++;
                    cnt++;
                }
                else{
                    if(cnt==n/2){
                        ind2el = arr2[j];
                    }
                    if(cnt==n/2-1){
                        ind1el = arr2[j];
                    }
                    j++;
                    cnt++;
                }
            }
            while(i<l1){
                if(cnt==n/2){
                    ind2el = arr1[i];
                }
                if(cnt==n/2-1){
                    ind1el = arr1[i];
                }
                i++;
                cnt++;
            }
            while(j<l2){
                if(cnt==n/2){
                    ind2el = arr2[j];
                }
                if(cnt==n/2-1){
                    ind1el = arr2[j];
                }
                j++;
                cnt++;
            }
        
        if(n%2==0){
            return (ind1el+ind2el)/2;
        }
        return ind2el;
    }
}
