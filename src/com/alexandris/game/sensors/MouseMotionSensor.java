package com.alexandris.game.sensors;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import com.alexandris.game.core.*;

public class MouseMotionSensor extends MouseMotionAdapter {
	
	Handler handler;
	
	public MouseMotionSensor(Handler handler) {
		this.handler = handler;
	}
	
	public void mouseMoved(MouseEvent e) {
		Game.coordX = e.getX();
		Game.coordY = e.getY();
	}
}
