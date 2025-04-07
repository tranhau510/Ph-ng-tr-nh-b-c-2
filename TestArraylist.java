package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class TestArraylist {
	ArrayList <Integer> a;
	
	void Nhap(int n) {
		a = new ArrayList<>();
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			a.add(rd.nextInt(10));
		}
			
	}
	
	void In() {
		System.out.println("Nội dung danh sách là");
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i).toString() + " ");
			
		}
	}
	
	void DemLe() {
		int dem = 0;
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) % 2 != 0) {
				dem++;
			}
			
		}
		System.out.println("Số giá trị lẻ trong danh sách là: " + dem);
	}
	
	void TinhTong() {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		System.out.println("Tổng các phần tử trong mảng là: " + sum);
	}
	
	void Xoale() {
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) % 2 != 0) {
				a.remove(i);
				i--; 
			}
		}
	}
	
	ArrayList<Integer> TimViTriChuaGiaTriX(int x){
		ArrayList<Integer> vitri = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) == x) {
				vitri.add(i);
			}
		}
		System.out.println(vitri);
		return vitri;
	}
	
	public static void main(String[] args) {
		TestArraylist  mt = new TestArraylist ();
		mt.Nhap(10);
		mt.In();
		System.out.println("\n");
		mt.DemLe();
		mt.TinhTong();
		System.out.println("Mãng sau khi xóa lẻ");
		mt.Xoale();
		mt.In();
		mt.TimViTriChuaGiaTriX(5);
		
			
	}
	
}
