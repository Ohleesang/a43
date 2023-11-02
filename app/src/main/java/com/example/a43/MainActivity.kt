package com.example.a43

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(t: String, p: String): Int {
                var answer: Int = 0
                //문자열 n만큼 나누기!
                for(i in 0 until t.length-(p.length-1)){
                    if(p >= t.substring(i..i+p.length-1))
                    answer++
                }
                return answer
            }
        }
        val a = Solution()
        a.solution("3141592","271")
        a.solution("500220839878","7")
        a.solution("10203","15")
    }
}