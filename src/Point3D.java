
public class Point3D {

	private double xCoord, yCoord, zCoord;
	public double getX() { return xCoord; }
	public double getY() { return yCoord; }
	public double getZ() { return zCoord; }
	
	public String toString () { return "("+xCoord+", "+yCoord+
			", "+zCoord+")"; }
	public static void main(String[] args){
		Point3D pt3d = new Point3D();
		pt3d.xCoord = Math.sqrt(3);
		pt3d.yCoord = -12;
		pt3d.zCoord = 88;
		System.out.println(pt3d);
	}

}
