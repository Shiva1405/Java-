class abc
{
    int i=5;
    void show()
    {
        System.out.println("Hello");
        System.out.println("i="+i);
    }

}
class sample
{
    public static void main(String args[])
    {
        abc ob =new abc();
        ob.show();
        System.out.println(ob.i);
    }
}