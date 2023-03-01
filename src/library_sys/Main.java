package library_sys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        int choice =0;

        while(choice !=3){

            System.out.println("Enter 1- for Student Registration \n Enter 2- To view Books \n Enter 3- for exit");
            choice =obj.nextInt();

            if (choice == 1) {
            Module1 obj1=new Module1();
                System.out.println("Enter student's name");
            obj1.name=obj.nextLine();obj1.name=obj.nextLine();
                System.out.println("Enter the father's name");
                obj1.fname=obj.nextLine();
                System.out.println("Enter university id");
                obj1.uni_id=obj.nextLine();
                System.out.println("Enter the User id");
                obj1.uid=obj.nextLine();
                System.out.println("In which semester do you study:");
                obj1.sem=obj.nextInt();
                System.out.println("Registration Success \n");


                obj1.getdata(obj1.name, obj1.fname, obj1.uid,obj1.uni_id,obj1.sem);
                obj1.setdata();
            }

            else if(choice ==2){
                Module2 obj2=new Module2();

                obj2.chemistry();
                obj2.physics();
                obj2.biology();

            }
            }


        }

    }
