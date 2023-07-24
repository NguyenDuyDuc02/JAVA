/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.chuongtrinh;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Test {
    
    static ArrayList<MonHoc> dsmh = new ArrayList<>();
    static ArrayList<Khoa> dskhoa = new ArrayList<>();
    static ArrayList<GiangVien> dsgv = new ArrayList<>();
    static ArrayList<GiaoTrinh> dsgt = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    
    static void initKhoa() {
        dskhoa.add(new Khoa("K01", "CNTT"));
        dskhoa.add(new Khoa("K02", "QTKD"));
        dskhoa.add(new Khoa("K03", "DIEN"));
        dskhoa.add(new Khoa("K04", "CK"));
        dskhoa.add(new Khoa("K05", "OTO"));
    }
    
    static void initMonHoc() {
        dsmh.add(new MonHoc("MH01", "LT Hướng đối tượng", 3, 1700000, dskhoa.get(0)));
        dsmh.add(new MonHoc("MH02", "Xác xuất tính", 3, 1500000, dskhoa.get(2)));
        dsmh.add(new MonHoc("MH03", "Kỹ thuật cắt", 3, 1760000, dskhoa.get(3)));
        dsmh.add(new MonHoc("MH04", "Quản trị dịch vụ", 5, 2500000, dskhoa.get(1)));
        dsmh.add(new MonHoc("MH05", "Động cơ DOHC", 5, 2750000, dskhoa.get(4)));
    }
    
    static void initGiangVien() {
        dsgv.add(new GiangVien("GV01", "Vũ Thị Dương", "Nữ", "Thạc sĩ", "Giảng viên", "0976898532", "duongvt@gmail.com", 2007, dskhoa.get(0)));
        dsgv.add(new GiangVien("GV02", "Nguyễn Tuấn Tú", "Nam", "Thạc sĩ", "Giảng viên", "097623156", "tunt@gmail.com", 2010, dskhoa.get(2)));
        dsgv.add(new GiangVien("GV03", "Nguyễn Thanh Hải", "Nam", "Thạc sĩ", "Giảng viên", "084651387", "haint@gmail.com", 2013, dskhoa.get(3)));
        dsgv.add(new GiangVien("GV04", "Dương Thanh Nam", "Nam", "Thạc sĩ", "Giảng viên", "086433185", "namnt@gmail.com", 2008, dskhoa.get(1)));
        dsgv.add(new GiangVien("GV05", "Nguyễn Lan Anh", "Nữ", "Thạc sĩ", "Giảng viên", "0364945874", "lanlan@gmail.com", 2016, dskhoa.get(0)));
        dsgv.add(new GiangVien("GV06", "Vũ Minh Yến", "Nữ", "Thạc sĩ", "Giảng viên", "087613155", "yendhmt@gmail.com", 2009, dskhoa.get(0)));
        dsgv.add(new GiangVien("GV06", "Vũ Minh Yến", "Nữ", "Thạc sĩ", "Giảng viên", "087613155", "yendhmt@gmail.com", 2009, dskhoa.get(4)));
    }
    
    static void initGiaoTrinh() {
        ArrayList<GiangVien> dsGiangVien = new ArrayList<>();
        dsGiangVien.add(dsgv.get(0));
        dsGiangVien.add(dsgv.get(5));
        
        ArrayList<BienSoan> bienSoan = new ArrayList<>();
        bienSoan.add(new BienSoan(new Date(1,1,2022), new Date(5,6,2022), "Test noi dung bien soan", "Test ghi chu"));
        
        GiaoTrinh x = new GiaoTrinh("GT01", "LT Hướng đối tượng với Java", dsmh.get(0), dsgv.get(0), dsGiangVien, dskhoa.get(0), new Date(1,1,2022), new Date(4, 4, 2022));
        x.setBienSoan(bienSoan);
        GiaoTrinh x1 = new GiaoTrinh("GT02", "LT căn bản", dsmh.get(0), dsgv.get(1), dsGiangVien, dskhoa.get(1), new Date(10,10,2021), new Date(24, 12, 2021));
        x.setBienSoan(bienSoan);
        
        dsgt.add(x);
        dsgt.add(x1);
    }
    
    static void ghiKhoa() {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("Khoa.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(dskhoa);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void ghiMonHoc() {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("MonHoc.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(dsmh);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void ghiGiangVien() {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("GiangVien.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(dsgv);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void ghiGiaoTrinh() {
        FileOutputStream fo;
        ObjectOutputStream out;
        try {
            fo = new FileOutputStream("GiaoTrinh.txt");
            out = new ObjectOutputStream(fo);
            out.writeObject(dsgt);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        initKhoa();
        initMonHoc();
        initGiangVien();
        initGiaoTrinh();
        
        for (Khoa x : dskhoa) {
            System.out.println(x);
        }
        
        for (MonHoc x : dsmh) {
            System.out.println(x);
        }
        
        for (GiangVien x : dsgv) {
            System.out.println(x);
        }
        
        for (GiaoTrinh x : dsgt) {
            System.out.println(x);
        }
        
        ghiKhoa();
        ghiMonHoc();
        ghiGiangVien();
        ghiGiaoTrinh();
    }
    
}
