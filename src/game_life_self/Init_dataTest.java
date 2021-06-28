package game_life_self;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Init_dataTest {
	private boolean[][] state=new boolean[30][30];
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public final void testInit_one() {
        for(int i=1;i<state.length;i++)
        {
            for(int j=1;j<state[i].length-1;j++)
            {
                assertEquals(false,state[i][j]);
            }
	}
}
}