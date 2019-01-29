package niehua.studyforjava;

import java.util.concurrent.*;

/**
 * Created by niehua.yang on 2019/1/16
 */
public class FutureTaskExample {

    public static void main(String[] args) {
        Callable callable1 = new MyCallable(3000);                       // 要执行的任务
        Callable callable2 = new MyCallable(4000);

        FutureTask<String> futureTask1 = new FutureTask<>(callable1);// 将Callable写的任务封装到一个由执行者调度的FutureTask对象
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(2);        // 创建线程池并返回ExecutorService实例
        executor.submit(futureTask1);  // 执行任务
        executor.submit(futureTask2);

        while (true) {
            try {
                if(futureTask1.isDone() && futureTask2.isDone()){//  两个任务都完成
                    System.out.println("Done");
                    executor.shutdown();                          // 关闭线程池和服务
                    return;
                }

                if(!futureTask1.isDone()){ // 任务1没有完成，会等待，直到任务完成
                    System.out.println("FutureTask1 output="+futureTask1.get());//产生阻塞，会一直等到任务执行完毕才返回；
                }

                System.out.println("Waiting for FutureTask2 to complete");
                String s = futureTask2.get(200L, TimeUnit.MILLISECONDS);//用来获取执行结果，如果在指定时间内，还没获取到结果，就直接返回null。
                if(s !=null){
                    System.out.println("FutureTask2 output="+s);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }catch(TimeoutException e){
                //do nothing
            }
        }
    }
}
