package hello.springexternal.pay;

/**
 * 결제 기능 구현
 * 로컬 개발 환경: 가짜 결제 기능을 제공하는 스프링 빈을 등록
 * 운영 개발 환경: 실제 결제 기능을 제공하는 스프링 빈을 등록
 */
public interface PayClient {

    void pay(int money);
}
