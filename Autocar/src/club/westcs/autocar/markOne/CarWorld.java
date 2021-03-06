package club.westcs.autocar.markOne;
import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class CarWorld extends ActorWorld{
	
	public CarWorld(Grid boundedGrid) {
		super(boundedGrid);
	}

	@Override
	public void step() {
		 Grid<Actor> gr = getGrid();
	        ArrayList<Actor> actors = new ArrayList<Actor>();
	        for (Location loc : gr.getOccupiedLocations())
	            actors.add(gr.get(loc));
	       // Thread[] threads = new Thread[actors.size()];
	        for (int i= 0; i < actors.size();i++) 
	        {
	        	Actor a = actors.get(i);
	            if (a.getGrid() == gr && !(a instanceof Rock)) {
//	            Thread t1 = new Thread(new Runnable() 
//	            			{
//	            		        public void run()
//	            		        {    
	            		            a.act();
//	            		       }
//	            			});
//	            	threads[i] = t1; 
	            	if(a.getGrid() == gr && a instanceof Car && ((Car) a).getEnder()) {
	            		new Rock().putSelfInGrid(getGrid(), a.getLocation());
	            	}
	                  
	            }
	        }
//	        for(Thread t: threads) {
//	        	t.start();
//	        }
	}

}
