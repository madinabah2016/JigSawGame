package sample;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;


import java.util.ArrayList;
import java.util.List;

import static sample.Main.numbers;

public class Image1 {

        public static int size = 90;

        public static List<Background> pics1 = new ArrayList<Background>();
        public static List<Background> pics2 = new ArrayList<Background>();
        public static List<Background> pics3 = new ArrayList<Background>();

        //public static List<Image> Originalpics = new ArrayList<Image>():

    public static Image Original = new Image("file:Image/NarutoOriginal.jpg", size, size, false, false);
    public static Image Origina2 = new Image("file:Image/EdOriginal.jpg", size, size, false, false);
    public static Image Origina3 = new Image("file:Image/TomOriginal.jpg", size, size, false, false);



    public static Image image1 = new Image("file:Image/NO-0-0.jpeg", size, size, false, false);
    public static BackgroundImage bImage1 = new BackgroundImage(image1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO1 = new Background(bImage1);

    public static Image image2 = new Image("file:Image/NO-0-1.jpeg", size, size, false, false);
    public static BackgroundImage bImage2 = new BackgroundImage(image2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO2 = new Background(bImage2);


    public static Image image3 = new Image("file:Image/NO-0-2.jpeg", size, size, false, false);
    public static BackgroundImage bImage3 = new BackgroundImage(image3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO3 = new Background(bImage3);


    public static Image image4 = new Image("file:Image/NO-1-0.jpeg", size, size, false, false);
    public static BackgroundImage bImage4 = new BackgroundImage(image4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO4 = new Background(bImage4);


    public static Image image5 = new Image("file:Image/NO-1-1.jpeg", size, size, false, false);
    public static BackgroundImage bImage5 = new BackgroundImage(image5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO5 = new Background(bImage5);


    public static Image image6 = new Image("file:Image/NO-1-2.jpeg", size, size, false, false);
    public static BackgroundImage bImage6 = new BackgroundImage(image6, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO6 = new Background(bImage6);


    public static Image image7 = new Image("file:Image/NO-2-0.jpeg", size, size, false, false);
    public static BackgroundImage bImage7 = new BackgroundImage(image7, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO7 = new Background(bImage7);


    public static Image image8 = new Image("file:Image/NO-2-1.jpeg", size, size, false, false);
    public static BackgroundImage bImage8 = new BackgroundImage(image8, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO8 = new Background(bImage8);


    public static Image image9 = new Image("file:Image/Black.jpeg", size, size, false, false);
    public static BackgroundImage bImage9 = new BackgroundImage(image9, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background NO9 = new Background(bImage9);


    ///////////////////ED edd n Eddy Images///////////////
    public static Image Ed1 = new  Image("file:Image/Ed-0-0.jpeg", size, size, false, false);
    public static BackgroundImage bEd1 = new BackgroundImage(Ed1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED1 = new Background(bEd1);


    public static Image Ed2 = new  Image("file:Image/Ed-0-1.jpeg", size, size, false, false);
    public static BackgroundImage bEd2 = new BackgroundImage(Ed2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED2 = new Background(bEd2);


    public static Image Ed3 = new  Image("file:Image/Ed-0-2.jpeg", size, size, false, false);
    public static BackgroundImage bEd3 = new BackgroundImage(Ed3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED3 = new Background(bEd3);


    public static Image Ed4 = new  Image("file:Image/Ed-1-0.jpeg", size, size, false, false);
    public static BackgroundImage bEd4 = new BackgroundImage(Ed4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED4 = new Background(bEd4);


    public static Image Ed5 = new  Image("file:Image/Ed-1-1.jpeg", size, size, false, false);
    public static BackgroundImage bEd5 = new BackgroundImage(Ed5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED5 = new Background(bEd5);


    public static Image Ed6 = new  Image("file:Image/Ed-1-2.jpeg", size, size, false, false);
    public static BackgroundImage bEd6 = new BackgroundImage(Ed6, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED6 = new Background(bEd6);


    public static Image Ed7 = new  Image("file:Image/Ed-2-0.jpeg", size, size, false, false);
    public static BackgroundImage bEd7 = new BackgroundImage(Ed7, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED7 = new Background(bEd7);


    public static Image Ed8 = new  Image("file:Image/Ed-2-1.jpeg", size, size, false, false);
    public static BackgroundImage bEd8 = new BackgroundImage(Ed8, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED8 = new Background(bEd8);


    public static Image Ed9 = new  Image("file:Image/Black.jpeg", size, size, false, false);
    public static BackgroundImage bEd9 = new BackgroundImage(Ed9, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background ED9 = new Background(bEd9);


    //////////////////////////Tom and Jerry Pictures/////////////////////////////

    public static Image T1 = new  Image("file:Image/Tom-0-0.jpeg", size, size, false, false);
    public static BackgroundImage bT1 = new BackgroundImage(T1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom1 = new Background(bT1);

    public static Image T2 = new  Image("file:Image/Tom-0-1.jpeg", size, size, false, false);
    public static BackgroundImage bT2 = new BackgroundImage(T2, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom2 = new Background(bT2);

    public static Image T3 = new  Image("file:Image/Tom-0-2.jpeg", size, size, false, false);
    public static BackgroundImage bT3 = new BackgroundImage(T3, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom3 = new Background(bT3);

    public static Image T4 = new  Image("file:Image/Tom-1-0.jpeg", size, size, false, false);
    public static BackgroundImage bT4 = new BackgroundImage(T4, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom4 = new Background(bT4);

    public static Image T5 = new  Image("file:Image/Tom-1-1.jpeg", size, size, false, false);
    public static BackgroundImage bT5 = new BackgroundImage(T5, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom5 = new Background(bT5);

    public static Image T6 = new  Image("file:Image/Tom-1-2.jpeg", size, size, false, false);
    public static BackgroundImage bT6 = new BackgroundImage(T6, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom6 = new Background(bT6);

    public static Image T7 = new  Image("file:Image/Tom-2-0.jpeg", size, size, false, false);
    public static BackgroundImage bT7 = new BackgroundImage(T7, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom7 = new Background(bT7);

    public static Image T8 = new  Image("file:Image/Tom-2-1.jpeg", size, size, false, false);
    public static BackgroundImage bT8 = new BackgroundImage(T8, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom8 = new Background(bT8);

    public static Image T9 = new  Image("file:Image/Black.jpeg", size, size, false, false);
    public static BackgroundImage bT9 = new BackgroundImage(T9, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size, size, true, true, true, false));
    public static Background Tom9 = new Background(bT9);


    public static void ChangeButtonImage(List<Button> name, List<Background> BG){  //  (List<Button> name, List<background> BG)
            int num = 0;
            int count = 0;

            for(int i = 0; i < 3; i++){
                for(int x = 0; x < 3; x++){
                    num = numbers[i][x];
                    if(num == 0){
                        name.get(count).setBackground(BG.get(8));
                    }
                    else{
                        name.get(count).setBackground(BG.get(num-1));

                    }
                    count++;
                }
            }

        }


        public static void ImageOption (){

            pics1.add(NO1);
            pics1.add(NO2);
            pics1.add(NO3);
            pics1.add(NO4);
            pics1.add(NO5);
            pics1.add(NO6);
            pics1.add(NO7);
            pics1.add(NO8);
            pics1.add(NO9);

            pics2.add(ED1);
            pics2.add(ED2);
            pics2.add(ED3);
            pics2.add(ED4);
            pics2.add(ED5);
            pics2.add(ED6);
            pics2.add(ED7);
            pics2.add(ED8);
            pics2.add(ED9);

            pics3.add(Tom1);
            pics3.add(Tom2);
            pics3.add(Tom3);
            pics3.add(Tom4);
            pics3.add(Tom5);
            pics3.add(Tom6);
            pics3.add(Tom7);
            pics3.add(Tom8);
            pics3.add(Tom9);

        }


}
