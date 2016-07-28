package HomeTask13.threadTask;

public class MyThread extends Thread {
	private String threadName;
	private static final Object block = new Object();
	
	public MyThread(String threadName) {
		super(threadName);
		this.threadName = threadName;
	}

	public void run() {
		int count = 0;

		while (count < 100) {
			synchronized (block) {
				System.out.print(getName() + ":");
				for (int i = count + 1; i <= count + 10; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				count += 10;
		//не обязательная часть, но перемешивание происходит более наглядно		
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
