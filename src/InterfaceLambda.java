import java.util.Scanner;

@FunctionalInterface
interface sumOfTwo{
    int sum(int a,int b);
}

public class InterfaceLambda {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        System.out.println("Please choose the program");

        System.out.println("1). sum");
        System.out.println("2). Filtering a List of string starting with letter A");
        System.out.println("3). Sorting a List of Objects:");
        System.out.println("4). the sum of squares of all even numbers using a map and reduce operations with lambda expressions.");
        System.out.println("5).  filter a list of strings based on multiple conditions such as length greater than 5 and containing a specific substring using Predicate composition");
        System.out.println("6). print each element of a list of strings in uppercase.");
        System.out.println("7). Find area of the circle");

        System.out.println("0). Terminate the program");

        System.out.println("Enter your choice");
        int choice=inp.nextInt();

        switch (choice)
        {


            case 1->
            {
                System.out.print("\nEnter the first number : ");
                int n1=inp.nextInt();
                System.out.print("\nEnter the second number : ");
                int n2=inp.nextInt();
                sumOfTwo obj=(a,b)->a+b;
                System.out.println("The output is "+obj.sum(n1,n2));
            }

            case 2->{functions.filteringList();}
            case 3->{functions.sortObjects();}
            case 4->{functions.sumOfSquaresOfEven();}
            case 5->{functions.predicateComposition();}
            case 6->{functions.consumerInterface();}
            case 7->{functions.areaCircleFunctionalInterface();}


            case 0->{return;}
        }




    }
}
