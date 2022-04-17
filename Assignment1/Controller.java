package JP2.sesstion1.Assignment1;

import JP2.sesstion1.Assignment1.main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public Text result;
    public Text masach;
    public Text tensach;
    public Text loaisach;
    public Book book;

    public void setData(Book book) {
        this.book = book;

        masach.setText(book.getMS().toString());
        tensach.setText(book.getTS());
        loaisach.setText(book.getLS());
    }

    public void submit(){
        Book p = new Book(Integer.parseInt(masach.getText()),tensach.getText(),loaisach.getText());
        result.setText(result.getText()+p.toString());
        if (this.book == null){
            main.BookList.add(p);
        }
        else {
            int i = main.BookList.indexOf(this.book);
            main.BookList.set(i,p);
        }
        renderList();
    }
    public void renderList(){
        masach.setText("");
        tensach.setText("");;
        loaisach.setText("");
    }

}
