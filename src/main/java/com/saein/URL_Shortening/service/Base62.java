package com.saein.URL_Shortening.service;


/**
 * @author saein
 *
 */
public class Base62 {
	private static char[] Base62= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

	public static String encoding(int param) throws Exception {
        final StringBuilder sb = new StringBuilder();
        do {
            int i = param % Base62.length;
            sb.append(Base62[i]);
            param /= Base62.length;
        } while (param > 0);
        if(sb.length() <= 8) {
        	return sb.toString();
        }else {
        	throw new Exception("URL Shortening Key 값이 8character를 초과햇습니다.");
        }
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
