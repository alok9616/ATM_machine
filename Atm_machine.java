import java.util.Scanner;

class ATM{
    float balance;
    int pin=9616;
    public void cheakPin(){
        System.out.println("Enter your pin");
        Scanner sc =new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();

        }
        else{
            System.out.println("Enter a valid pin");
            
        }
    }
        public void menu(){
            System.out.println("Enter your choice:");
            System.out.println("1.cheak your balence:");
            System.out.println("2.withdraw money:");
            System.out.println("3.deposit money");
            System.out.println("4. change pin");
            System.out.println("5. Exit");
            Scanner sc =new Scanner(System.in);
            int opt=sc.nextInt();
            if(opt==1){
                cheakBalence();

            }
            else if (opt==2) {
                withdrawMoney();
            
                
            }  
            else if(opt==3){
                DepositMoney();
            }
            else if (opt==4){
                changePin();
            }
            else if(opt==5){
                return;
            }
            else{
                System.out.println("Enter a valid choice");
            }
        }
        public void cheakBalence(){
            System.out.println("balence:"+balance);
            menu();
        }
        public void withdrawMoney(){
            System.out.println("Enter your amount");
            Scanner sc = new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>balance){
                System.out.println("insufficient balence");
            }
            else{
                balance=balance-amount;
                System.out.println("money withdraw successfull");
            }
            menu();

        }
        public void DepositMoney(){
            System.out.println("Enter the money");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            System.out.println("money deposit successfull");
            balance=balance+amount;
            menu();

        }
        public void changePin(){
            System.out.println("Enter new pin");
            Scanner sc = new Scanner(System.in);
            int pin2=sc.nextInt();
            pin=pin*0+pin2;
            System.out.println("pin change successfull");
            menu();
        }
    }



public class Atm_machine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.cheakPin();
    }
}
