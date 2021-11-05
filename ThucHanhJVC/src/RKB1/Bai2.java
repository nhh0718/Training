package RKB1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    ArrayList<NhanVien> listNv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String input;
    do {
      NhanVien nv = new NhanVien();
      System.out.print("Nhap vao ten nhan vien: ");
      do{
        String name = sc.nextLine();
        if(!name.matches("[a-z A-Z]+")){
          System.out.println("Ten khong duoc chua so. Nhap lai");
        } else {
          nv.setName(name);
          break;
        }
      } while(true);
      System.out.println("Nhap tuoi nhan vien: ");
      do{
        try{
          nv.setAge(Integer.parseInt(sc.nextLine()));
          break;
        } catch(NumberFormatException ex){
          System.out.println("Vui long nhap so !");
        }
      } while (true);
      System.out.println("Nhap vao so dien thoai:");
      do{
        String sdt = sc.nextLine();
//        try{
//          long SDT = Long.parseLong(sdt);
//        } catch (NumberFormatException ex){
//          System.out.println("khong nhap chu, nhap lai di");
//          continue;
//        }
        if(sdt.matches("[0-9]+")){
          if(sdt.startsWith("0")){
            if(sdt.length() == 10){
              nv.setPhoneNumber(sdt);
              break;
            } else {
              System.out.println("sdt phai co 10 so, vui long nhap lai.");
            }
          }
          else {
            System.out.println("Sdt phai bat dau bang 0. Nhap lai");
          }
        }
        else {
            System.out.println("khong nhap chu, nhap lai di");
        }
      } while(true);
      System.out.println("Nhap vao dia chi: ");
      nv.setAddress(sc.nextLine());
      listNv.add(nv);
      System.out.println("Ban co muon nhap tiep?");
      input = sc.nextLine();
    } while (!"KHONG".equalsIgnoreCase(input));
    for (NhanVien nv : listNv) {
      System.out.printf("Ten: %s - Tuoi: %d - SDT: %s - Dia chi: %s\n", nv.getName(), nv.getAge(), nv.getPhoneNumber(), nv.getAddress());
    }
  }
}
