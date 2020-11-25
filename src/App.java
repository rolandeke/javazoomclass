public class App {

    public static int answer = 100;

    //Main method that gets called during execution
    public static void main(String[] args){
      int x ;
      Person haja = new Person();
      haja.name = "Haja M. Abu";
      haja.age = 13;
      haja.gender = 'F';

      Person issa = new Person();
        issa.name = "Issa H. Kamara";
        issa.age = 11;
        issa.gender = 'M';
    }

    public static void GreetUser(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello how are you doing today?");
        }

    }

    public static void AddNumbers(int firstNumber, int secondNumber) {

         answer = firstNumber + secondNumber;
        System.out.println("Your answer is: " + answer);
    }

}
