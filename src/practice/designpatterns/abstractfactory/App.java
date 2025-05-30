package practice.designpatterns.abstractfactory;

public class App {
    private Button button;
    private Checkbox checkbox;

    public App(UIFactory uiFactory)
    {
        button= uiFactory.createButton();
        checkbox = uiFactory.createCheckbox();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args){
        UIFactory factory =  new WindowsFactory();
        App app = new App(factory);
        app.renderUI();

        UIFactory factory2 =  new MacFactory();
        App app2 = new App(factory2);
        app2.renderUI();
    }
}

/*
✔ WHEN to use:
   - When your code needs to create **related objects**.
   - When you want to switch between **families of products** easily.
   - When enforcing consistency between related objects is important.

✔ WHERE to use:
   - GUI toolkits: light/dark themes with matching buttons, inputs
   - Cross-platform UIs: WindowsFactory, MacFactory, LinuxFactory
   - Database access layers: OracleFactory, MySQLFactory
   - Game development: enemy factories for different levels or themes
*/

