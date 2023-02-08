package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import sample.view.Calculadora;
import sample.view.Encriptador;
import sample.view.Rompecabezas;


public class Main extends Application {

    private VBox vBox;
    private MenuBar mnbPrincipal;
    private Menu menCompetencia1,menCompetencia2,menCerrar;
    private MenuItem mitCalcu, mitRompeCabezas,mniSalir,mitEncriptar;
    private Scene escena;

    @Override
    public void start(Stage primaryStage) throws Exception{
        CrearMenu();

        primaryStage.setTitle("Proyecto TAP");
        primaryStage.setScene(escena);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    //Aguayo Sanchez Alan Giovanni

    private void CrearMenu(){
        vBox = new VBox();

        mnbPrincipal = new MenuBar();
        menCompetencia1=new Menu("Competencia 1");
        menCompetencia2=new Menu("Competencia 2");
        menCerrar=new Menu("Cerrar");
        mnbPrincipal.getMenus().addAll(menCompetencia1,menCompetencia2,menCerrar);

        mitCalcu =new MenuItem("Calculadora");
        mitCalcu.setOnAction(event -> opcionesMenu(1));
        mitRompeCabezas = new MenuItem("Rompecabezas");
        mitRompeCabezas.setOnAction(event -> opcionesMenu(2));
        mitEncriptar = new MenuItem("Encriptador");
        mitEncriptar.setOnAction(event -> opcionesMenu(3));
        menCompetencia1.getItems().addAll(mitCalcu,mitRompeCabezas,mitEncriptar);

        mniSalir=new MenuItem("Salir");
        mniSalir.setOnAction(event -> System.exit(0));
        menCerrar.getItems().add(mniSalir);

        vBox.getChildren().add(mnbPrincipal);

        escena = new Scene(vBox,300,70);
    }

    private void opcionesMenu(int opc) {
        switch(opc){
            case 1:new Calculadora();
            break;
            case 2:new Rompecabezas();
            break;
            case 3:new Encriptador();
            break;
        }
    }

    private void CrearUI(Stage primaryStage){

        //Menu





        //Parte 1 hbox,vbox
       /* Button btn1,btn2,btn3;

        btn1=new Button("Boton 1");
        btn2=new Button("Boton 2");
        btn3=new Button("Boton 3");
*/

        //HBox
        /*
        HBox hBox = new HBox();

        hBox.getChildren().addAll(btn1,btn2,btn3);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20));

        Scene scene = new Scene(hBox,400,70);


         */

        //BorderPane
       /*
        BorderPane border = new BorderPane();
        Label lbl=new Label("Etiqueta");
        border.setTop(lbl);
        Scene scene = new Scene(border);
*/

        //VBox
        /*

        VBox vBox = new VBox();
        vBox.getChildren().addAll(btn1,btn2,btn3);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20,20,20,20));





        Scene scene = new Scene(vBox,400,70);

*/

        //Parte 2 flowpane
        /*
        FlowPane flow = new FlowPane(Orientation.VERTICAL);
        flow.getChildren().addAll(btn1,btn2,btn3);

        Scene scene= new Scene(flow,400,70);
*/

        //Parte 3 gridpane
        /*
        GridPane grid = new GridPane();
        grid.add(new Button("Posicion 0, 0"), 0, 0);
        grid.add(new Button("Posicion 1, 0"), 1, 0);
        grid.add(new Button("Posicion 0, 1"), 0, 1);
        grid.add(new Button("Posicion 1, 1"), 1, 1);
        grid.add(new Button("Posicion 0, 2"), 0, 2);
        grid.add(new Button("Posicion 1, 2"), 1, 2);
        grid.add(new Button("Posicion Col 2 Fila 0"), 2, 2);
        Scene scene=new Scene(grid);
        */

        //Parte 4 anchorpane
        /*
        AnchorPane anchor = new AnchorPane();

        AnchorPane.setTopAnchor(btn1,15.0);
        AnchorPane.setRightAnchor(btn1,15.0);
        AnchorPane.setBottomAnchor(btn2,30.0);
        AnchorPane.setLeftAnchor(btn2,100.0);

        anchor.getChildren().addAll(btn1,btn2,btn3);

        Scene scene=new Scene(anchor);
        */

        //Parte 5 stackpane
        /*
        StackPane stack = new StackPane();
        stack.getChildren().addAll(btn1,btn2,btn3);
        Scene scene =new Scene(stack);
*/

        //Parte 6 titlepane
        /*
        TilePane tile = new TilePane();
        tile.setHgap(8);
        tile.setPrefColumns(4);
        tile.getChildren().addAll(btn1,btn2,btn3);
        Scene scene = new Scene(tile);

        */

        //Parte 7 color y tamaño
/*
        btn1.setMaxWidth(100);
        btn1.setMaxHeight(200);
        btn1.setStyle("-fx-background-color: #00ff00");

        btn2.setMaxWidth(50);
        btn2.setMaxHeight(100);
        btn2.setStyle("-fx-background-color: #000000");

        btn3.setMaxWidth(150);
        btn3.setMaxHeight(250);
        btn3.setStyle("-fx-background-color: #ff2d00");



        */


    }

}
