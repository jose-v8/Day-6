import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class functions {

    public static  void filteringList()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the sentence to filter out the strings starting with a");
        String input=inp.nextLine();
        System.out.println(input);

        String[] data=input.split(" ");

        Stream<String> datas=Arrays.stream(data).filter(n->!n.startsWith("a"));

        datas.forEach(n-> System.out.print(n+ " "));


    }

    public static void sortObjects()
    {

        class Person
        {
            String name;
            int age;
            int salary;

            Person(String name,int age,int salary)
            {
                this.name=name;
                this.age=age;
                this.salary=salary;
            }


        }

        ArrayList<Person> personArray =new ArrayList<Person>();

        personArray.add(new Person("Jeffey",20,450000));
        personArray.add(new Person("Jose",21,30000));
        personArray.add(new Person("Vijay",22,50000));


        Stream<Person> personStream = personArray.stream();
        personStream.sorted((p1, p2) -> p1.age - p2.age).forEach(person -> System.out.println("Name: " + person.name + ", Age: " + person.age));

    }

    public static void sumOfSquaresOfEven()
    {
        Scanner inp=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("The array created is ");
        int size=rand.nextInt(5,10);
        int[] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=rand.nextInt(1,10);
            System.out.print(arr[i]+ " ");
        }

        int sum = Arrays.stream(arr).boxed().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println("\nThe sum of the array os squares of all even numbers : "+ sum);




    }

    public static void predicateComposition()
    {
        Scanner inp=new Scanner(System.in);
        ArrayList<String> checkList =new ArrayList<String>();

        System.out.print("Enter the number of elements you want to enter :");
        int size=inp.nextInt();
        inp.nextLine();
        for (int i=0;i<size;i++)
        {
            System.out.print("\nEnter the element"+(i+1)+"). ");
            String input=inp.nextLine();
            checkList.add(i,input);
        }
        System.out.println("The array is :");
        for (String item: checkList)
        {
            System.out.print(item+" ");
        }
        System.out.println("\nThe elements which passed the contition length >5 and conitaining ha as substring is \n");
        Stream<String> streamlist = checkList.stream().filter(n->n.length()>5 && n.contains("ha"));
        streamlist.forEach(n-> System.out.println(n+" "));
    }

    public static void consumerInterface()
    {
//        usage of the Consumer interface
//        to print each element of a list of strings in uppercase.

        System.out.println("Enter a sentence");
        Scanner inp=new Scanner(System.in);
        String input=inp.nextLine();
        String[] data=input.split(" ");

        Consumer<String> upperCasePrint= in-> System.out.println(in.toUpperCase());
        Arrays.stream(data).forEach(upperCasePrint);

    }

    public static void areaCircleFunctionalInterface()
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the radius :");
        float rad=inp.nextFloat();


        Function<Float,Float> area= n->(float)3.14*n*n;
        System.out.println(area.apply(rad));


    }



}
