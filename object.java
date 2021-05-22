class abc
{
    int a=5 ;
    void show()
    {
        System.out.println(a);
    }
}
    class object
{
    public static void main (String[] args)
    {
        abc ob1=new abc();          //defualt constructor 
        System.out.println(ob1.a);
       ob1.show();
      /*  int b;
        System.out.println(b);*/    //throwes an error
        
    }

}    
