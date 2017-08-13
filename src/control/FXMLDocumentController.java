package control;

import Modelo.Estudiante;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JOptionPane;

/**
 *
 * @author HOGAR
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lbNombre;
    @FXML
    private Label lbId;
    @FXML
    private Label lbEdad;
    @FXML
    private Label lbTelefono;
    @FXML
    private Label lbCodigo;
    @FXML
    private Label lbCarrera;
    @FXML
    private Label lbSemestre;
    @FXML
    private TextField txNombre;
    @FXML
    private TextField txId;
    @FXML
    private TextField txEdad;
    @FXML
    private TextField txTelefono;
    @FXML
    private TextField txCodigo;
    @FXML
    private TextField txCarrera;
    @FXML
    private TextField txSemestre;
    @FXML
    private WebView WebView;
    
    LinkedList <Estudiante> ListaE ;
    String mostrar;
    
    WebEngine we;
    
    @FXML
    public void AgregarEst(ActionEvent event) {
       // JOptionPane.showMessageDialog(null,"Agrega un estudiante");
        
        String nombre = txNombre.getText().toUpperCase(); 
        String id = txId.getText().toUpperCase();
        int edad = Integer.parseInt(txEdad.getText());
        String telefono = txTelefono.getText().toUpperCase();
        String codigo = txCodigo.getText().toUpperCase();
        String carrera = txCarrera.getText().toUpperCase();
        int semestre = Integer.parseInt(txSemestre.getText());
        
        Estudiante ObjEst = new Estudiante(codigo, carrera, semestre, nombre, id, edad, telefono);
        ListaE.add (ObjEst);
        
        txNombre.clear();
        txId.clear();
        txEdad.clear();
        txTelefono.clear();
        txCodigo.clear();
        txCarrera.clear();
        txSemestre.clear();
    }
    
    @FXML
    public void MostrarEsts(ActionEvent event){
        //JOptionPane.showMessageDialog(null,"Mostrare los estudiantes");
        
        
        for (int i = 0; i < ListaE.size(); i++){
            //para crear una fila con datos ingresados anteriormente
            mostrar += "<tr>"+"<td>"+ListaE.get(i).getNombre() + "</td>" +
                              "<td>"+ListaE.get(i).getId() + "</td>" +
                              "<td>"+ListaE.get(i).getTelefono() + "</td>"+
                              "<td>"+ListaE.get(i).getEdad() + "</td>" +
                              "<td>"+ListaE.get(i).getCodigo()+ "</td>"+
                              "<td>"+ListaE.get(i).getCarrera() + "</td>" +
                              "<td>"+ListaE.get(i).getSemestre()+ "</td>"+ "</tr>" ;
        }
        mostrar += "</table>";
        //JOptionPane.showInputDialog(mostrar);
        
        we.loadContent(mostrar);
       
    }    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListaE = new LinkedList<>();
        we = WebView.getEngine();
        mostrar = "<table border = 1>"+
                "<tr><td> NOMBRE </td>"+
                "<td> IDENTIFICACIÓN </td>"+
                "<td> EDAD </td>"+
                "<td> TELEFONO </td>" +
                "<td> CODIGO </td>" +
                "<td> CARRERA </td>" + 
                "<td> SEMESTRE </td></tr>"; 
    }    
    
}