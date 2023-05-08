public class Account {
    private String id;
    private String name;
    private int balance;



    public Account(String id, String name){
        this.id =id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id =id;
        this.name = name;
        this.balance = balance;
    }


    public String getId() {
        return "\n******************Account ID******************\n"+id;
    }

    public String getName() {
        return "\n******************Account Owner Name******************\n"+name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount){
        System.out.println("\n******************Credit******************\n");
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(this.name+" you have withdraw : "+amount+"\nYour current balance : "+balance);
        }else{
            System.out.println("Invalid amount make sure that the amount less than or equal :"+balance);
        }
    }

    public void debit(int amount){
        System.out.println("\n******************Debit******************\n");
        if(amount > 0){
            balance += amount;
            System.out.println(this.name+" your account have received : "+amount+"\nYour current balance : "+balance);
        }else{
            System.out.println("Invalid amount make sure that the amount is larger than Zero !");
        }
    }

    public int transferTo(Account another, int amount){
        System.out.println("\n******************Transfer******************\n");
        if(amount > 0 && amount <=this.balance){
            System.out.println("Done you have transferred :"+ amount+ " To "+another.getName());
            this.credit(amount);
            another.debit(amount);
            return this.balance;
        }else{
            System.out.println("Invalid amount make sure that the amount is larger than Zero !");
            return this.balance;
        }
    }
    @Override
    public String toString(){
        return "\n******************Account Info******************\nOwner name :"+name+"\nAccount ID: "+id+"\nBalance : "+balance;
    }
}
