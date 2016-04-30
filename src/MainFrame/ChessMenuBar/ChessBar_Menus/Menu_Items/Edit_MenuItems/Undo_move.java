package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Edit_MenuItems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Container;
import MainFrame.ChessFrame.MainPanel;

public class Undo_move extends JMenuItem {

    private class UndoAction extends AbstractAction {
        private MainPanel panel;

        public UndoAction(MainPanel panel) {
            super("Undo Move");
            this.panel = panel;
        }
        
        public void actionPerformed(ActionEvent e) {
            Container topLevel = ((JComponent) ((JPopupMenu) getParent()).getInvoker()).getTopLevelAncestor();

            String error = panel.undoMove();
            if (!error.equals("")) {
                JOptionPane.showMessageDialog(topLevel, error);
            }
        }
    }

    /**
     * Creates a new instance of Undo_move
     */
    public Undo_move(MainPanel panel) {
        setAction(new UndoAction(panel));
    }

}
