package com.example.caitlynjeniker_a2_st10456573

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class secondPage : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var feedCountTextView: TextView
    lateinit var playCountTextView: TextView
    lateinit var cleanCountTextView: TextView
     var feedClickCount: Int = 0
     var playClickCount: Int = 0
     var cleanclickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        image = findViewById(R.id.doggy)



        feedCountTextView = findViewById(R.id.feedCount)
        playCountTextView = findViewById(R.id.playCount)
        cleanCountTextView = findViewById(R.id.cleanCount)


        val FeedBtn = findViewById<Button>(R.id.FeedBtn)
        FeedBtn.setOnClickListener {
            image.setImageResource(R.drawable.dog_eating)
            feedClickCount++
            feedCountTextView.text = "$feedClickCount"

        }
        val PlayBtn = findViewById<Button>(R.id.PlayBtn)
        PlayBtn.setOnClickListener {
            image.setImageResource(R.drawable.dog_playing)
            playClickCount++
            playCountTextView.text = "$playClickCount"
        }
        val CleanBtn = findViewById<Button>(R.id.CleanBtn)
        CleanBtn.setOnClickListener {
            image.setImageResource(R.drawable.dog_washing)
            cleanclickCount++
            cleanCountTextView.text = "$cleanclickCount"
        }
    }
}



