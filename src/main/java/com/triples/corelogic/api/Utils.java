package com.triples.corelogic.api;

public class Utils {
	public static void appendOptional(StringBuilder sb, String name, Integer value) {
		if (value != null) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
			sb.append(name).append(value);
		}
	}

	public static void appendOptional(StringBuilder sb, String name, Boolean value) {
		if (value != null) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
			sb.append(name).append(value);
		}
	}

	public static void appendOptional(StringBuilder sb, String name, String value) {
		if (value != null) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
			sb.append(name).append(value);
		}
	}
}
