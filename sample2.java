class sample2 
{
  public static void main(String args[])
  {
    int a[][]= {{1,2,3},{4,5,3},{1,2,3}};
    int b[][]={{1,2,3},{4,5,6},{7,8,9}};
    int c[][]= new int[3][3];
    for (int i;i<3;i++)
    {
        for (int j;j<3;j++)
    {    c[i][j]=a[i][j]+b[i][j];
     
System.out.print(c[i][j]+" ");
    }
    System.out.println();
}
//int c=1,s=1;
//printf("the value of c =%d and s =%d",c,s );