package Day02;

import java.util.Scanner;

public class TshirtCompany {
    int count;
    String size;
    String color;
//Static block
    static{
        System.out.println("Print 50 white shirts");
    }
//Parametized
    TshirtCompany(int count,String size,String color){
        System.out.println("Count, Size and Color are displayed");
        //this
        this.count=count;
        this.size=size;
        this.color=color;
    }
    void costume(){
        System.out.println(count+" "+color+" "+size);
    }

    void yellow(){
        System.out.println("Print 10 Yellow color shirts");
    }
    void red(){
        System.out.println("Print 10 Red color shirts");
    }


    public static void main(String[] args){
        TshirtCompany shirt = new TshirtCompany(50, "M", "Black");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the color: ");
        String name = in.nextLine();
        System.out.println("color is: " + name);
        shirt.yellow();

        shirt.costume();
        shirt.red();

    }
}




