package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main extends Application {
    Stage window;
    public static int[][] numbers = new int[3][3];
    public String LEVEL = "";
    public String btnDesign = "-fx-text-fill: #ffffff; -fx-background-color: #009688; -fx-background-radius: 8; -fx-font-size: 18px;";
    public boolean begin = true;

    List<Button> buttons = new ArrayList<Button>();

    Button B1 = new Button("1");
    Button B2 = new Button("2");
    Button B3 = new Button("3");
    Button B4 = new Button("4");
    Button B5 = new Button("5");
    Button B6 = new Button("6");
    Button B7 = new Button("7");
    Button B8 = new Button("8");
    Button B9 = new Button("0");
    Label hintL = new Label("Hint");

    Button NextLevel = new Button("Next");
    public int difficulty = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Image1.ImageOption();

        buttons.add(B1);
        buttons.add(B2);
        buttons.add(B3);
        buttons.add(B4);
        buttons.add(B5);
        buttons.add(B6);
        buttons.add(B7);
        buttons.add(B8);
        buttons.add(B9);

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 6;
        numbers[1][1] = 8;
        numbers[1][2] = 0;
        numbers[2][0] = 5;
        numbers[2][1] = 4;
        numbers[2][2] = 7;

        //Game.trace(numbers, "Trace","Easy");
        hintL.setStyle("-fx-font-size: 15px");
        hintL.setTextFill(Color.WHITE);

        B1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(0, 0);
                btnFunction();
            }
        });

        B2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(0, 1);
                btnFunction();
            }
        });

        B3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(0, 2);
                btnFunction();
            }
        });

        B4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(1, 0);
                btnFunction();
            }
        });

        B5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(1, 1);
                btnFunction();
            }
        });

        B6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(1, 2);
                btnFunction();
            }
        });

        B7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(2, 0);
                btnFunction();
            }

        });

        B8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(2, 1);
                btnFunction();
            }
            //hintL.setVisible(false);
        });

        B9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.moveTrack(2, 2);
                btnFunction();
            }
        });

        window = primaryStage;
        window.setTitle("Game");

        mainMenu();
    }

    public void mainMenu(){
        Label Title = new Label("JigSaw Game");
        Title.setStyle("-fx-font-size: 20px");
        Title.setTextFill(Color.WHITE);

        Label Instruction = new Label("Instructions");
        Instruction.setStyle("-fx-font-size: 15px");
        Instruction.setTextFill(Color.WHITE);

        Label detail = new Label("Try to arrange the blocks in order");
        detail.setStyle("-fx-font-size: 15px");
        detail.setTextFill(Color.WHITE);

        Button play = new Button("Play");
        play.setStyle(btnDesign);

        play.setPrefSize(60,30);

        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Menu();
            }
        });
        VBox layout = new VBox(20);
        layout.setStyle("-fx-background-color:  #2d2d2d");
        layout.getChildren().addAll(Title,Instruction, detail, play);

        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 500,500);
        //scene.setStyleSheet.add
        window.setScene(scene);
        window.show();
    }

    public void Menu(){

        Label label = new Label("Game Level:");
        label.setStyle("-fx-font-size: 15px");
        label.setTextFill(Color.WHITE);

        Button easy = new Button("Easy");
        easy.setStyle(btnDesign);


        Button medium = new Button("Medium");
        medium.setStyle(btnDesign);

        Button hard = new Button("Hard");
        hard.setStyle(btnDesign);

        hard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hardScene(Image1.pics2, Image1.Origina2);
                LEVEL = "Hard";
                Game.LENGTH = 8;
                difficulty = 6;
            }
        });

        easy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.LENGTH = 7;
                LEVEL = "Easy";
                GameScene("Easy");
                difficulty = 1;
            }
        });
        medium.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.LENGTH = 12;
                LEVEL = "Medium";
                GameScene("Medium");
                difficulty = 4;
            }
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,easy,medium, hard);
        layout.setStyle("-fx-background-color:  #2d2d2d");

        layout.setAlignment(Pos.CENTER);
        Scene gameS = new Scene(layout, 500, 500);
        window.setScene(gameS);
        window.show();

    }

    public void GameScene(String L){
        LEVEL = L;

        int size = 105;
        HBox box = new HBox(10);
        box.setStyle("-fx-background-color:  #2d2d2d");

        Button hint = new Button("Hint");
        hint.setStyle(btnDesign);

        Label blank = new Label("");

        hintL.setVisible(false);
        hint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(L.equals("Easy")) {
                    Game.LENGTH = 20;
                }
                else if (L.equals("Medium")) {
                    Game.LENGTH = 20;
                }
                Game.OrderRoute = "";
                Game.check1 = false;
                Game.trace(numbers, "Trace", "Easy" );///////////////////////////////
                System.out.println("Hint"+Game.OrderRoute);
                hintL.setVisible(true);
                System.out.println("Hint: "+ Game.hint(1));
                hintL.setText(Game.hint(1));
            }
        });

        Button Restart = new Button("Restart");
        Restart.setStyle(btnDesign);
        Restart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(AlertScene("Are You Sure You Want To Restart!")){
                    hintL.setVisible(false);
                    Game.count = 0;
                    //Game.trace(numbers, "CreateRoute", L);
                    System.out.println("Final Route: "+  Game.FinalRoute);
                    Game.newArray(numbers);
                    System.out.println("Trial: "+Arrays.deepToString(numbers));
                    changeButtonName();
                }

            }
        });

        Button Back = new Button("Back");
        Back.setStyle(btnDesign);
        Back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(AlertScene("Are You Sure You Want to Retrun to Main Screen?")) {
                    for (Button name : buttons) {
                        name.setDisable(false);
                    }
                    begin = true;
                    Game.check = false;
                    changeButtonName();
                    Game.order();
                    for(Button name: buttons){
                        name.setStyle(null);
                    }
                    mainMenu();
                }
            }
        });
        box.getChildren().addAll(hint, Restart, Back);
        box.setAlignment(Pos.CENTER);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(0,0,0,0));
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color:  #2d2d2d");

        for(Button name: buttons){
            name.setPrefSize(size, size);

        }

        Game.count = 0;
        Game.trace(numbers, "CreateRoute", L);
        System.out.println("Final Route: "+  Game.FinalRoute);
        Game.newArray(numbers);
        //System.out.println("Trial: "+Arrays.deepToString(numbers));
        changeButtonName();

        grid.add(blank, 2, 1);
        grid.add(hintL, 2, 0);
        grid.add(B1, 1,2);
        grid.add(B2, 2,2);
        grid.add(B3, 3,2);
        grid.add(B4, 1,3);
        grid.add(B5, 2,3);
        grid.add(B6, 3,3);
        grid.add(B7, 1,4);
        grid.add(B8, 2,4);
        grid.add(B9, 3,4);


        BorderPane BLayout = new BorderPane();
        BLayout.setTop(box);
        BLayout.setMargin(box, new Insets(20, 0, 20, 0));
        BLayout.setStyle("-fx-background-color:  #2d2d2d");

        BLayout.setCenter(grid);

        Scene scene = new Scene(BLayout, 500, 500);
        window.setScene(scene);
        window.show();

    }

    public void changeButtonName(){
        //B1.setFocusTraversable(true);
        int x = 0;
        int y = 0;
        for(Button name: buttons){
            name.setText(Integer.toString(numbers[x][y]));
            name.setStyle("-fx-font-size: 40pt");

            if(numbers[x][y] == 0){
                //name.setDisable(true);
                name.setStyle("-fx-background-color: #ababab; -fx-border-radius: 0px; ");
                name.setText("");
            }
            else{
                name.setStyle("-fx-background-color: #8d2663; -fx-text-fill: #ffffff; -fx-border-radius: 0px;");

            }
            y++;
            if(y == 3){
                y = 0;
                x++;
            }
        }
        System.out.println( "changeButton: "+ Arrays.deepToString(numbers));
    }

    public void winScene(){
        Stage window1 = new Stage();

        Label con = new Label("Congratulations");
        con.setStyle("-fx-font-size: 15px");
        con.setTextFill(Color.WHITE);

        Label text = new Label("You did it");
        text.setStyle("-fx-font-size: 15px");
        text.setTextFill(Color.WHITE);

        Label ntext = new Label("Click next to move on to the next level");
        ntext.setStyle("-fx-font-size: 15px");
        ntext.setTextFill(Color.WHITE);


        NextLevel.setText("Next");
        NextLevel.setStyle(btnDesign);
        NextLevel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                difficulty = difficulty+1;
                for(Button name: buttons){
                    name.setStyle(null);
                    name.setGraphic(null);
                }
                if(View.size() == 9){
                    System.out.println("List is Greater than 9");
                    for(int i = 0; i < 9; i++) {
                        View.remove(0);
                    }
                }
                if(difficulty < 4){
                    Game.LENGTH = Game.LENGTH+1;
                    GameScene("Easy");
                    //window1.close();
                }
                else if(difficulty == 4){
                    Game.LENGTH = 12;
                    GameScene("Medium");
                }
                else if(difficulty == 5){
                    Game.LENGTH = 15;
                    GameScene("Medium");
                }
                else if(difficulty == 6){
                    Game.LENGTH = 8;
                    hardScene(Image1.pics2, Image1.Origina2);
                }
                else if(difficulty == 7){
                    Game.LENGTH = 12;
                    hardScene(Image1.pics3, Image1.Origina3);
                }
                else if(difficulty == 8){
                    Game.LENGTH = 15;
                    hardScene(Image1.pics1, Image1.Original);
                }
                System.out.println("Difficulty: "+ difficulty);
                window1.close();
            }
        });

        VBox layout = new VBox(10);

        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(con, text, ntext, NextLevel);
        layout.setStyle("-fx-background-color:  #2d2d2d");


        Scene winScene = new Scene(layout, 250, 250);
        window1.setScene(winScene);
        window1.showAndWait();
    }

    public static boolean alert = false;
    Stage window2 = new Stage();

    public boolean AlertScene(String Text){


        Label sure = new Label(Text);
        sure.setStyle("-fx-font-size: 15px");
        sure.setTextFill(Color.WHITE);

        Button yes = new Button("Yes");
        //yes.setPrefSize(40, 40);
        yes.setStyle(btnDesign);

        yes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                alert = true;
                window2.close();
            }
        });

        Button no = new Button("No");
        //no.setPrefSize(40,40);
        no.setStyle(btnDesign);
        no.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                alert = false;
                window2.close();
            }
        });

        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(sure, yes, no);
        box.setStyle("-fx-background-color:  #2d2d2d");

        Scene scene = new Scene(box, 350,200);

        window2.setScene(scene);
        window2.setTitle("Warning");
        window2.showAndWait();

        return alert;

    }

    List<Background> View = new ArrayList<Background>();          //List<BackGround> BG  = new ArrayList<BackGround>();

    public void hardScene(List<Background> pics, Image image){
        int size = 110;
        LEVEL = "Hard";

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(0,0,0,0));
        grid.setAlignment(Pos.CENTER);

        for(Background name: pics) {              // BackGround name: Image1.pics
            View.add(name);                              // BG.add(name)
        }

        Label blank = new Label(" ");

        grid.add(blank, 2, 1);
        grid.add(hintL, 2, 0);
        grid.add(B1, 1,2);
        grid.add(B2, 2,2);
        grid.add(B3, 3,2);
        grid.add(B4, 1,3);
        grid.add(B5, 2,3);
        grid.add(B6, 3,3);
        grid.add(B7, 1,4);
        grid.add(B8, 2,4);
        grid.add(B9, 3,4);


        for(Button name: buttons){
            name.setText("");
            name.setPrefSize(size, size);
        }

        for(int i = 0; i < 9; i++){
            buttons.get(i).setBackground(null);
        }

        Game.count = 0;
        Game.trace(numbers, "CreateRoute", "Medium");
        System.out.println("Final Route: "+  Game.FinalRoute);
        Game.newArray(numbers);
        Image1.ChangeButtonImage(buttons, View);          //Image1.ChangeButtonImage(buttons, BG);


        ImageView OriginalImage = new ImageView(image);

        Button Back = new Button("Back");
        //Back.setPrefSize(50, 30);
        Back.setStyle(btnDesign);

        Back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(AlertScene("Are You Sure You Want to Return to Main Screen?")) {
                    begin = true;
                    Game.check = false;
                    Image1.ChangeButtonImage(buttons, View);
                    Game.order();
                    mainMenu();
                    for(Button name: buttons){
                        name.setGraphic(null);
                    }
                    if(View.size() == 9){
                        System.out.println("List is Greater than 9");
                        for(int i = 0; i < 9; i++) {
                            View.remove(0);
                        }
                    }

                }
            }
        });
        hintL.setVisible(false);

        Button hint = new Button("Hint");
        //hint.setPrefSize(50, 30);
        hint.setStyle(btnDesign);
        hint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.LENGTH = 20;
                Game.OrderRoute = "";
                Game.check1 = false;
                Game.trace(numbers, "Trace", "Easy" );///////////////////////////////
                System.out.println("Hint"+Game.OrderRoute);
                hintL.setVisible(true);
                System.out.println("Hint: "+ Game.hint(1));
                hintL.setText(Game.hint(1));
            }
        });

        Button Restart = new Button("Restart");
        //Restart.setPrefSize(50, 30);
        Restart.setStyle(btnDesign);

        Restart.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(AlertScene("Are You Sure You Want To Restart!")){
                    hintL.setVisible(false);
                    Game.count = 0;
                    //Game.trace(numbers, "CreateRoute", L);
                    System.out.println("Final Route: "+  Game.FinalRoute);
                    Game.newArray(numbers);
                    System.out.println("Trial: "+Arrays.deepToString(numbers));
                    Image1.ChangeButtonImage(buttons, View);
                }

            }
        });

        VBox box = new VBox(15);
        box.getChildren().addAll(OriginalImage, hint, Restart, Back);
        box.setAlignment(Pos.CENTER);

        BorderPane Border = new BorderPane();
        Border.setRight(box);
        BorderPane.setMargin(box, new Insets(60, 50, 50, 20));

        Border.setCenter(grid);
        Border.setStyle("-fx-background-color:  #2d2d2d");

        Scene s = new Scene(Border, 500, 500);
        window.setScene(s);
        window.show();

    }

    public void Final(){
        Label label1 = new Label("Congratulations You Have Completed the Final Level");
        label1.setStyle("-fx-font-size: 15px");
        label1.setTextFill(Color.WHITE);
        Label label2  = new Label("Click on Menu to Return To the Main Screen");
        label2.setStyle("-fx-font-size: 15px");
        label2.setTextFill(Color.WHITE);

        Button btn = new Button("Menu");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for(Button name: buttons){
                    name.setGraphic(null);
                    name.setStyle(null);
                }
                if(View.size() == 9){
                    System.out.println("List is Greater than 9");
                    for(int i = 0; i < 9; i++) {
                        View.remove(0);
                    }
                }
                mainMenu();
            }
        });

        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label1, label2, btn);
        box.setStyle("-fx-background-color:  #2d2d2d");

        Scene scene = new Scene(box, 500, 500);
        window.setScene(scene);
        window.show();

    }

    public void btnFunction(){
        //Game.moveTrack(0, 0);
        if(Game.check){
            if(LEVEL.equalsIgnoreCase("Easy") || LEVEL.equalsIgnoreCase("Medium")) {
                changeButtonName();
            }
            else if(LEVEL.equalsIgnoreCase("Hard")) {
                Image1.ChangeButtonImage(buttons, View);
            }
        }
        hintL.setVisible(false);
        if(Game.isOrdered(numbers, "Trace")){
            if(difficulty == 8){
                Final();
            }
            else {
                winScene();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
