package net.sweenus.simplyswords.power;

public class RunefusedGemPower extends GemPower {

	public RunefusedGemPower(boolean isGreater) {
		//runefused gems also work in runic weapons
		super(isGreater, PowerType.RUNIC, PowerType.RUNEFUSED);
	}
}