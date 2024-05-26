

import javax.swing.JPanel;
import java.awt.*;

public class BoardPanel extends JPanel {
    private static final long serialVersionUID = -1102632585936750607L;
    public static final int COL_COUNT = 25;
    public static final int ROW_COUNT = 25;
    public static final int TILE_SIZE = 20;
    private static final int EYE_LARGE_INSET = TILE_SIZE / 3;
    private static final int EYE_SMALL_INSET = TILE_SIZE / 6;
    private static final int EYE_LENGTH = TILE_SIZE / 5;
    private static final Font FONT = new Font("Tahoma", Font.BOLD, 25);
    private SnakeGame game;
    private TileType[] tiles;

    public BoardPanel(SnakeGame game) {
        this.game = game;
        this.tiles = new TileType[ROW_COUNT * COL_COUNT];

        setPreferredSize(new Dimension(COL_COUNT * TILE_SIZE, ROW_COUNT * TILE_SIZE));
        setBackground(Color.BLACK);
    }

    //Clear ban choi hien tai
    public void clearBoard() {
        for(int i = 0; i < tiles.length; i++) {
            tiles[i] = null;
        }
    }

    //Thay doi tile
    public void setTile(Point point, TileType type) {
        setTile(point.x, point.y, type);
    }
    public void setTile(int x, int y, TileType type) {
        tiles[y * ROW_COUNT + x] = type;
    }

    //Lay tile
    public TileType getTile(int x, int y) {
        return tiles[y * ROW_COUNT + x];
    }


}

