public class operations {
    public static int mini(int a[], int n) {
        int i;
        int min = a[0];
        for (i=0;i<10;i++) {
            if(a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("Minimum mark:"+min);
        return 0;
    }

    public static int maxi(int a[], int n) {
        int i;
        int max = a[0];
        for (i=0;i<10;i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum mark:"+max);
        return 0;
    }

    public static int average(int a[], int n) {
        int i;
        int sum = 0;
        for(i=0;i<n;i++) {
            sum += a[i];
        }
        int avg = sum/n;
        System.out.println("Average:"+avg);
        return 0;
    }
}