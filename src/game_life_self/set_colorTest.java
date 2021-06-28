package game_life_self;

import static org.junit.Assert.*;

import java.awt.Color;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

public class set_colorTest {
	public boolean [][] state_one=new boolean[30][30];
    public JPanel[][] jPanel=new JPanel[30][30];
	//private JPanel True;
	private JPanel True;
    
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPaint() {
		 for(int i = 0;i<state_one.length - 1;i++) {
				for(int j = 0;j<state_one[i].length - 1;j++) {
					jPanel[i][j]=new JPanel();
					jPanel[i][j].setBackground(Color.black);
					
					
				}
			}

		 set_color sc = new set_color(state_one,jPanel);
		 
		 sc.paint();
		for(int i = 0;i<state_one.length - 1;i++) {
			for(int j = 0;j<state_one[i].length - 1;j++) {
				assertEquals(Color.black,jPanel[i][j]);
			}
		}
		
	}

}
