package hello.springautoconfiguration.memory;

import lombok.Getter;
import lombok.ToString;

/**
 * 사용 중인 메모리(used)가 최대 메모리(max)를 넘게 되면 메모리 부족 오류가 발생한다.
 */
@Getter
@ToString
public class Memory {

    private long used;  // 사용 중인 메모리를 의미

    private long max;   // 최대 메모리를 의미

    public Memory(long used, long max) {
        this.used = used;
        this.max = max;
    }
}
