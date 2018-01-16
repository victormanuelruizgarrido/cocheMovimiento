/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochemovimiento;

/*Justo aqui se iran introduciendo todas las importaciones necesaria de nuestra 
aplicacion. Si clickeamos en segundo boton y despues Fix Import se borraran las
importaciones que no estamos utilizando y tambien añadir la que necesitamos 
añadir*/

import java.io.File;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
/*import javafx.scene.shape.Circle;*/
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class CocheMovimiento extends Application {
    int cocheCenterX = 400;
    int cocheVelocidadX = 3;
    int cocheCenterY = 400;
    int cocheVelocidadY = 3;
    @Override
    public void start(Stage primaryStage) {     
        Pane root = new Pane();
        /*Podemos identificar los parametros de la pantalla del tiron si tener 
        que ir objeto por objeto Scene scene = new Scene(root,600,400,
        Color.AQUA; )*/
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("PongVictorManuelRuizGarrido!");
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.setFill(Color.GREEN);
        /*Se pueden asignar los valores de la bola directamente. Circle 
        circleBall = new Circle(10,30,7, Color.BLUE);
        Circle circleBall = new Circle();
        circleBall.setCenterX(10);
        circleBall.setCenterY(30);
        circleBall.setRadius(7);
        circleBall.setFill(Color.BLUE);
        
         Linea */
        Rectangle rectanguloEsquinas = new Rectangle(200,400,Color.GREY);
        rectanguloEsquinas.setArcWidth(10);
        rectanguloEsquinas.setArcHeight(10);
        rectanguloEsquinas.setX(200);
        rectanguloEsquinas.setY(0);
        File file = new File("coche.png");
        Image image = new Image(file.toURI().toString());
         // simple displays ImageView the image as is
        ImageView iv1 = new ImageView();
        iv1.setImage(image);
        File file1 = new File("trafico.png");
        Image image1 = new Image(file1.toURI().toString());
         // simple displays ImageView the image as is
        ImageView iv2 = new ImageView();
        iv2.setImage(image1);
        iv2.setX(170);
        iv2.setY(200);
        /* se contruye un objeto de tipo linea con las coordenas
        de donde debe de aparecer dentro de Scene*/
        Line linea001 = new Line(200,400,200,0);
        // Se asina el color de relleno de la linea
        linea001.setStroke(Color.YELLOW);
        // Se indica el grosor que tendra nuestra linea
        linea001.setStrokeWidth(10);
        // se indica el tipo de punta que tendra la linea
        linea001.setStrokeLineCap(StrokeLineCap.ROUND);
        // se agrega la linea al Scene.
        // Linea 
        /* se contruye un objeto de tipo linea con las coordenas
        de donde debe de aparecer dentro de Scene*/
        Line linea002 = new Line(400,400,400,0);
        // Se asina el color de relleno de la linea
        linea002.setStroke(Color.YELLOW);
        // Se indica el grosor que tendra nuestra linea
        linea002.setStrokeWidth(10);
        // se indica el tipo de punta que tendra la linea
        linea002.setStrokeLineCap(StrokeLineCap.ROUND);
        //Creamos una linea discontinua central
        Line linea003 = new Line(300,0,300,20);
        linea003.setStroke(Color.YELLOW);
        linea003.setStrokeLineCap(StrokeLineCap.ROUND);
        Line linea004 = new Line(300,80,300,120);
        linea004.setStroke(Color.YELLOW);
        linea004.setStrokeLineCap(StrokeLineCap.ROUND);
        Line linea005 = new Line(300,180,300,220);
        linea005.setStroke(Color.YELLOW);
        linea005.setStrokeLineCap(StrokeLineCap.ROUND);
        Line linea006 = new Line(300,280,300,320);
        linea006.setStroke(Color.YELLOW);
        linea006.setStrokeLineCap(StrokeLineCap.ROUND);
        Line linea007 = new Line(300,380,300,400);
        linea007.setStroke(Color.YELLOW);
        linea007.setStrokeLineCap(StrokeLineCap.ROUND);
        /*Se agregan los hijos que queremos mostrar en escena siempre en el 
        orden en que lo queremos mostrar por si queremos por si queremeos 
        mostrarlo encima del otro*/
        //se agrega la imagen al Scene.
        root.getChildren().add(rectanguloEsquinas);
        // se agrega la linea al Scene.
        root.getChildren().add(linea007);
        root.getChildren().add(linea006);
        root.getChildren().add(linea005);
        root.getChildren().add(linea004);
        root.getChildren().add(linea003);
        root.getChildren().add(linea002);
        root.getChildren().add(linea001);
        root.getChildren().add(iv1);
        root.getChildren().add(iv2);
        
        /*root.getChildren().add(circleBall);*/
        /*Creamos la animacion para que el coche empiece a moverse en los 
        parametros que le indicamos en las variables indicada anteriormente 
        en la parte superior*/
        AnimationTimer animationCoche = new AnimationTimer(){
            @Override
            public void handle(long now) {
                iv1.setX(cocheCenterX);
                cocheCenterX+=cocheVelocidadX;
                if(cocheCenterX>=370){
                    cocheVelocidadX=-3;
                }
                if(cocheCenterX<=200){
                    cocheVelocidadX=3;
                }
                iv1.setY(cocheCenterY);
                cocheCenterY+=cocheVelocidadY;
                if(cocheCenterY>=400){
                    cocheVelocidadY=-3;
                }
                if(cocheCenterY<=0){
                    cocheCenterY=400;
                }
            };
        };
        /*Iniciamos la aplicacion con aniamcionCoche con el parametro start*/
        animationCoche.start();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
