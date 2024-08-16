package MultiThread;

// Ví dụ tạo ra nhiều thread:
// Sử dụng StreamParallel để có thể tạo ra nhiều thread chạy song song và sử lý các tác vụ.

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelThreads {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sử dụng parallel stream
        numbers.parallelStream()
                .forEach(number -> {
                    System.out.println("ParallelStream - Thread: " + Thread.currentThread().getName() + ", index thread: " + number);
                });

        // Hoặc bạn có thể thiết lập parallelism level cụ thể
        ForkJoinPool customThreadPool = new ForkJoinPool(4);
        customThreadPool.submit(() ->
                numbers.parallelStream()
                        .forEach(number -> {
                            System.out.println("ForkJoinPool - Thread: " + Thread.currentThread().getName() + ", index thread: " + number);
                        })
        ).join();
    }

}
