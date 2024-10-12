package assignment_1.UserInterface;

public class DarkThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
