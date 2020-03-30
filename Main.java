public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccontObject1 = new SavingsAccount("Sean Murphy", 123456, 1000);
        System.out.println(     savingsAccontObject1.getAccBal()      );
        savingsAccontObject1.setAccBal(1250);
        
        // Print out results
        System.out.println(     savingsAccontObject1.getAccHolderName() );
        System.out.println(     savingsAccontObject1.getAccNo()         );
        System.out.println(     savingsAccontObject1.getAccBal()        );

    }
}