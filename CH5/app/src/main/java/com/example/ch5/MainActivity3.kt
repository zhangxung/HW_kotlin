package com.example.ch5

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainActivity3 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MainActivity3","onCreate")
    }
    //在 onCreateView 中定義 SecondFragment 的畫面為 fragment_second
    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("MainActivity3","onCreateView")
        return inflater.inflate(R.layout.activity_main3, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("MainActivity3","onActivityCreated")
    }
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity3","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("MainActivity3","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity3","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("MainActivity3","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("MainActivity3","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity3","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("MainActivity3","onDetach")
    }
}