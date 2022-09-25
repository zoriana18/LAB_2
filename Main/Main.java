package Main;

import Customer.Customer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer[] customers = createArray();
        FirstNameCheck(customers);
        CreditCardCheck(customers);
        BalanceCheck(customers);


    }
    //метод створення масиву об'єктів класу Customer
    static Customer[] createArray(){
        return new Customer[]{
                new Customer(1,"Антоненко","Павло", "Андрійович", 4937546621809898l,15000),
                new Customer(2,"Павлюк","Софія", "Володимирівна", 4930451770361543l,-1500),
                new Customer(3,"Микитюк","Ярослава", "Романівна", 4261038339216951l,6800),
                new Customer(4,"Кравчук","Віра", "Олексіївна", 4069336153848443l,500),
                new Customer(5,"Бондаренко","Володимир", "Іванович", 4079593530953894l,2000),
                new Customer(6,"Романченко","Вадим", "Володимирович", 4761440312627176l,-100),
                new Customer(7,"Шинкаренко","Анастасія", "Федорівна", 4971695724898519l,1700),
                new Customer(8,"Пономаренко","Микола", "Євгенович", 4491039308633490l,-500),
                new Customer(9,"Захарчук","Володимир", "Олександрович", 4690301570233642l,4300),
                new Customer(10,"Середа","Олександра", "Іванівна", 4019873477492079l,-10),
        };
    }
    //метод для знаходження клієнтів із заданим іменем
    static void FirstNameCheck(Customer[] customers){
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть ім'я:");
        String name= input.nextLine();
        int count=0;
        for(int i=0;i<customers.length;i++){
            if(name.equals(customers[i].getFirstName())){
                System.out.println(customers[i].toString());
                count++;
            }
        }
        if(count==0){
            System.out.println("Немає покупців з таким іменем");
        }

    }
    //метод для знаходження  покупців, у яких номер кредитної картки знаходиться в заданому інтервалі
    static void CreditCardCheck(Customer[] customers){
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть нижню межу  діапазону:");
        long lower= input.nextLong();
        System.out.print("Введіть верхню межу діапазону:");
        long upper= input.nextLong();
        int count=0;
        System.out.println("Покупці, у яких номер картки знаходиться в заданому діапазоні");
        for(int i=0;i<customers.length;i++){
            if(customers[i].getCreditCardNumber()>=lower &&customers[i].getCreditCardNumber()<=upper){
                System.out.println(customers[i].toString());
                count++;
            }
        }
        if(count==0){
            System.out.println("Немає покупців з таким номером кредитної картки");
        }
    }
    //метод для знаходження покупців, які мають заборгованість
    static void BalanceCheck(Customer[] customers){
        int count=0;
        System.out.println("\n Покупці , у яких є заборованість:");
        for(int i=0;i<customers.length;i++){
            if(customers[i].getBalance()<0){
                System.out.println(customers[i].toString());
                count++;
            }
        }
        if(count==0){
            System.out.println("\nНемає покупців із заборговоностями .");
        }else{
            System.out.println("\nКількість:"+count);
        }
    }

}