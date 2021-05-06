public class string {
    public static void main(String[] args)
{
    String s = new String("hello world bye");
    String m = new String("he");
    System.out.println(s);
    System.out.println(s.charAt(6)); // prints the character at the given index 
    System.out.println(s.substring(4,7)); // range lies between i and j-1.
    System.out.println(s.concat(m));// concat function conCATENATES TWO STRINGS 
    System.out.println(s.indexOf("world"));//return the index of the string 
    StringBuffer sb = new StringBuffer("helloworld");
    System.out.println(sb.length()); // prints the length of the string buffer
    System.out.println(sb.capacity());// prints the total capicity of the string buffer 

}

}