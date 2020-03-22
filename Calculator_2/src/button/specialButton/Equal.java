package button.specialButton;

import java.util.Queue;

import calculate.Calculate;
import checker.CheckAll;
import processing.core.*;
import screen.Screen;

public class Equal extends SpecialButton{
	
	/**
	 * Class Equal 
	 * untuk menampilkan hasil operasi
	 */
	
	private double ans;
	
	/**
	 * Constructor untuk membuat Equal
	 * 
	 * @param papplet (Processing sketch) 
	 * @param positionX (Lokasi koordinat X pada layar)
	 * @param positionY (Lokasi koordinat Y pada layar)
	 * @param sizeX (Ukuran X pada layar)
	 * @param sizeY (Ukuran Y pada layar)
	 * @param r (Color red code)
	 * @param g (Color green code)
	 * @param b (Color blue code)
	 */
	public Equal(PApplet papplet, float positionX, float positionY, float sizeX, float sizeY, int r, int g, int b) {
		super(papplet, "=", positionX, positionY, sizeX, sizeY, r, g, b);
		this.ans = -923485;
	}
	
	/**
	 * @return Menunjukkan ketersediaan tombol
	 * @param screen
	 * @param history
	 */
	@Override
	public boolean isAvailable(Screen screen, Queue<String> history) {
		return true;
	}
	
	/**
	 * Fungsi tombol Equal untuk menampilkan pada layar
	 * hasil perhitungan dari suatu operasi
	 * 
	 * @param screen
	 * @param history
	 */
	@Override
	public void function(Screen screen, Queue<String> history) {
		CheckAll checker = new CheckAll();
		Calculate calculate = new Calculate();
		try {
			checker.check(screen.getShow());
			String answer = calculate.calculate(screen.getShow(), this.ans);
			screen.setShow(answer);
			this.ans = Double.parseDouble(answer);
		}
		catch(Exception e) {
			System.out.println(e);
			screen.setShow("Error");
		}
	}
	
	@Override
	public void render() {
		super.render();
		papplet.textSize(15);
		papplet.fill(15);
		papplet.textAlign(PConstants.CENTER, PConstants.CENTER);
		papplet.text(this.getValue(), (this.positionX + this.sizeX/2), (this.positionY + this.sizeY/2));
	}
}
