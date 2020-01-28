public class Selection {
    public static void sort(Comparable[] a)
    {
        int N = a.length;
        for(int i = 0; i < N; i++)
        {
            int min = i;
            for(int j = i + 1; j < N; j++)
            {
                if(less(a[j],a[min]))
                    min = j;
            }
            exch(a,i,min);
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable a[])
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSort(Comparable[] a)
    {
        for(int i = 0; i < a.length - 1; i++)
            if(less(a[i + 1], a[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = {1,3,3,26,43,532,23};
        sort(a);
        show(a);
        System.out.println(isSort(a));
    }
}
