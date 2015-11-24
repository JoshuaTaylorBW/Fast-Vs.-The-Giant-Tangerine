import java.awt.image.BufferedImage;

public class Tile {

	private BufferedImage image;
	private int type;
	
	//tile types
	public static final int NORMAL = 0;//air
	public static final int BLOCKED = 1;
	
	public Tile(BufferedImage image, int type){ //dv
		this.image = image;
		this.type = type;
	}
	public BufferedImage getImage(){return image;}
	public int getType(){return type;}
}
