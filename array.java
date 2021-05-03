class array
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4}; // single dimentional array
        System.out.println(a[0]);
        int b[]= new int[3];
        for (int i=0; i<b.length; i++) // loop in java 
        System.out.println(a[i]);
        int c[][] =new int[3][4]; // two dimensional array
        c[][]= {{1,2,1,2},{1,2,3,4},{2,4,5,6}};
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            System.out.print(c[i][j]);
        }
    }
}