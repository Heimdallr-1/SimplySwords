package net.sweenus.simplyswords.power;

public class NetherGemPower extends GemPower {

	public NetherGemPower(boolean isGreater) {
		//runefused gems also work in runic weapons
		super(isGreater, PowerType.RUNIC, PowerType.RUNEFUSED);
	}
}