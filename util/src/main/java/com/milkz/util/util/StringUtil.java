package com.milkz.util.util;

/**
 * Create by zuoqi@bhz.com.cn on 2019/4/8 18:31
 */
public class StringUtil {

    /**
     * byte array format to hex string
     *
     * @param src byte array
     * @return hex string
     */
    public static String bytesToHexString(byte[] src) {

        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte aSrc : src) {
            int v = aSrc & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * hex string format to byte array
     *
     * @param hexStr hex string
     * @return byte array
     */
    public static byte[] hexStringToByteArray(String hexStr){
        int len = hexStr.length()/2;
        byte[] result = new byte[len] ;
        for(int i=0;i<len;i++){
            result[i] = (byte) Integer.parseInt(hexStr.substring(2*i,2*i+2),16);
        }
        return result;
    }
}
