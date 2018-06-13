package club.westcs.autocar.markOne;

import java.awt.Color;

import info.gridworld.actor.Flower;

public class Blur extends Flower{
	
	private int lifeTime;
	
	public Blur( int dir) {
		super();
		this.setDirection(dir);
		setColor(Color.RED);
		lifeTime = 1;
	}
	@Override
	public void act() {
		if(lifeTime==1)
			setColor(Color.YELLOW);
		if(lifeTime == 0)
			this.removeSelfFromGrid();
		lifeTime--;
	}


}
