package JP2.sesstion1.Assignment1;
import JP2.sesstion1.Assignment1.main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public final class Book {
    public Integer MS;
    public String TS;
    public String LS;

    public Book(Integer MS, String TS, String LS){
        this.MS = MS;
        this.TS = TS;
        this.LS =  LS;
    }

    public Integer getMS() {
        return MS;
    }

    public void setMS(Integer MS) {
        this.MS = MS;
    }

    public String getTS() {
        return TS;
    }

    public void setTS(String TS) {
        this.TS = TS;
    }

    public String getLS() {
        return LS;
    }

    public void setLS(String LS) {
        this.LS = LS;
    }

    public String toString(){
        String s = "\n---------------------";
        s += "\n" + getMS();
        s += "\n" + getTS();
        s += "\n" + getLS();
        return s;
    }
}
