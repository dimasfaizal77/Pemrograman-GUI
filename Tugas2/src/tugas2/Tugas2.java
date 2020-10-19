/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 	import javafx.application.Application;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;
/**
 *
 * @author asus
 */
 
public class Tugas2 extends Application {
    
    @Override
    public void start(Stage stage) {
        //Membuat label nama
        Text text1 = new Text("Nama");
        //Membuat label telepon
        Text text2 = new Text("Telepon");
        //Membuat label alamat
        Text text3 = new Text("Alamat");
        //Membuat kolom nama
        TextField textField1 = new TextField();
        //Membuat kolom telepon
        TextField textField2 = new TextField();
        //Membuat kolom alamat
        TextArea textArea1 = new TextArea();
        //Membuat tombol kirim dan hapus
        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");
        //Membuat layout
        GridPane gridPane = new GridPane();
        //Membuat ukuran layout
        gridPane.setMinSize(800, 400);
        //Mengatur celah vertikal dan horizontal antara kolom
        gridPane.setVgap(5);gridPane.setHgap(5);
        //Mengatur posisi supaya di tengah
        gridPane.setAlignment(Pos.CENTER);
        //Menyususun node di grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(text3, 0, 3);
        gridPane.add(textArea1, 1, 3);
        gridPane.add(button1, 0, 5);
        gridPane.add(button2, 1, 5);
        //Membuat objek
        Scene scene = new Scene(gridPane);
        //Membuat title aplikasi
        stage.setTitle("Pendaftaran");
        //Menambahkan scene di stage
        stage.setScene(scene);
        //Menampilkan isi
        stage.show();
       }
    public static void main(String args[]){
    launch(args);
    }
}
