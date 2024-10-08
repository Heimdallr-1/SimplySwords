package net.sweenus.simplyswords.util;

import net.minecraft.text.Style;
import net.minecraft.text.TextColor;

public class Styles {
	public static Style COMMON = color(0xFFFFFF);
	public static Style RUNIC = color(0x9D62CA);
	public static Style UNIQUE = color(0xE2A834);
	public static Style LEGENDARY = color(0xE26234);
	public static Style NETHERFUSED = LEGENDARY;
	public static Style RIGHT_CLICK = color(0x20BD69);
	public static Style CORRUPTED = color(0x544988);
	public static Style CORRUPTED_LIGHT = color(0x7140A3);
	public static Style CORRUPTED_ABILITY = color(0xA987C2);
	public static Style CORRUPTED_TEXT = color(0x7E7883);
	public static Style TEXT = color(0xE0E0E0);

	private static Style color(int color) {
		return Style.EMPTY.withColor(TextColor.fromRgb(color));
	}

}