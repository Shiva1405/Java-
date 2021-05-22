class abc
{
    private int a;
    void show()
    {
        System.out.println(a);
    }
}
class modifier {
    public static void main(String args[]) 
    {
        abc ob1= new abc();
        System.out.println(ob1.a); // throwes an error == a has private access in abc
        ob1.show();
    }  
}
