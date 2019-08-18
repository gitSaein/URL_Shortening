package com.saein.URL_Shortening.service;


/**
 * @author saein
 *
 */
public class Base62 {
	private static char[] Base62= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

	public static String encode(int param) {
        final StringBuilder sb = new StringBuilder();
        do {
            int i = param % Base62.length;
            sb.append(Base62[i]);
            param /= Base62.length;
        } while (param > 0);
        return sb.toString();
    }
	
    public static int decoding(String value) {
        int result=0;
        int power=1;
        for (int i = 0; i < value.length(); i++) {
            int digit = new String(Base62).indexOf(value.charAt(i));
            result += digit * power;
            power *= 62;
        }
        return result;
    }

}
