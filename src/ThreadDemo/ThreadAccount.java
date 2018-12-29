package ThreadDemo;

// 模拟存取钱
public class ThreadAccount {
    private String name;
    private float amount;
    public ThreadAccount(String name,float amount){
        this.name = name;
        this.amount = amount;
    }
    // 存钱
    public void deposit(float amt){
        amount += amt;
    }

    // 取钱
    public void witheraw(float amt){
        amount -= amt;
    }

    // 当前账户金额
    public float getBalance(){
        return amount;
    }
}
