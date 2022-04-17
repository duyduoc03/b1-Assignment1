package JP2.sesstion1.Assignment1;

import JP2.sesstion1.Assignment1.main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class Listcontroller implements Initializable {
    public TableView<Book> tbqls;
    public TableColumn<Book,Integer> MS;
    public TableColumn<Book,String> TS;
    public TableColumn<Book,String> LS;
//    public TableView<Book> tbqltv;
//    public TableColumn<Book,Integer> MTV;
//    public TableColumn<Book,String> TTV;
//    public TableColumn<Book,String> GioiTinh;
//    public TableColumn<Book,Integer> Tuoi;
//    public TableView<Book> tbqlms;
//    public TableColumn<Book,Integer> MSach;
//    public TableColumn<Book,Integer> MaTV;
//    public TableColumn<Book,Integer> SL;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        MS.setCellValueFactory(new PropertyValueFactory<Book,Integer>("MaSach"));
        TS.setCellValueFactory(new PropertyValueFactory<Book,String>("TenSach"));
        LS.setCellValueFactory(new PropertyValueFactory<Book,String>("LoaiSach"));
        tbqls.setItems(main.BookList);
//        MTV.setCellValueFactory(new PropertyValueFactory<Book,Integer>("MaTV"));
//        TTV.setCellValueFactory(new PropertyValueFactory<Book,String>("TenTV"));
//        GioiTinh.setCellValueFactory(new PropertyValueFactory<Book,String>("GioiTinh"));
//        Tuoi.setCellValueFactory(new PropertyValueFactory<Book,Integer>("Tuoi"));
    }
}
