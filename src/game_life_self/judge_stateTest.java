package game_life_self;

import static org.junit.Assert.*;

import java.awt.Color;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

public class judge_stateTest {

	 public boolean [][] state_one=new boolean [30][30];
     public JPanel[][] jPanel=new JPanel [30][30];

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testJudge() {

		 for(int i = 0;i<state_one.length - 1;i++) {
				for(int j = 0;j<state_one[i].length - 1;j++) {
					jPanel[i][j] = new JPanel();	
					state_one[i][j]=false;
					jPanel[i][j].setBackground(Color.black);
				}
				
			}

		 judge_state js = new judge_state(state_one,jPanel);
		 
		 js.judge();
		for(int i = 0;i<state_one.length - 1;i++) {
			for(int j = 0;j<state_one[i].length - 1;j++) {
				assertEquals(false,state_one[i][j]);
			}
		}
		
	     
	}

}
