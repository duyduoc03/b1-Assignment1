package JP2.sesstion1.Assignment1;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class main extends Application {
    public final static String connectionString = "jdbc:mysql://localhost:3306/thuviendaihocfpt";
    public final static String user = "root";
    public final static String password = "";
    public static ObservableList<Book> BookList = FXCollections.observableArrayList();
    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
        primaryStage.setTitle("Thư Viện Đại Học FPT");
        primaryStage.setScene(new Scene(root, 1200, 850));
        primaryStage.show();
    }

    public static void main(String[] args){
        try {
            // goi driver
            Class.forName("com.mysql.jdbc.Driver");
            // tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            // khai bao Statement de truy van sql
            Statement stt = conn.createStatement();
            // truy van sql
            String qls = "select * from quanlysach";
            String qltv = "select * from quanlythanhvien";
            String qlms = "select * from quanlymuonsach";

//            //insert in quanlysach
//            String insert_qls = "insert into quanlysach(TenSach,LoaiSach) values('Java','season2')";
//            stt.execute(insert_qls);
//
//            //insert in quanlythanhvien
//            String insert_qltv = "insert into quanlythanhvien(TenTV,Tuoi) values('Le Minh Huy',19)";
//            stt.execute(insert_qltv);
//
//            //insert in quanlymuonsach
//            String insert_qlms = "insert into quanlymuonsach(MaSach,MaTV,SoLuong) values(1,1,20)";
//            stt.execute(insert_qlms);

            ResultSet rs = stt.executeQuery(qls);
            System.out.println("In tabble quanlysach");
            while (rs.next()){
                System.out.println(rs.getInt("MaSach"));
                System.out.println(rs.getString("TenSach"));
                System.out.println(rs.getString("LoaiSach"));
            }
            ResultSet rs2 = stt.executeQuery(qltv);
            System.out.println("---------------------------------------");
            System.out.println("In tabble quanlythanhvien");
            while (rs2.next()){
                System.out.println(rs2.getInt("MaTV"));
                System.out.println(rs2.getString("TenTV"));
                System.out.println(rs2.getString("GioiTinh"));
                System.out.println(rs2.getString("Tuoi"));
            }
            ResultSet rs3 = stt.executeQuery(qlms);
            System.out.println("---------------------------------------");
            System.out.println("In tabble quanlymuonsach");
            while (rs3.next()){
                System.out.println(rs3.getInt("MaSach"));
                System.out.println(rs3.getInt("MaTV"));
                System.out.println(rs3.getInt("SoLuong"));
            }
            launch(args);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
