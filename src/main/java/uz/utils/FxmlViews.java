package uz.utils;

/**
 * Created by Jack on 18.12.2018.
 */
public interface FxmlViews {
    interface Login{
        String loginView = "views/Login.fxml";
    }
    interface MainScreen{
        String navMenu = "views/NavMenu.fxml";
        String settings = "views/Settings.fxml";
        String changePassword = "views/ChangePass.fxml";
        String mainSc = "views/MainScreen.fxml";
    }
    interface Addition{
        String askedExit = "views/ExitDialog.fxml";
        String addDialogA = "views/AddDialogArrive.fxml";
        String addDialogD = "views/AddDialogDepature.fxml";
        String addAirLinesModal = "views/AddAirlines.fxml";
    }
}
