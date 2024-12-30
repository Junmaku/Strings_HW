public class Main {
    public static void main(String[] args) {
        //Task 1
        String firstName = "Ivan";
        String secondName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = String.format("%s %s %s", secondName, firstName, middleName);
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        //Task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        //Task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}