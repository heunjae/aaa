package JDBC2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.가입 2.조회");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.print("이름");
			String name = sc.next();
			System.out.print("나이");
			int age = sc.nextInt();
			System.out.print("전화번호");
			String tel = sc.next();
			System.out.print("고객번호");
			String memNum = sc.next();
			Member mem = new Member(name, age, tel, memNum);
			MemberDAO dao = new MemberDAO();
			dao.insert(mem);

		} else if (choice == 2) {
			System.out.print("고객번호");
			String memNum = sc.next();
			MemberDAO dao = new MemberDAO();
			Member m = dao.selectOne(memNum);
			System.out.println("이름/나이/전화번호/고객번호");
			System.out.println(m.getName()+ "/" + m.getAge() + 
					"/" + m.getTel() + "/" + m.getMemNum());
		}
	}

}
