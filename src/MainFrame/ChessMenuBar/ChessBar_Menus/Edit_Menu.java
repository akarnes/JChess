package MainFrame.ChessMenuBar.ChessBar_Menus;

import javax.swing.JMenu;
import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Edit_MenuItems.Redo_move;
import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Edit_MenuItems.Undo_move;
import MainFrame.ChessFrame.MainPanel;

public class Edit_Menu extends JMenu {

    /**
     * Creates a new instance of Edit_Menu
     */
    public Edit_Menu(MainPanel panel) {
        setText("Edit");
        Uitem = new Undo_move(panel);
        add(Uitem);
        Ritem = new Redo_move(panel);
        add(Ritem);
    }

    private final Undo_move Uitem;
    private final Redo_move Ritem;
}
