import java.util.Scanner;

class Employee1{
    String surname, name, patronymic, position;
    int salary;
}
public class Firma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введите количество сотрудников => ");
        int kol=sc.nextInt();
        sc.nextLine();
        Employee1 []sotr=new Employee1[kol];

        System.out.println("Введите информацию о каждом сотруднике: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Employee1();

            System.out.print("Введите фамилию "+(i+1)+" сотрудника => ");
            sotr[i].surname= sc.nextLine();

            System.out.print("Введите его имя => ");
            sotr[i].name=sc.nextLine();

            System.out.print("Введите его отчество => ");
            sotr[i].patronymic=sc.nextLine();

            System.out.print("Введите его должность => ");
            sotr[i].position=sc.nextLine();

            System.out.print("Введите его оклад => ");
            sotr[i].salary=sc.nextInt();
            sc.nextLine();
        }

        System.out.println ("\nСотрудники фирмы: \n фам \t имя \t отч \t должность \t Оклад");
        for (Employee1 e : sotr) {
            System.out.println(e.surname + "\t" + e.name + "\t" + e.patronymic + "\t" + e.position + "\t\t" + e.salary);
        }
    }}