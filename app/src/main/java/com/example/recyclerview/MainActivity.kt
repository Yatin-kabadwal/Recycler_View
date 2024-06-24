package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var myRecyclerView :RecyclerView
    lateinit var newsArrayList : ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)
        var newsImageArray = arrayOf(
            R.drawable.hg,
            R.drawable.hac,
            R.drawable.coolmountain,
            R.drawable.illu,
            R.drawable.madra,
            R.drawable.mail,
            R.drawable.hdhub4u,
            R.drawable.mountain
        )
        var newsHeadingArray = arrayOf(
            "Hi there I am the king of my world",
            "lo lo  oajdlf alsjd fasdfjajsdfjasdofj0ssdffj aj oajds f",
            "I am kaka the boss",
            "Kaka slips of and want to go back to the hill",
            "NO no the writer wants to ellaborae it but with different meaning ",
            "The poem that was granted to the lawyer was not to much suspecious to call",
            "Hello hello nice to meet you ",
            "asdjfh aksdjfhui ad asudfdfa aoduhfaufa 98yasd9fhdjdjfh as9fda0w2wrhj "
        )
        myRecyclerView.layoutManager =LinearLayoutManager(this)
        newsArrayList = arrayListOf<News>()

        for( index in newsImageArray.indices){
            val news = News(newsHeadingArray[index],newsImageArray[index])
            newsArrayList.add(news)
        }
        myRecyclerView.adapter = MyAdapter(newsArrayList,this)
    }
}