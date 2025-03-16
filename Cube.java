
class Cube extends Object3D{
	protected double edge;
	
	public Cube(String _name, Material _matType , double _edge) {
		super(_name , _matType);
		this.edge = _edge;
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
}
