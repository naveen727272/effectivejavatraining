import java.util.*;
public class AccountDetails
{
    public static void getAccountDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account id: ");
        acc.setAccountId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type: ");
        acc.setAccountType(sc.nextLine());
        int b;
        do
        {
        System.out.println("Enter Balance");
        acc.setBalance(sc.nextInt());
        b=acc.getBalance();
        if(b<=0)
        System.out.println("Balance should be positive");
        }
        while(b<=0);
        return acc;
    }
    public static int getWithdrawAmount()
    {
        Scanner sc=new Scanner(System.in);
        int w;
        do
        {
            System.out.println("Enter amount to be withdrawn:");
            w=sc.nextInt();
            if(w<=balance)
            {
                balance=balance-w;
            }
          
        }
        while(w<=0);
        return w;
    }
    public static int interest()
    {
        Balance+=(Balance*rate/1200) 
    }
    public static void main(String[] args)
    {   AccountDetails obj = new AccountDetails();
       obj.getAccountDetails();
       obj.getWithdrawAmount();
    }
}