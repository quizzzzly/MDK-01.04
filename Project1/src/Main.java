public class Main{
    public static void main(String[] args) {
        Phone phone1 = new Phone("89103362517", "Redmi", 250);
        Phone phone2 = new Phone("89207456378", "Poco", 234);
        Phone phone3 = new Phone("89156637825", "Realme", 272);

        phone1.display();
        phone2.display();
        phone3.display();

        phone1.receiveCall("John");
        phone2.receiveCall("Piter");
        phone3.receiveCall("Gwen");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.receiveCall("John", phone1.getNumber());
        phone2.receiveCall("Piter", phone2.getNumber());
        phone3.receiveCall("Gwen", phone3.getNumber());

        phone1.sendMessage("Hello nigga", "87685634523");
        phone1.sendMessage("Hello", "87685765389");
        phone1.sendMessage("Hello guy", "89107564325");

        Person arnold = new Person("Arnold", 25);
        Person karl = new Person();

        arnold.PersonTalk();
        arnold.PersonMove();
        karl.PersonTalk();
        karl.PersonMove();
    }
}
class Phone{
    private String number;
    private String model;
    private int weight;
    Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(){

    }
    void display(){
        System.out.println("Number: " + number);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight);
    }

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number){

    }

    public String getNumber() {
        return number;
    }

    void sendMessage(String message, String number){
            System.out.println("На номер " + number + " отправлено сообщение: " + message);
        }
    }
class Person{
    private String fullName;
    private int age;

    public void PersonTalk(){
        System.out.println(fullName + " сказал ");
    }
    public void PersonMove(){
        System.out.println("я гей");
    }

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    Person(){

    }
}
