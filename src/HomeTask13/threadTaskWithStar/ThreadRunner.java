package HomeTask13.threadTaskWithStar;

import java.util.Scanner;

public class ThreadRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите start для запуска приложения");
		String startIn = sc.nextLine();

		if (startIn.equalsIgnoreCase("start")) {
			MyThreadSecond threadFirst = new MyThreadSecond("Thread 1");
			MyThreadSecond threadSecond = new MyThreadSecond("Thread 2");
			threadFirst.start();
			threadSecond.start();

		}

	}

}
