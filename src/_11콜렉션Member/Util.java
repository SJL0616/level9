package _11콜렉션Member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	public static Scanner sc = new Scanner(System.in);
	private static Util instance = new Util();
	private Util() {
	}
	
	public static Util getInstance() {
		return instance;
	}
	
	static int getIntVal(String showStr, int start, int end) {
		int val = -1;
		while(true) {
			System.out.println(showStr);
			int input = 0;
			try {
				input = sc.nextInt();
				sc.nextLine();
				if(input < start || input > end) {
					System.out.println(start +" ~ "+end +" 범위 내의 숫자를 입력하세요.");
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				sc.nextLine();
				continue;
			}catch(Exception e) {
				
			}
			val = input;
			break;
		}
		return val;
	}
	
	static String getStringVal(String showStr) {
		while(true) {
			System.out.println(showStr);
			String input = sc.nextLine();
			
			return input;
		}
		
	}
	
	static void FileSave(String fileName,String data) {
		String path = System.getProperty("user.dir") +"\\src\\"+ Util.getInstance().getClass().getPackageName()+"\\" + fileName;
		System.out.println(path);
		File file = new File(path);
		try (FileWriter fw = new FileWriter(file)){
			fw.write(data);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("파일이 저장되었습니다.");
	}
	
	
	static void FileLoad() {
		
		String DATA_DIRECTORY = System.getProperty("user.dir") +"\\src\\"+ Util.getInstance().getClass().getPackageName()+"\\";
		File dir = new File(DATA_DIRECTORY);
		String[] filenames = dir.list();
		String fileName = "";
		for (String filename : filenames) {
			if(filename.contains(".txt")) {
				fileName = filename;
				break;
			}
		}
		MemberDAO memberDAO = MemberDAO.getInstance();
		File file = new File(DATA_DIRECTORY + fileName);
		
		try (FileReader fr = new FileReader(file)){
			BufferedReader br = new BufferedReader(fr);
			int cnt = 10;
			String next = "";
			while((next = br.readLine()) != null) {
				String[] one = next.split("/");
				memberDAO.insertMember(one[0], one[1]);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("파일이 로드되었습니다.");
	}
}
