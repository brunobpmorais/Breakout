package game_dh224;

import javafx.scene.image.Image;

public class speedPlusBlock extends Block{
	
	public speedPlusBlock(Image image) {
		super(image);
	}
	
	@Override
	public int getVal() {
		return 2;
	}
	
	@Override
	public void bounceBlock (Bouncer myBouncer) {
		if(myBouncer.getX() > this.getX() && myBouncer.getX() < (this.getX() + BLOCK_WIDTH) && 
				myBouncer.getView().getBoundsInParent().intersects(this.getView().getBoundsInParent())) {
			myBouncer.yDirection *= -1.5;
		} else if (myBouncer.getY() > this.getY() && myBouncer.getY() < (this.getY() + BLOCK_HEIGHT) && 
				myBouncer.getView().getBoundsInParent().intersects(this.getView().getBoundsInParent())) {
			myBouncer.xDirection *= -1.5;
		}
	}
}

