package game_dh224;

import javafx.scene.image.Image;

public class blackHoleBlock extends Block{
	
	public blackHoleBlock(Image image) {
		super(image);
	}
	
	@Override
	public int getVal() {
		return -1;
	}
}
