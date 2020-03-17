package Server1;

import java.util.Random;

public class Woonse1 {
	private static final String[]ws= {
			"자장면",
			"금식",
			"사람조심",
	};
	public String selWoonse() {
		return ws[new Random().nextInt(ws.length)];
	}

}
