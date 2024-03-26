package hello.springexternal.pay;

import lombok.extern.slf4j.Slf4j;

/**
 * 운영 개발 환경
 * 실제 결제를 시도한다.
 */
@Slf4j
public class ProdPayClient implements PayClient {

    @Override
    public void pay(int money) {
        log.info("운영 결제 money={}", money);
    }
}
