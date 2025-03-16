
public class Sphere extends Object3D {
	protected double radius;
	
	public Sphere(String _name, Material _matType, double _radius) {
		super(_name , _matType );
		this.radius = _radius;
	}
	
	@Override
	public double getVolume() {
		double volume = (4.0 / 3.0) * PI * (Math.pow(radius, 3));
		return volume;
	}
	
	@Override
	public double getSurface() {
		double SurfaceArea = 4.0 * PI * (Math.pow(radius, 2));
		return SurfaceArea;
	}
	
	public double getRadius() {
		return this.radius;
	}
}
