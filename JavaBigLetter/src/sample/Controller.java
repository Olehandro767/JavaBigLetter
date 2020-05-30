package sample;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
//import sun.awt.HeadlessToolkit;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane BPane;

    @FXML
    private TextArea TextArea1;

    @FXML
    private TextArea TextArea2;

    //@FXML
    //private Button BtnConvert;

    @FXML
    private Button BtnCopy;

    @FXML
    private Button BtnClear1;

    /*@FXML
    void BtnConvertClick(ActionEvent event) {
        UpperText();
    }*/

    @FXML
    void BtnCopyClick(ActionEvent event) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(TextArea2.getText()), null);
    }

    @FXML
    void BtnClearClick(ActionEvent event) {
        TextArea2.clear();
        TextArea1.clear();
    }

    /*@FXML
    void TextArea1KeyPressed(KeyEvent event) {

    }*/

    @FXML
    void TextArea1KeyTyped(KeyEvent event) {
        UpperText(event.getCharacter());
    }

    @FXML
    void initialize() {
        assert BPane != null : "fx:id=\"BPane\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextArea1 != null : "fx:id=\"TextArea1\" was not injected: check your FXML file 'sample.fxml'.";
        assert TextArea2 != null : "fx:id=\"TextArea2\" was not injected: check your FXML file 'sample.fxml'.";
        //assert BtnConvert != null : "fx:id=\"BtnConvert\" was not injected: check your FXML file 'sample.fxml'.";
        assert BtnCopy != null : "fx:id=\"BtnCopy\" was not injected: check your FXML file 'sample.fxml'.";
        assert BtnClear1 != null : "fx:id=\"BtnClear1\" was not injected: check your FXML file 'sample.fxml'.";

        Init();
    }

    public void Init(){
        BPane.getStylesheets().add(getClass().getResource("sample.css").toExternalForm());
    }

    public void UpperText(String str){
        String s = TextArea1.getText() + str;
        String s1 = "";
        for (int i = 0; i < s.length(); i++){
            s1 += Character.toUpperCase(s.charAt(i));
        }
        TextArea2.setText(s1);
    }

    /*public void UpperText(){
        String s = TextArea1.getText();
        String s1 = "";
        for (int i = 0; i < s.length(); i++){
            s1 += Character.toUpperCase(s.charAt(i));
        }
        TextArea2.setText(s1);
    }*/
}
