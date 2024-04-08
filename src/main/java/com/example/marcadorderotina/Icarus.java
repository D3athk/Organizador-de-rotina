package com.example.marcadorderotina;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Icarus extends Application {

    public static double soma;

    @Override
    public void start(Stage primaryStage) {

        ;;// Define a data e hora atual no fuso horário do Brasil
        ZonedDateTime brazilDateTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        // Obtém o dia da semana atual
        DayOfWeek dayOfWeek = brazilDateTime.getDayOfWeek();
        String message;


        // Verifica o dia da semana e define a mensagem e a imagem correspondente
        switch (dayOfWeek) {
            case MONDAY:
                message = "Hoje é Segunda-feira! Vamos analisar seu dia";
                break;
            case TUESDAY:
                message = "Hoje é Terça-feira! Vamos analisar seu dia";
                break;
            case WEDNESDAY:
                message = "Hoje é Quarta-feira! Vamos analisar seu dia!";
                break;
            case THURSDAY:
                message = "Hoje é Quinta-feira! Vamos analisar seu dia!";
                break;
            case FRIDAY:
                message = "Hoje é Sexta! Vamos analisar seu dia!";
                break;
            case SATURDAY:
                message = "Hoje é Sábado! Vamos analisar seu dia!";
                break;
            case SUNDAY:
                message = "Hoje é Domingo! Vamos analisar seu dia";
                break;
            default:
                message = "Erro ao detectar o dia da semana.";
                break;
        }
        // Carregar a imagem do resource
        Image image3 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/x.png"))); // Substitua "imagem.png" pelo caminho da sua imagem

        // Carregar a imagem do resource

        // Criar um ImageView para exibir a imagem
        ImageView x = new ImageView(image3);

        // Carregar a imagem do resource
        Image image2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/mn.png"))); // Substitua "imagem.png" pelo caminho da sua imagem

        // Criar um ImageView para exibir a imagem
        ImageView mn = new ImageView(image2);
        Image image5 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/v.png"))); // Substitua "imagem.png" pelo caminho da sua imagem

        // Criar um ImageView para exibir a imagem
        ImageView v = new ImageView(image5);
        Image image6 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/er.png"))); // Substitua "imagem.png" pelo caminho da sua imagem
        v.setTranslateY(0);
        v.setTranslateX(190);
        // Criar um ImageView para exibir a imagem
        ImageView er = new ImageView(image6);
        er.setTranslateY(0);
        er.setTranslateX(190);
        Image image4 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/next.png"))); // Substitua "imagem.png" pelo caminho da sua imagem

        // Criar um ImageView para exibir a imagem
        ImageView next = new ImageView(image4);
        x.setTranslateX(220);
        x.setTranslateY(-80);
        next.setTranslateX(200);
        next.setTranslateY(20);
        mn.setTranslateX(185);
        mn.setTranslateY(-80);
        mn.setOnMouseClicked(event -> {
            primaryStage.setIconified(true); // Minimiza a janela
        });

        // Adiciona um evento de fechar a tela
        x.setOnMouseClicked(event -> {
            // Fecha a aplicação quando a imagem é clicada
            Platform.exit();
        });

        // Criar um ImageView para exibir a imagem
        // Cria um ImageView para exibir a imagem
        Image backgroundImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/or.png")));
        ImageView backgroundView = new ImageView(backgroundImage);
        // Cria um Text para exibir a mensagem
        Text text = new Text(message);
        text.setFont(Font.font("Arial", FontWeight.BOLD,15));
        Text text2 = new Text("Você estudou 1 hora ou mais hoje?\ndigite" +
                " Sim ou Não");
        text2.setFont(Font.font("Arial", FontWeight.BOLD,15));
        Text text3 = new Text("Você fez exercícos por 40 minutos?\ndigite" +
                " Sim ou Não");
        text3.setFont(Font.font("Arial", FontWeight.BOLD,15));
        Text text4 = new Text("Você se alimentou no horário correto?\ndigite" +
                " Sim ou Não");
        text4.setFont(Font.font("Arial", FontWeight.BOLD,15));
        Text text5 = new Text("Organizou seu horário de dormir?\ndigite" +
                " Sim ou Não");
        text5.setFont(Font.font("Arial", FontWeight.BOLD,15));

        text.setFill(Color.BLUE);
        text.setTranslateY(0);
        text.setTranslateX(0);
        text2.setTranslateY(0);
        text2.setTranslateX(0);
        text3.setTranslateY(0);
        text3.setTranslateX(0);
        v.setOpacity(0);
        er.setOpacity(0);

        // Cria um TextField para o campo de entrada
        TextField textField = new TextField();
        textField.setPromptText("Digite a resposta aqui");
        TextField textField2 = new TextField();
        textField.setPromptText("Digite a resposta aqui");
        TextField textField3 = new TextField();
        textField.setPromptText("Digite a resposta aqui");
        TextField textField4 = new TextField();
        textField.setPromptText("Digite a resposta aqui");
        textField.setMaxWidth(100);
        textField2.setMaxWidth(100);
        textField3.setMaxWidth(100);
        textField4.setMaxWidth(100);



// Adiciona um evento de ação para o TextField
        textField.setOnAction(event -> {
            String userInput = textField.getText().trim();

            // Variável para decremento
            // Cria uma transição de opacidade para o primeiro elemento
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1.5), v);
            fadeTransition.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition.setCycleCount(1);
            // Número de ciclos
            // Cria uma transição de opacidade para o segundo elemento
            FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1.5), er);
            fadeTransition2.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition2.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition2.setCycleCount(1); // Número de ciclos

            // Verifica se a entrada do usuário é igual a "sim" (ignorando maiúsculas e minúsculas)
            if (userInput.equalsIgnoreCase("sim")) {

                soma+=25.0;
                // Inicia a transição para  primeiro elemento quando a condição for verdadeira
                fadeTransition.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,v,text3,textField2);
                primaryStage.setScene(new Scene(novoPane, 500, 200));
            } else if(userInput.equalsIgnoreCase("não")) {
                // Inicia a transição para o segundo elemento quando a condição for falsa
                fadeTransition2.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,er,text3,textField2);
                primaryStage.setScene(new Scene(novoPane, 500, 200));

            }else{


            }
        });

        textField2.setOnAction(event -> {
            String userInput = textField2.getText().trim();

            // Cria uma transição de opacidade para o primeiro elemento
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1.5), v);
            fadeTransition.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition.setCycleCount(1); // Número de ciclos

            // Cria uma transição de opacidade para o segundo elemento
            FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1.5), er);
            fadeTransition2.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition2.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition2.setCycleCount(1); // Número de ciclos

            // Verifica se a entrada do usuário é igual a "sim" (ignorando maiúsculas e minúsculas)
            if (userInput.equalsIgnoreCase("sim")) {
                // Inicia a transição para o primeiro elemento quando a condição for verdadeira
                fadeTransition.play();
                soma+=25.0;
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,v,text4,textField3);
                primaryStage.setScene(new Scene(novoPane, 500, 200));
            } else if(userInput.equalsIgnoreCase("não")) {
                // Inicia

                // a transição para o segundo elemento quando a condição for falsa
                fadeTransition2.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,er,text4,textField3);
                primaryStage.setScene(new Scene(novoPane, 500, 200));
            }else{


            }
        });

        textField3.setOnAction(event -> {
            String userInput = textField3.getText().trim();

            // Cria uma transição de opacidade para o primeiro elemento
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1.5), v);
            fadeTransition.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition.setCycleCount(1); // Número de ciclos

            // Cria uma transição de opacidade para o segundo elemento
            FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1.5), er);
            fadeTransition2.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition2.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition2.setCycleCount(1); // Número de ciclos

            // Verifica se a entrada do usuário é igual a "sim" (ignorando maiúsculas e minúsculas)
            if (userInput.equalsIgnoreCase("sim")) {
                // Inicia a transição para o primeiro elemento quando a condição for verdadeira
                soma+=25.0;
                fadeTransition.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,v,textField4,text5);
                primaryStage.setScene(new Scene(novoPane, 500, 200));
            } else if(userInput.equalsIgnoreCase("não")) {
                // Inicia a transição para o segundo elemento quando a condição for falsa
                fadeTransition2.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,er,textField4,text5);
                primaryStage.setScene(new Scene(novoPane, 500, 200));}else{

            }
        });
        textField4.setOnAction(event -> {
            String userInput = textField4.getText().trim();

            // Cria uma transição de opacidade para o primeiro elemento
            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1.5), v);
            fadeTransition.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition.setCycleCount(1); // Número de ciclos

            // Cria uma transição de opacidade para o segundo elemento
            FadeTransition fadeTransition2 = new FadeTransition(Duration.seconds(1.5), er);
            fadeTransition2.setFromValue(1); // Opacidade inicial (totalmente opaca)
            fadeTransition2.setToValue(0);   // Opacidade final (totalmente transparente)
            fadeTransition2.setCycleCount(1); // Número de ciclos

            // Verifica se a entrada do usuário é igual a "sim" (ignorando maiúsculas e minúsculas)
            if (userInput.equalsIgnoreCase("sim")) {
                soma+=25.0;

                soma += getValueFromTextField(textField);
                soma += getValueFromTextField(textField2);
                soma += getValueFromTextField(textField3);
                soma += getValueFromTextField(textField4);
                Text text6 = new Text("O seu progresso do dia foi:\n"+soma+"%");

                text6.setFont(Font.font("Arial", FontWeight.BOLD,15));;
                fadeTransition.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,v,text6);
                primaryStage.setScene(new Scene(novoPane, 500, 200));
            } else if(userInput.equalsIgnoreCase("não")) {
                // Inicia a transição para o segundo elemento quando a condição for falsa
                soma += getValueFromTextField(textField);
                soma += getValueFromTextField(textField2);
                soma += getValueFromTextField(textField3);
                soma += getValueFromTextField(textField4);
                Text text6 = new Text("O seu progresso do dia foi:\n"+soma+"%");

                text6.setFont(Font.font("Arial", FontWeight.BOLD,15));
                fadeTransition2.play();
                StackPane novoPane = new StackPane();
                novoPane.getChildren().addAll(backgroundView,x,mn,text6);
                primaryStage.setScene(new Scene(novoPane, 500, 200));
            }else{


            }
        });

        // Cria um layout StackPane para organizar a imagem e o texto
        StackPane root = new StackPane();
        root.getChildren().addAll(backgroundView, text,x,mn,next
        );
        textField.setTranslateY(40);
        textField.setTranslateX(0);
        textField2.setTranslateY(40);
        textField2.setTranslateX(0);
        textField3.setTranslateY(40);
        textField3.setTranslateX(0);
        textField4.setTranslateY(40);
        textField4.setTranslateX(0);
        next.setOnMouseClicked(event -> {
            // Cria a nova cena com a segunda imagem
            StackPane stackPane = new StackPane();
            stackPane.getChildren().addAll(backgroundView,x,mn,text2,textField,v,er);
            Scene newScene = new Scene(stackPane, 500, 200);

            // Define a nova cena no palco
            primaryStage.setScene(newScene);
        });

        // Configura a cena e exibe a janela
        Scene scene = new Scene(root, 500, 200);

        // Oculta o menu de fechar e minimizar e define o fundo da janela como transparente
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mensagem Diária Personalizada");
        primaryStage.show();
    }

    private int getValueFromTextField(TextField textField) {
        return 0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}