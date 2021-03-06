package com.inuker.bluetooth.library.beacon;

/**
 * Created by liwentian on 2016/9/5.
 */
public class BeaconItem {

    /**
     * 广播中声明的长度
     */
    public int len;

    /**
     * 广播中声明的type
     */
    public int type;

    /**
     * 广播中的数据部分
     */
    public byte[] bytes;

    @Override
    public String toString() {
        String format = "";

        StringBuilder sb = new StringBuilder();

//        sb.append(String.format("len: %02d", len));
        sb.append(String.format("@T: 0x%02X", type));

        switch (type) {
            case 8:
            case 9:
                format = "%c";
                break;
            default:
                format = "%02X ";
                break;
        }

        sb.append(" -> ");

        for (byte b : bytes) {
            sb.append(String.format(format, b));
        }

        return sb.toString();
    }
}
