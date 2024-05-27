

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

    private void drawTile(int x, int y, TileType type, Graphics g) {

        switch(type) {
            //Thuc an
            case Fruit:
                g.setColor(Color.RED);
                g.fillOval(x + 2, y + 2, TILE_SIZE - 4, TILE_SIZE - 4);
                break;
            //Vat can(Tuong)
            case Wall:
                g.setColor(Color.YELLOW);
                g.fillRect(x, y, TILE_SIZE, TILE_SIZE);
                break;
            //Than ran
            case SnakeBody:
                g.setColor(Color.LIGHT_GRAY);
                g.fillOval(x + 2, y + 2, TILE_SIZE - 2 , TILE_SIZE - 2);
                break;
            //Dau ran
            case SnakeHead:
                g.setColor(Color.GREEN);
                g.fillOval(x + 2, y + 2, TILE_SIZE - 2 , TILE_SIZE - 2);
                g.setColor(Color.BLACK);

//                switch(game.getDirection()) {
//                    //Di len
//                    case Up: {
//                        int baseY = y + EYE_SMALL_INSET;
//                        g.drawLine(x + EYE_LARGE_INSET, baseY, x + EYE_LARGE_INSET, baseY + EYE_LENGTH);
//                        g.drawLine(x + TILE_SIZE - EYE_LARGE_INSET, baseY, x + TILE_SIZE - EYE_LARGE_INSET, baseY + EYE_LENGTH);
//                        break;
//                    }
//                    //Di xuong
//                    case Down: {
//                        int baseY = y + TILE_SIZE - EYE_SMALL_INSET;
//                        g.drawLine(x + EYE_LARGE_INSET, baseY, x + EYE_LARGE_INSET, baseY - EYE_LENGTH);
//                        g.drawLine(x + TILE_SIZE - EYE_LARGE_INSET, baseY, x + TILE_SIZE - EYE_LARGE_INSET, baseY - EYE_LENGTH);
//                        break;
//                    }
//                    //Di sang trai
//                    case Left: {
//                        int baseX = x + EYE_SMALL_INSET;
//                        g.drawLine(baseX, y + EYE_LARGE_INSET, baseX + EYE_LENGTH, y + EYE_LARGE_INSET);
//                        g.drawLine(baseX, y + TILE_SIZE - EYE_LARGE_INSET, baseX + EYE_LENGTH, y + TILE_SIZE - EYE_LARGE_INSET);
//                        break;
//                    }
//                    //Di sang phai
//                    case Right: {
//                        int baseX = x + TILE_SIZE - EYE_SMALL_INSET;
//                        g.drawLine(baseX, y + EYE_LARGE_INSET, baseX - EYE_LENGTH, y + EYE_LARGE_INSET);
//                        g.drawLine(baseX, y + TILE_SIZE - EYE_LARGE_INSET, baseX - EYE_LENGTH, y + TILE_SIZE - EYE_LARGE_INSET);
//                        break;
//                    }
//
//                }
                break;
        }
    }
}

