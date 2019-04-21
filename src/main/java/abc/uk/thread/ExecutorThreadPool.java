package abc.uk.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorThreadPool implements Callable {
		
	public ExecutorThreadPool(String name) {
	
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ExecutorThreadPool my[] = {
				new ExecutorThreadPool("111"),
				new ExecutorThreadPool("222"),
				new ExecutorThreadPool("333"),
				new ExecutorThreadPool("444"),
				new ExecutorThreadPool("555")
				};
		
		
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		for(ExecutorThreadPool m: my) {
			Future<String> f = ex.submit(m);
		}
		
		ex.shutdown();
		

	}

	@Override
	public Object call() throws Exception {
		
		System.out.println(" job started by thread "+Thread.currentThread().getName());
		Thread.sleep(5000);
		System.out.println(" job completed by thread "+Thread.currentThread().getName());
		return Thread.currentThread().getName();
	}

}
