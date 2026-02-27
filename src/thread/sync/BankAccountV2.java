package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV2 implements BankAccount {

    private int balance;

    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public synchronized boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());
        // 잔고가 출금액보다 적으면 => return false
        // 잔고가 많으면 => return true

        // == 임계영역 시작 ==
        log("[검증 시작] 출금액: "+amount+", 잔액: "+balance);
        if (amount > balance) {
            log("[검증 실패] 출금액: "+amount+", 잔액: "+balance);
            return false;
        }
        sleep(1000);    // 출금에 걸리는 시간
        balance -= amount;

        log("[출금 완료] 출금액: "+amount+", 잔액: "+balance);
        // == 임계영역 시작 ==

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
