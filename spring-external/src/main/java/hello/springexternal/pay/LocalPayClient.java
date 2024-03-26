package hello.springexternal.pay;

import lombok.extern.slf4j.Slf4j;

/**
 * 로컬 개발 환경
 * 실제 결제를 진행하지 않는다.
 */
@Slf4j
public class LocalPayClient implements PayClient {

    @Override
    public void pay(int money) {
        log.info("로컬 결제 money={}", money);
    }
}
