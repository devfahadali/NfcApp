package com.example.nfcapp

/**
 *@Author: Fahad Ali
 *@Email:  dev.fahadshabbir@gmail.com
 *@Date: 07/05/2024
 */
enum class NFCStatus {
    NoOperation,
    Tap,
    Process,
    Confirmation,
    Read,
    Write,
    NotSupported,
    NotEnabled,
}