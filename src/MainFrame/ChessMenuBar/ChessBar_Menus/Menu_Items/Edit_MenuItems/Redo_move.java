package MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Edit_MenuItems;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Container;
import MainFrame.ChessFrame.MainPanel;

public class Redo_move extends JMenuItem {

    private class RedoAction extends AbstractAction {
        private MainPanel panel;

        public RedoAction(MainPanel panel) {
            super("Redo Move");
            this.panel = panel;
        }
        
        public void actionPerformed(ActionEvent e) {
            Container topLevel = ((JComponent) ((JPopupMenu) getParent()).getInvoker()).getTopLevelAncestor();

            String error = panel.redoMove();
            if (!error.equals("")) {
                JOptionPane.showMessageDialog(topLevel, error);
            }
        }
    }

    /**
     * Creates a new instance of Redo_move
     */
    public Redo_move(MainPanel panel) {
        setAction(new RedoAction(panel));
    }
    

}
