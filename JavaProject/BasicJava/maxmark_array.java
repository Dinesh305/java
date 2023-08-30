package JavaProject.BasicJava;

public class maxmark_array {
    public static void main(String args[])
    {
       System.out.println("welcome to the loop");
       int[] mark={23,45,76,98,24};
       int i =0;
       int max=0;
       while(i<mark.length)
       {
           if(mark[i]>max)
               max=mark[i];
             //System.out.println(mark[i]);
                i++;
       }
       System.out.println(max);
    }
}
