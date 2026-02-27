package thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV4 implements BankAccount {

    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankAccountV4(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());
        // 잔고가 출금액보다 적으면 => return false
        // 잔고가 많으면 => return true

        lock.lock();

        try{
            log("[검증 시작] 출금액: "+amount+", 잔액: "+balance);
            if (amount > balance) {
                log("[검증 실패] 출금액: "+amount+", 잔액: "+balance);
                return false;
            }
            sleep(1000);    // 출금에 걸리는 시간
            balance -= amount;

            log("[출금 완료] 출금액: "+amount+", 잔액: "+balance);
        } finally {
            lock.unlock();
        }
        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        lock.lock();
        try{
            return balance;
        }
        finally {
            lock.unlock();
        }
    }
}
