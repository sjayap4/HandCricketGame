import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HandCricketServer extends Application {
    //first page
    Pane First;
    Label GameName;
    Label PortName;
    TextField PortNum;
    Button Connect;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

    //feel free to remove the starter code from this method
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        primaryStage.setTitle("(Server) Hand Cricket Game!!!");
        primaryStage.setScene(firstPage());
        primaryStage.show();
    }

    //First Page
    public Scene firstPage(){
        First = new Pane();
        First.setStyle("-fx-background-image:url(Serverpic.jpg) ; -fx-background-size: 100% 100% ");

        GameName = new Label("Hand Cricket Game");
        GameName.setFont(Font.font("Times New Roman", FontWeight.BOLD,45));
        GameName.setTextFill(Color.WHITE);
        //GameName.setAlignment(Pos.TOP_CENTER);
        // BorderPane.setAlignment(GameName, Pos.CENTER);

        PortName = new Label("Port Number: ");
        PortName.setFont(Font.font("Times New Roman", FontWeight.BOLD,20));
        PortName.setTextFill(Color.BLACK);
        PortName.relocate(100,350);


        PortNum = new TextField("5555");
        PortNum.relocate(250,350);


        Connect = new Button("Connect");
        Connect.relocate(300,500);

        First.getChildren().addAll(GameName,PortName,PortNum,Connect);
        return new Scene(First,700, 700);
    }
}
