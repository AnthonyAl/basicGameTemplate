package com.alexandris.game.sensors;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import com.alexandris.game.core.*;

public class MouseWheelInput implements MouseWheelListener {
	
	Handler handler;
	GameObject tempObject;
	
	public MouseWheelInput(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		// Nothing to do.
	}
}
