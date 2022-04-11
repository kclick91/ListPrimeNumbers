import java.util.ArrayList;
import java.util.List;

public class Main {


    public static ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();


    public static void main(String[] args)
    {
        int count = 3;
        lists.add(new ArrayList<>());
        lists.get(0).add(2);
        //list primes up to stopping point
        int stoppingPoint = 100;
        int numberOfLists = 1;
        while (count < stoppingPoint)
        {
            boolean isPrime = true;
            for (int j = 0; j < numberOfLists; j++)
            {
                if ((count % lists.get(j).get(0)) == 0)
                {
                    isPrime = false;
                    lists.get(j).add(count);
                    break;
                }
                else
                {

                }
            }
            if(isPrime == true)
            {
                numberOfLists = numberOfLists + 1;
                lists.add(new ArrayList<>());
                lists.get(numberOfLists - 1).add(count);
                System.out.println(count + " is a prime.");
            }
            count = count + 1;
        }
        for(int i = 0; i < numberOfLists; i++)
        {
            for (int j = 0; j < lists.get(i).size(); j++)
            {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}
