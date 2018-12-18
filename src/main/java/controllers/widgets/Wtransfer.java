package controllers.widgets;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Created by Jack on 18.12.2018.
 */
public class Wtransfer {
    private String fxmlUrl;
    private String title;
    private Stage stage;
    private FXMLLoader loader;
    private AnchorPane anchorPane;

    public Wtransfer(String fxmlUrl, String title) {
        this.fxmlUrl = fxmlUrl;
        this.title = title;
        this.init();
    }

    public Wtransfer(AnchorPane anchorPane, String fxmlUrl) {
        this.anchorPane = anchorPane;
        this.fxmlUrl = fxmlUrl;
        this.prepareInit();
    }

    private void prepareInit()
    {
        System.out.println(fxmlUrl);
        if(anchorPane.getChildren() != null && anchorPane.getChildren().size() > 0)
            this.anchorPane.getChildren().clear();
        loader = new FXMLLoader(getClass().getClassLoader().getResource(this.fxmlUrl));
        try {
            anchorPane.getChildren().add(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void init() {
        try {
            System.out.println(fxmlUrl);
            loader = new FXMLLoader();
            Parent root = loader.load(this.getClass().getClassLoader().getResource(fxmlUrl));
            stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY);
            stage.setFullScreen(true);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setFullScreen(boolean yes){
        this.stage.setFullScreen(yes);
    }
    public void setStageStyle(StageStyle stageStyle){
        this.stage.initStyle(stageStyle);
    }
    public void show(){
        this.stage.show();
    }
    public <T> T getController(){
        return loader.getController();
    }


}
