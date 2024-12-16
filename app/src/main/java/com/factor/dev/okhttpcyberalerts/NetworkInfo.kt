package com.factor.dev.okhttpcyberalerts


data class NetworkInfo(
    val networks: Networks
) {
    data class Networks(
        val WiFi: WiFi?,
        val MobileData: MobileData?
    )

    data class WiFi(
        val SSID: String?,
        val BSSID: String?,
        val ipAddress: String?,
        val linkSpeedMbps: Int?,
        val frequencyMHz: Int?,
        val signalStrengthRSSI: Int?
    )

    data class MobileData(
        val operatorName: String?,
        val networkType: String?,
        val signalStrengthRSSI: Int?,
        val isRoaming: Boolean?
    )
}
