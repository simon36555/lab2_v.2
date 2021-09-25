import java.util.Objects;

public class Abiturient {
    private int id;
    private String surname;
    private String name;
    private String SName;
    private String home;
    private String number;
    private String AverageScore;
Abiturient() {
}
Abiturient(int id,String surname,String name,String SName,String home,String number,String AverageScore){
    this.AverageScore=AverageScore;
    this.number = number;
    this.id = id;
    this.name = name;
    this.SName = SName;
    this.surname = surname;
    this.home = home;
}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", SName='" + SName + '\'' +
                ", home=" + home +
                ", number='" + number + '\'' +
                ", AverageScore=" + AverageScore +
                '}';
    }

    public String getAverageScore() {
        return AverageScore;
    }

    public String getHome() {
        return home;
    }

    public String getNumber() {
        return number;
    }

    public String getSName() {
        return SName;
    }

    public String getSurname() {
        return surname;
    }

    public void setAverageScore(String averageScore) {
        AverageScore = averageScore;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void CheckName(String CName){
    if(Objects.equals(CName, name)) {
        System.out.println("Abiturient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", SName='" + SName + '\'' +
                ", home=" + home +
                ", number='" + number + '\'' +
                ", AverageScore=" + AverageScore +
                '}');
    }
    }

    public void NewCheck(Abiturient s){
    System.out.println(s.name);
    }
    public void CheckAverageScore(String NewScore){
    if(NewScore.equals(AverageScore)){
        System.out.println("Abiturient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", SName='" + SName + '\'' +
                ", home=" + home +
                ", number='" + number + '\'' +
                ", AverageScore=" + AverageScore +
                '}');
        }
    }
    public static int compareBooks(Abiturient a , Abiturient b)
    {
        return a.AverageScore.compareTo(b.AverageScore);
    }

    }


