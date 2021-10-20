import java.util.Scanner;

public class Library
{
    public static void main(String []args){
       item i;
       Book [] arr=new Book[4];
       for(int j=0;j<=arr.length;j++)
       arr[j].show();
       char x;
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<=4;j++){
            System.out.print("Book or DVD <b/d> ");
            x=sc.next().charAt(0);
            if(x=='b'){
                i=new Book();
                i.read();
               
            }
            else if(x=='d'){
                i=new Dvd();
                i.read();
               
                   
            }
   
        }
        
    }
}
