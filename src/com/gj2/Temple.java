package com.gj2;

public class Temple {
	public int zeal;
	public int maxProgress;
	public int progress;
	
	public Temple (int zeal, int maxProgress, int progress) {
		this.zeal = zeal;
		this.maxProgress = maxProgress;
		this.progress = progress;
	}
	
	public void update(double zeal2, double progress2) {
		this.zeal += zeal2;
		this.progress += progress2;
	}
}

