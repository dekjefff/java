
public class ButterBall extends Sphere implements Comparable<Object3D> , Meltable{
	
	public ButterBall(String _name, double _radius) {
		super(_name , Material.Butter, _radius);
		 
	}
	
	@Override
	public double getVolume() {
		double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
		return volume;
	}
	
	@Override
	public double getSurface() {
		double SurfaceArea = 4.0 * PI * Math.pow(radius, 2);
		return SurfaceArea;
	}
	
	
	public double getRadius() {
		return this.radius;
	}
	
	public int compareTo(Object3D o) {
		
		int compare = Double.compare(this.getSurface() , o.getSurface());
		
		if(compare == 0) {
			return this.getName().compareTo(o.getName());
		}return compare;
	}
	
	@Override
	public Object3D convertToOtherShape() {
		double volume = getVolume();
		double edge = Math.cbrt(volume);
		return new Cube(this.getName(),this.getMaterial(),edge);
	}
	
}
