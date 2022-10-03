package com.app.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    companion object {
        fun a(c: Context,message:String)  { Toast.makeText(c,message,Toast.LENGTH_SHORT).show();}
    }
}