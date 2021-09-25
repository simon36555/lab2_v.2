import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
       public static void main(String [] args){
        //Abiturient abiturient = new Abiturient(1,"Mykytiuk","Dmytro","Adriy","Sokal","55-66-77",80.2);
        //System.out.println(abiturient);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Abiturient> abitura=new ArrayList<>();
        Abiturient [] arr = new Abiturient[10];

        // -----------------------------------------------------------------------------------------------------------------------------------------
        abitura.add(new Abiturient(1,"Mykytiuk","Dmytro","Adriy","Sokal","55-66-77","80.2"));
        abitura.add(new Abiturient(2,"Skoropad","Dmytro","Stepan","Sokal","13-15-295","79"));
        abitura.add(new Abiturient(2,"Skoropad","Dmytro","Stepan","Sokal","13-15-295","80.152"));
        abitura.add(new Abiturient(2,"Skoropad","Dmytro","Stepan","Sokal","13-15-295","80.151"));
        abitura.add(new Abiturient(2,"Skoropad","Dmytro","Stepan","Sokal","13-15-295","80.1552"));
        abitura.add(new Abiturient(3,"Nelubin","Dmytro","Viktor","Sokal","546-95-55","80.1"));
        abitura.add(new Abiturient(4,"Gural","Oleksandr","Adriy","Sokal","458-154-4","85.3"));

        Abiturient [] abituraArray = new Abiturient[abitura.size()];
        abitura.toArray(abituraArray);
        for(int i = 0; i< abituraArray.length; i++) {
            System.out.println(abituraArray[i]);
        }
           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Checking on the name");
        System.out.println("Enter Name to check");
        String NameToCheck = scanner.nextLine();
        // Перевірка на Ім'я
           for (int i=0;i< abituraArray.length;++i) {
                     abituraArray[i].CheckName(NameToCheck);
           }
 //********************************************************************************************************************************************************************************
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter average score to check");
       String NewScore = scanner.nextLine();
        for (int i=0;i< abituraArray.length;++i){
         abituraArray[i].CheckAverageScore(NewScore);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Print amount of AverageScores to print");
        int AmountAverageScore;
        AmountAverageScore = scanner.nextInt();
        Arrays.sort(abituraArray, Abiturient::compareBooks);
        for (int i = 0; i < abituraArray.length / 2; i++) {
            Abiturient temp = abituraArray[i];
            abituraArray[i] = abituraArray[abituraArray.length - 1 - i];
            abituraArray[abituraArray.length - 1 - i] = temp;
        }
       for(int i = 0; i< AmountAverageScore; i++) {
            System.out.println(abituraArray[i]);

        }

    }
}
