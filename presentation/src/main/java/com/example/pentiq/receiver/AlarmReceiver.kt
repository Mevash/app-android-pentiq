package com.example.pentiq.receiver

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.pentiq.R
import com.example.pentiq.scheduler.AlarmScheduler
import org.koin.java.KoinJavaComponent.getKoin


class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        scheduleNextAlarm()
        val s = "101"
        val builder = NotificationCompat.Builder(context, s)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Test title")
            .setContentText("Welcome!!!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(s, "some text", NotificationManager.IMPORTANCE_HIGH)
            NotificationManagerCompat.from(context).createNotificationChannel(notificationChannel)
        }

        NotificationManagerCompat.from(context).notify(101, builder.build())
    }

    private fun scheduleNextAlarm() {
        val alarmScheduler = getKoin().get<AlarmScheduler>()
        alarmScheduler.scheduleNext()
    }
}