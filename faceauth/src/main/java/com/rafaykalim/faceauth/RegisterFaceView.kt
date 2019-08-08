package com.rafaykalim.faceauth

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.google.android.gms.vision.face.FaceDetector

class RegisterFaceView : LinearLayout {

    lateinit var blinkDetector: FaceDetector
    constructor(context: Context?) : super(context)
    {
        inflate(context, R.layout.layout_register_face_view, this)

        blinkDetector = FaceDetector.Builder(context).build()
    }
}