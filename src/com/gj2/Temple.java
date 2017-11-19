package com.gj2;

public class Temple {
	public double zeal;
	public double maxProgress;
	public double progress;
	
	public Temple (double zeal, double maxProgress, double progress) {
		this.zeal = zeal;
		this.maxProgress = maxProgress;
		this.progress = progress;
	}
	 
	public void update(double zeal2, double progress2) {
		this.zeal += zeal2;
		this.progress += progress2;
	}
}

