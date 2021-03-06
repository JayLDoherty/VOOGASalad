package authoring.command;

/**
 * 
 * @author jimmy
 *
 */
public class PositionInfo extends SingleEntityCommandInfo
{

	private static final long serialVersionUID = 1199205996330909954L;
	private double xPos;
	private double yPos;
	private int zPos;

	public PositionInfo(String entityName, double xPos, double yPos, int zPos, long entityId)
	{
		super(entityName, entityId);
		this.xPos = xPos;
		this.yPos = yPos;
		this.zPos = zPos;
	}

	public double getX()
	{
		return xPos;
	}

	public double getY()
	{
		return yPos;
	}

	public int getZ()
	{
		return zPos;
	}

}
