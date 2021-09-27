import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
       public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Abiturient> abiturient=new ArrayList<>();
        // -----------------------------------------------------------------------------------------------------------------------------------------
        abiturient.add(new Abiturient(1,"Mykytiuk","Dmytro","Adriy","Sokal","55-66-77","80.2"));
        abiturient.add(new Abiturient(2,"Konoplyanka","Yevghen","Pomanovych","Odessa","13-15-295","79"));
        abiturient.add(new Abiturient(2,"Petrenko","Mykola","Stepanovych","Lviv","13-57-247","80.152"));
        abiturient.add(new Abiturient(2,"Yaremchuk","Roman","Viktorovych","Lviv","16-78-148","80.151"));
        abiturient.add(new Abiturient(2,"Yarmolenko","Andriy","Ivanovych","Kyiv","45-45-689","80.1552"));
        abiturient.add(new Abiturient(3,"Pyatov","Andriy","Petrovych","Donetsk","56-87-894","80.1"));
        abiturient.add(new Abiturient(4,"Popov","Dmytro","Andriyovych","Cherkassy","74-86-75","85.3"));

        Abiturient [] abiturientArray = new Abiturient[abiturient.size()];
        abiturient.toArray(abiturientArray);
           for (Abiturient item : abiturientArray) {
               System.out.println(item);
           }
           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Checking on the name");
        System.out.println("Enter Name to check");
        String NameToCheck = scanner.nextLine();
        // Перевірка на Ім'я
           for (Abiturient value : abiturientArray) {
               value.CheckName(NameToCheck);
           }
 //********************************************************************************************************************************************************************************
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter average score to check");
       float NewScore = scanner.nextFloat();
           for (Abiturient value : abiturientArray) {

               value.CheckAverageScore(NewScore);
           }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Print amount of AverageScores to print");
        int AmountAverageScore;
        AmountAverageScore = scanner.nextInt();
        Arrays.sort(abiturientArray, Abiturient::compareAbiturients);
        for (int i = 0; i < abiturientArray.length / 2; i++) {
            Abiturient temp = abiturientArray[i];
            abiturientArray[i] = abiturientArray[abiturientArray.length - 1 - i];
            abiturientArray[abiturientArray.length - 1 - i] = temp;
        }
       for(int i = 0; i< AmountAverageScore; i++) {
            System.out.println(abiturientArray[i]);

        }

    }
}
