package com.zxfh.blereader;

public interface BLEListener {
    void onConnectGatt(int var1, Object var2);

    void onServicesDiscovered(int var1, Object var2);

    void onCharacteristicChanged(int var1, Object var2);

    void onReadRemoteRssi(int var1);

    void onOTA(int var1, Object var2);

    int onChangeBLEParameter();
}
