package sOption.worlds;

import java.awt.*;
import sOption.Connector;
import sOption.gfx.Assets;

public class Beach extends Region
{
	public Beach(Connector c)
	{
		super(c);
		setWidth(4000);
		setHeight(3000);
		setRegion(this);
		map = Assets.beach;
		
	}

	@Override
	public boolean portalMove() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void tick() 
	{
		int xStart = (int)connector.getGameCamera().getxOffset();
		int yStart = (int)connector.getGameCamera().getyOffset();
		
		currentMap = map.crop(xStart, yStart, connector.getWidth(), connector.getHeight());
	}

	@Override
	public void render(Graphics g) 
	{
		g.drawImage(currentMap, 0, 0, connector.getWidth(), connector.getHeight(), null);
	}
	
}
