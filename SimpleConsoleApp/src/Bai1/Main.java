package Bai1;import java.util.*;public class Main {  public static void main(String[] args) {    Scanner sc = new Scanner(System.in);    List<Integer> list = new ArrayList<>();    while (true) {      System.out.println("**********************MENU*********************");      System.out.println("1.Nhap danh sach gom n so nguyen");      System.out.println("2. Hien thi danh sach ra man hinh");      System.out.println("3. Hien thi danh sach sap xep tang dan");      System.out.println("4. Thoat");      System.out.print("Lua chon: ");      int choice = Integer.parseInt(sc.nextLine());      switch (choice) {        case 1:          System.out.print("Nhap n: ");          int n = Integer.parseInt(sc.nextLine());          for (int i = 0; i < n; i++) {            System.out.printf("Nhap vao so thu %s: ", i+1);            list.add(Integer.parseInt(sc.nextLine()));          }          break;        case 2:          for (Integer i : list) {            System.out.print(i +" ");          }          System.out.println();          break;        case 3:          Collections.sort(list, new Comparator<Integer>() {            @Override            public int compare(Integer o1, Integer o2) {              return o1 - o2;            }          });          for (Integer i : list) {            System.out.print(i + " ");          }          System.out.println();          break;        case 4:          System.out.println("Bye!!!");          System.exit(0);        default:          System.out.println("Chon tu 1-4 !");      }    }  }}