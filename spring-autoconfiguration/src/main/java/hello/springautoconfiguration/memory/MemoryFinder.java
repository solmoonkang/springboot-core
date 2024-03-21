package hello.springautoconfiguration.memory;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

/**
 * JVM에서 메모리 정보를 실시간으로 조회하는 기능이다.
 *
 * max는 JVM이 사용할 수 있는 최대 메모리를 의미한다.
 * total은 JVM이 확보한 전체 메모리를 의미한다.
 * free는 total 중에 사용하지 않은 메모리를 의미한다.
 * used는 JVM이 사용 중인 메모리를 의미한다.
 */
@Slf4j
public class MemoryFinder {

    public Memory get() {
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long used = total - free;

        return new Memory(used, max);
    }

    @PostConstruct
    public void init() {
        log.info("init memoryFinder");
    }
}
