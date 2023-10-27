import java.util.HashMap;
import java.util.Map;

public class ImplimentOpr implements Operation{

    ATM atm = new ATM();
    Map<Double,String> miniStm = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :" + atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                miniStm.put(withdrawAmount, "Amount Withdrawn !!");
                System.out.println("Collect your Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println(" Insufficient Balance !!");
            }
        }else {
            System.out.println("Please Enter the Amount in Multiple of 500 ");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        miniStm.put(depositAmount,"Amount Deposited !!");
        System.out.println(depositAmount+ "Deposited Your Amount Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewStatement() {
        for (Map.Entry<Double,String> m:miniStm.entrySet() ){
            System.out.println(m.getKey()+" // "+m.getValue());
        }

    }
}
