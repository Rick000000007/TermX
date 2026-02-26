<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.termux.app">

    <!-- Internet -->
    <uses-permission android:name="android.permission.INTERNET" />

    <!-- Storage (Termux needs this) -->
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"
        android:maxSdkVersion="28" />

    <application
        android:allowBackup="true"
        android:label="TermX"
        android:icon="@mipmap/ic_launcher"
        android:theme="@style/Theme.Material3.DayNight.NoActionBar">

        <!-- 🔷 Modern Compose UI Launcher -->
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

        <!-- 🔥 Real Termux Backend Activity -->
        <activity
            android:name=".TermuxActivity"
            android:exported="false" />

        <!-- ⚙ Termux Background Service -->
        <service
            android:name=".TermuxService"
            android:exported="false" />

    </application>

</manifest>
