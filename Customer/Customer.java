package Customer;

public class Customer {
    private int id;
    private long creditCardNumber,balance;
    private String firstName,lastName,patronymic;
    //конструктор без параметрів
    public Customer(){

    }
    //конструктор з параметрами
    public Customer(int id,String lastName, String firstName,String patronymic,long creditCardNumber, long balance){
        this.id=id;
        this.lastName=lastName;
        this.firstName=firstName;
        this.patronymic=patronymic;
        this.creditCardNumber=creditCardNumber;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName=lastName;
    }

    public String getPatronymic(){
        return patronymic;
    }
    public void setPatronymic(){
        this.patronymic=patronymic;
    }
    public long getCreditCardNumber() {
        return creditCardNumber;
    }
    public void setCreditCardNumber(){
        this.creditCardNumber=creditCardNumber;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(){
        this.balance=balance;
    }
    public String toString(){
        String result =String.format("id: %-3d Прізвище: %-15s Ім'я: %-15s По батькові:%-15s Номер кредитної картки:%20d Баланс: %d",id, lastName,firstName,patronymic,creditCardNumber,balance);
        return result;
    }

}