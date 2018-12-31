package strings;
// Переопределяем метод toString() для класса Box.
class Box {
	double width;
	double height;
	double depth;
	Box(double w, double h, double d) {
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	public String toString() { // Перегруженная (переопределённая) версия метода toString().
		return "Размеры: "+this.width+" на "+this.depth+" на "+this.height+".";
	}

}
