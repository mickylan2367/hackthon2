package com.example.p2hacksapp

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class CalenderActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)
        val calenderView:CalendarView = findViewById(R.id.calenderView)

        //CalendarViewの選択日を設定・取得するには、dateを使用します.
        //dateで設定・取得する値は、UNIX時間のミリ秒です。サンプルコードでは、SimpleDateFormatで年月日に変更して出力しております。

        // 初期選択日を取得
        val format = SimpleDateFormat("yyyy/MM/dd", Locale.US)

        // ５ヶ月前の日付を取得し、変更
        var calender = Calendar.getInstance()
        calender.add(Calendar.MONTH, -5)
        calenderView.minDate = calender.timeInMillis

        // 未来の選択可能日を５ヶ月後に変更
        calender = Calendar.getInstance()
        calender.add(Calendar.MONTH, 5)
        calenderView.maxDate = calender.timeInMillis
//        printline.setText(format.format(calenderView.maxDate))


        // 日付変更イベントを追加
        //日記。。。
        calenderView.setOnDateChangeListener { view, year, month, dayOfMonth ->
//            Toast.makeText(this, "" + year + "-" + (month+1) + "-" + dayOfMonth, Toast.LENGTH_LONG).show()
            val intent = Intent(this, ShowDiaryActivity::class.java)
            startActivity(intent)
        }
    }


}
