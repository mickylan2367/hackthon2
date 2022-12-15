package com.example.p2hacksapp

//ログイン後に再生させる
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.widget.MediaController
import android.widget.VideoView

class VideoActivity : AppCompatActivity() {
    private val video = findViewById<VideoView>(R.id.videoView1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        Handler(mainLooper).postDelayed( {
            video.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.warp))
            video.setOnPreparedListener {
                video.start()
                video.setMediaController(MediaController(this))
            }

            video.setOnCompletionListener {
                finish()
            }
        }, 200)
    }

//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        when(event?.action){
//            MotionEvent.ACTION_DOWN -> {
//                video.pause()
//                val intent = Intent(this, CalenderActivity::class.java)
//                startActivity(intent)
//            }
//        }
//        return super.onTouchEvent(event)
//    }
//
//    override fun onResume() {
//        // 途中でアプリが止まったら再開
//        super.onResume()
//        video.start()
//    }

}