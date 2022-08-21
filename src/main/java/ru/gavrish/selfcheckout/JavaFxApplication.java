package ru.gavrish.selfcheckout;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.ArrayList;

public class JavaFxApplication extends Application{

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        String[] args = getParameters().getRaw().toArray(new String[0]);

        this.applicationContext = new SpringApplicationBuilder()
                .sources(SelfCheckoutApplication.class)
                .run(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Registration Form JavaFX Application");

        GridPane gridPane = createRegistrationFormPane();

        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private GridPane createRegistrationFormPane() {
        GridPane gridPane = new GridPane();

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(40, 40, 40, 40));

        gridPane.setHgap(10);

        gridPane.setVgap(10);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {

        Label headerLabel = new Label("Кофемат");
        headerLabel.setFont(Font.font("Times new roman", FontWeight.BOLD, 27));
        gridPane.add(headerLabel, 2, 0, 2, 1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0, 90, 0));


        Label productList = new Label("Список товаров");
        gridPane.add(productList, 0, 1);

        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product("Говядина", 700));
        product.add(new Product("Форель", 450));
        product.add(new Product("Паста", 250));
        product.add(new Product("Вино", 400));
        product.add(new Product("Багет", 120));
        product.add(new Product("Пиво", 100));
        product.add(new Product("Томаты", 100));
        product.add(new Product("Огурцы", 70));
        product.add(new Product("Лук", 40));
        product.add(new Product("Картофель", 60));
        product.add(new Product("Клубника", 220));
        product.add(new Product("Апельсины", 125));
        product.add(new Product("Бананы", 80));
        product.add(new Product("Вишня", 110));
        product.add(new Product("Киви", 160));
        product.add(new Product("Нектарины", 170));


        VBox strings = new VBox();

        HBox buttonBox = new HBox();

        ComboBox<Product> productBox = new ComboBox<>();

        productBox.getItems().addAll(product);

        gridPane.add(productBox, 1, 1);

        strings.setPadding(new Insets(10, 30, 10, 30));
        strings.setSpacing(20);


        Label search = new Label("Поиск");
        gridPane.add(search, 4, 1);

        TextField search2 = new TextField();
        search2.setPrefHeight(40);
        gridPane.add(search2, 5, 1);

        Label cart = new Label("Корзина");
        gridPane.add(cart, 0, 18);

        PasswordField passwordField = new PasswordField();
        passwordField.setPrefHeight(40);
        gridPane.add(passwordField, 1, 18);

        Button submitButton = new Button("Оплатить");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 5, 18, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(10, 0, 20, 0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (search.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Поиск не задан!");
                    return;
                }
                if (passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Корзина пуста!");
                    return;
                }

                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Операция завершена!");
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    @Override
    public void stop() {
        this.applicationContext.close();
        Platform.exit();
    }
    static class Product {

        String name;
        int price;

        Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name;
        }
        public String getPrice() {
            return String.valueOf(price);
        }
    }
}