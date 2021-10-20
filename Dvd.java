import java.util.Scanner;

class Dvd implements item{
    protected String title;
    protected String director;
    protected String category;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Title :");
        title=sc.nextLine();
        System.out.print("Enter Director Name :");
        director=sc.nextLine();
        System.out.print("Enter Category :");
        category=sc.nextLine();
    }
    public void show(){
        System.out.println("Title :"+title);
        System.out.println("Director :"+director);
        System.out.println("Category :"+category);
    }
}
