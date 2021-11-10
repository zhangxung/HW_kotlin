package com.example.ch5

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainActivity2 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MainActivity2","onCreate")
    }
    //在 onCreateView 中定義 FirstFragment 的畫面為 fragment_first
    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("MainActivity2","onCreateView")
        return inflater.inflate(R.layout.activity_main2, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("MainActivity2","onActivityCreated")
    }
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity2","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("MainActivity2","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity2","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("MainActivity2","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("MainActivity2","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity2","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("MainActivity2","onDetach")
    }
}