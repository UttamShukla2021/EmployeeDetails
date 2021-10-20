import java.util.Scanner;

class Book implements item{
    protected String name;
    protected String author;
    protected String publication;
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Name :");
        name=sc.nextLine();
        System.out.print("Enter Author Name :");
        author=sc.nextLine();
        System.out.print("Enter Publication :");
        publication=sc.nextLine();
    }
    public void show(){
        System.out.println("Book Name :"+name);
        System.out.println("Author :"+author);
        System.out.println("Publication :"+publication);
    }
}
