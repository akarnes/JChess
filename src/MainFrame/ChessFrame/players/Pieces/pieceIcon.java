package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Toolkit;

public class pieceIcon {

    private Toolkit kit = Toolkit.getDefaultToolkit();
    private Image image;
    private String name;

    public pieceIcon(String NameIcon) //throws IOException
    {

        image = kit.getImage(NameIcon);
    }

    /**
     * Creates a clone of the give piece icon.
     * @param icon the icon to clone
     */
    public pieceIcon(pieceIcon icon) {
        image = icon.image;
    }

    public Image returnPieceIcon() {
        return image;
    }

}
