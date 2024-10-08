public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("Задание 1");

        String firstName = " Ivan" ;
        String middleName = " Ivanovich" ;
        String lastName = " Ivanov" ;
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задание 2");
        String small = "ivanov ivan ivanovich";
        System.out.println(small.toUpperCase());

        System.out.println("Задание 3");

        String fullNameRus = "Иванов Семён Семёнович";
        String fullNameRus2 = fullNameRus.replace('ё', 'е');
        System.out.println(fullNameRus2);




    }
}