import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner scan = new Scanner(System.in);
        Book b = new Book();
        System.out.print("제목:");
        b.title = scan.nextLine();

        System.out.print("가격:");
        b.price = scan.nextInt(); // 30000 + 엔터

        scan.nextLine(); //버퍼 비우기(스트림 초기화)

        System.out.print("출판사:");
        b.company = scan.nextLine();

        System.out.print("저자:");
        b.author = scan.nextLine();

        System.out.print("페이지수:"); // 700 + 엔터
        b.page = scan.nextInt();

        scan.nextLine(); // 버퍼 비우기

        System.out.print("ISBN:");
        b.isbn = scan.nextLine();

        System.out.println(b.title + "\t" + b.price + "\t" + b.company + "\t" + b.author + "\t" + b.page + "\t" + b.isbn);

        scan.close();

    }
}
