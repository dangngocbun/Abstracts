package advance.dev;

public class HinhTron extends Hinh {
	private double banKinh;
	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}
	double chuVi() {
		return (banKinh *2 * Math.PI);
	}
	double dienTich() {
		return banKinh * banKinh * Math.PI;
	}
}
