public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        } 
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a) throws WithdrawException {
        if(a > 0 && (this.balance - a > 0)){
            this.balance -= a;
            System.out.println(a+" baht is withdrawn from "+name+"and your credit balance is "+credit+".");
        }
        else{
            if(this.balance - a + credit > 0){
                credit = (this.balance - a)+credit;
                this.balance = 0;
                System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+credit+".");
            }
            else{
                throw new WithdrawException("Account "+name+" has not enough money.");
            }
        }
    }
    //public void withdraw(String a) throws WithdrawException{
        //double b = Double.parseDouble(a);
      //  withdraw(b);
    //}
    @Override
    public String toString(){
        return "The "+this.name+" account has "+this.balance+" baht and "+credit+" credits.";
    }
}