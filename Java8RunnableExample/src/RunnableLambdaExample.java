
public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		//Conventional way
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside run method - conventional thread");
			}
		});
		thread.start();
		System.out.println(thread.getName());
		
		//Using Lambda( this is possible because Runnable interface has only one method)
		Thread threadLambda = new Thread(() -> System.out.println("Inside Lambda thread"));
		threadLambda.start();
		System.out.println(threadLambda.getName());
	}

}
