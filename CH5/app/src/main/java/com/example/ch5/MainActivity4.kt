package com.example.ch5

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainActivity4 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("MainActivity4","onCreate")
    }
    //在 onCreateView 中定義 ThirdFragment 的畫面為 fragment_third
    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("MainActivity4","onCreateView")
        return inflater.inflate(R.layout.activity_main4, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("MainActivity4","onActivityCreated")
    }
    override fun onStart() {
        super.onStart()
        Log.e("MainActivity4","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("MainActivity4","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("MainActivity4","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("MainActivity4","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("MainActivity4","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity4","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("MainActivity4","onDetach")
    }
}