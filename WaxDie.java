
public class WaxDie extends Cube implements Comparable<Object3D> , Meltable {
	
	public WaxDie(String _name, double _edge) {
		super(_name , Material.Wax, _edge);
		 
	}
	@Override
	public double getVolume() {
		double volume = Math.pow(edge, 3);
		return volume;
	}
	
	@Override
	public double getSurface() {
		double SurfaceArea = 6.0 * Math.pow(edge, 2);
		return SurfaceArea;
	}
	
	
	public double getEdge() {
		return this.edge;
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
		double radius = Math.cbrt((3 * volume) / (4 * PI));
		return new Sphere(this.getName(),this.getMaterial(),radius);
	}
	
	
	
	
}
