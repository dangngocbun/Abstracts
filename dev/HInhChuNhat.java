package advance.dev;

public class HInhChuNhat extends Hinh {
	private double dai;
	private double rong;
	private double banKinh;
	public HInhChuNhat(double dai, double rong, double banKinh) {
		super();
		this.dai = dai;
		this.rong = rong;
		this.banKinh = banKinh;
	}
	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return (dai + rong)	*2;
	}
	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return (dai + rong);
	}
}