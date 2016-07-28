package HomeTask13.threadTask;

import java.util.Scanner;

public class ThreadRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите start для запуска приложения");
		String startIn = sc.nextLine();

		if (startIn.equalsIgnoreCase("start")) {
			MyThread threadFirst = new MyThread("Thread 1");
			MyThread threadSecond = new MyThread("Thread 2");
			threadFirst.start();
			threadSecond.start();

		}

	}

}
